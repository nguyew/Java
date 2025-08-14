package fileops;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class BatchRenamer {
    private static final Scanner SC = new Scanner(System.in);

    public static void run() {
        System.out.println("\n[ĐỔI TÊN FILE HÀNG LOẠT]");
        File folder = askFolder("Nhập đường dẫn thư mục: ");
        if (folder == null) return;

        System.out.print("Nhập tiền tố (bỏ trống nếu không): ");
        String prefix = SC.nextLine();
        System.out.print("Nhập hậu tố (bỏ trống nếu không): ");
        String suffix = SC.nextLine();
        System.out.print("Muốn đổi đuôi (vd: .jpg), để trống nếu giữ nguyên: ");
        String newExt = SC.nextLine().trim();
        if (!newExt.isEmpty() && !newExt.startsWith(".")) newExt = "." + newExt;

        File[] files = folder.listFiles(File::isFile);
        if (files == null || files.length == 0) {
            System.out.println("⚠ Thư mục không có file.");
            return;
        }
        Arrays.sort(files);

        int count = 0;
        for (File f : files) {
            String name = f.getName();
            String base;
            String ext = "";
            int dot = name.lastIndexOf('.');
            if (dot >= 0) {
                base = name.substring(0, dot);
                ext  = name.substring(dot);
            } else {
                base = name;
            }
            String finalExt = newExt.isEmpty() ? ext : newExt;
            String newName = prefix + base + suffix + finalExt;
            File target = new File(folder, newName);
            if (f.renameTo(target)) {
                count++;
                System.out.println("✓ " + name + " → " + newName);
            } else {
                System.out.println("✗ Không đổi được: " + name);
            }
        }
        System.out.println("Hoàn tất. Đã đổi: " + count + " file.");
    }

    private static File askFolder(String prompt) {
        System.out.print(prompt);
        String path = SC.nextLine().replace("\"", "");
        File folder = new File(path);
        if (!folder.exists() || !folder.isDirectory()) {
            System.out.println("❌ Thư mục không hợp lệ.");
            return null;
        }
        return folder;
    }
}
