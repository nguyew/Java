package webops;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.regex.*;

public class WebFetcher {
    private static final Scanner SC = new Scanner(System.in);

    public static void run() {
        System.out.println("\n[TẢI TRANG WEB]");
        System.out.print("Nhập URL: ");
        String url = SC.nextLine().trim();

        System.out.print("Lưu HTML vào file (vd: page.html): ");
        String out = SC.nextLine().trim();
        if (out.isEmpty()) out = "page.html";

        try {
            String html = httpGet(url);
            try (OutputStream os = new FileOutputStream(out)) {
                os.write(html.getBytes(StandardCharsets.UTF_8));
            }
            System.out.println("✓ Đã lưu HTML vào: " + out);

            System.out.print("Muốn trích dữ liệu bằng regex? (để trống để bỏ qua): ");
            String regex = SC.nextLine();
            if (!regex.isEmpty()) {
                List<String> matches = findAll(html, regex);
                if (matches.isEmpty()) {
                    System.out.println("Không tìm thấy kết quả.");
                } else {
                    System.out.println("Kết quả:");
                    for (int i = 0; i < matches.size(); i++) {
                        System.out.println("[" + (i+1) + "] " + matches.get(i));
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("❌ Lỗi khi tải trang.");
        }
    }

    private static String httpGet(String urlStr) throws IOException {
        URL url = new URL(urlStr);
        HttpURLConnection c = (HttpURLConnection) url.openConnection();
        c.setRequestMethod("GET");
        c.setConnectTimeout(15000);
        c.setReadTimeout(15000);
        c.setRequestProperty("User-Agent", "Mozilla/5.0");
        try (InputStream is = c.getInputStream()) {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] buf = new byte[8192];
            int r;
            while ((r = is.read(buf)) != -1) baos.write(buf, 0, r);
            return new String(baos.toByteArray(), StandardCharsets.UTF_8);
        }
    }

    private static List<String> findAll(String text, String regex) {
        List<String> out = new ArrayList<>();
        Pattern p = Pattern.compile(regex, Pattern.DOTALL | Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(text);
        while (m.find()) {
            out.add(m.groupCount() >= 1 ? m.group(1) : m.group());
        }
        return out;
    }
}
