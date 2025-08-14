import java.io.*;
import java.net.*;

public class SimpleHttpServer {
    public static void main(String[] args) {
        int port = 8080;

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("HTTP Server đang chạy tại http://localhost:" + port);

            while (true) {
                Socket clientSocket = serverSocket.accept();

                BufferedReader in = new BufferedReader(
                        new InputStreamReader(clientSocket.getInputStream()));
                String line;
                while (!(line = in.readLine()).isEmpty()) {
                    System.out.println(line);
                }

                String httpResponse =
                    "HTTP/1.1 200 OK\r\n" +
                    "Content-Type: text/html; charset=UTF-8\r\n" +
                    "\r\n" +
                    "<html><body><h1>Xin chào từ Java HTTP Server!</h1></body></html>";
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
