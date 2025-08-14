package csvops;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class CSVFilter {
    private static final Scanner SC = new Scanner(System.in);

    public static void run() {
        System.out.println("\n[LỌC CSV → CSV MỚI]");
        System.out.print("Đường dẫn CSV nguồn: ");
        String srcPath = SC.nextLine().trim();
        File src = new File(srcPath);
        if (!src.exists() || !src.isFile()) {
            System.out.println("❌ CSV không tồn tại.");
            return;
        }

        System.out.print("Dấu phân cách (mặc định ,): ");
        String sep = SC.nextLine();
        if (sep.isEmpty()) sep = ",";

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream(src), StandardCharsets.UTF_8))) {

            String header = br.readLine();
            if (header == null) {
                System.out.println("❌ CSV rỗng.");
                return;
            }
            String[] cols = header.split(sep, -1);
            System.out.println("Cột: " + Arrays.toString(cols));

            // nhiều điều kiện
            List<Condition> conditions = new ArrayList<>();
            while (true) {
                System.out.print("Chọn tên cột để lọc: ");
                String colName = SC.nextLine().trim();
                int colIndex = indexOf(cols, colName);
                if (colIndex < 0) {
                    System.out.println("❌ Không tìm thấy cột.");
                    continue;
                }
                System.out.print("Toán tử (==, !=, contains, >, >=, <, <=): ");
                String op = SC.nextLine().trim();
                System.out.print("Giá trị so sánh: ");
                String val = SC.nextLine();
                conditions.add(new Condition(colIndex, op, val));

                System.out.print("Thêm điều kiện nữa? (y/n): ");
                String more = SC.nextLine().trim();
                if (!more.equalsIgnoreCase("y")) break;
            }

            System.out.print("Nối điều kiện bằng (AND/OR): ");
            String logic = SC.nextLine().trim().toUpperCase();
            if (!logic.equals("AND") && !logic.equals("OR")) logic = "AND";

            // chọn cột xuất
            System.out.print("Nhập tên các cột muốn xuất, cách nhau bởi dấu phẩy (để trống = xuất tất cả): ");
            String colSelect = SC.nextLine().trim();
            int[] colIndices;
            if (colSelect.isEmpty()) {
                colIndices = new int[cols.length];
                for (int i = 0; i < cols.length; i++) colIndices[i] = i;
            } else {
                String[] selected = colSelect.split(",");
                colIndices = new int[selected.length];
                for (int i = 0; i < selected.length; i++) {
                    int idx = indexOf(cols, selected[i].trim());
                    if (idx < 0) {
                        System.out.println("❌ Cột không tồn tại: " + selected[i]);
                        return;
                    }
                    colIndices[i] = idx;
                }
            }

            System.out.print("Đường dẫn CSV xuất (vd: filtered.csv): ");
            String outPath = SC.nextLine().trim();
            if (outPath.isEmpty()) outPath = "filtered.csv";

            int kept = 0, total = 0;
            try (BufferedWriter bw = new BufferedWriter(
                    new OutputStreamWriter(new FileOutputStream(outPath), StandardCharsets.UTF_8))) {

                // ghi header
                for (int i = 0; i < colIndices.length; i++) {
                    if (i > 0) bw.write(sep);
                    bw.write(cols[colIndices[i]]);
                }
                bw.newLine();

                String line;
                while ((line = br.readLine()) != null) {
                    total++;
                    String[] parts = line.split(sep, -1);
                    if (parts.length < cols.length) continue;

                    boolean match = logic.equals("AND");
                    for (Condition cond : conditions) {
                        boolean ok = match(parts[cond.colIndex], cond.op, cond.val);
                        if (logic.equals("AND")) {
                            match &= ok;
                            if (!match) break;
                        } else {
                            match |= ok;
                            if (match) break;
                        }
                    }
                    if (match) {
                        kept++;
                        for (int i = 0; i < colIndices.length; i++) {
                            if (i > 0) bw.write(sep);
                            bw.write(parts[colIndices[i]]);
                        }
                        bw.newLine();
                    }
                }
            }
            System.out.println("Xong. Giữ " + kept + " / " + total + " dòng. File xuất: " + outPath);

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("❌ Lỗi đọc/ghi CSV.");
        }
    }

    private static int indexOf(String[] arr, String name) {
        for (int i = 0; i < arr.length; i++) {
            if (name.equals(arr[i])) return i;
        }
        return -1;
    }
    private static boolean isNumber(String s) {
        try { Double.parseDouble(s); return true; } catch (Exception e) { return false; }
    }
    private static boolean match(String cell, String op, String val) {
        switch (op) {
            case "==": return cell.equals(val);
            case "!=": return !cell.equals(val);
            case "contains": return cell.contains(val);
            case ">":
            case ">=":
            case "<":
            case "<=":
                if (isNumber(cell) && isNumber(val)) {
                    double a = Double.parseDouble(cell);
                    double b = Double.parseDouble(val);
                    switch (op) {
                        case ">":  return a > b;
                        case ">=": return a >= b;
                        case "<":  return a < b;
                        case "<=": return a <= b;
                    }
                }
                return false;
            default: return false;
        }
    }

    private static class Condition {
        int colIndex; String op; String val;
        Condition(int colIndex, String op, String val) {
            this.colIndex = colIndex;
            this.op = op;
            this.val = val;
        }
    }
}
