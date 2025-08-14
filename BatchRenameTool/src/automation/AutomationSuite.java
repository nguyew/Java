package automation;

import fileops.BatchRenamer;
import csvops.CSVFilter;
import webops.WebFetcher;

import java.util.Scanner;

public class AutomationSuite {
    private static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== AUTOMATION SUITE ===");
            System.out.println("1) Đổi tên file hàng loạt");
            System.out.println("2) Lọc CSV và xuất ra file mới");
            System.out.println("3) Tải trang web (web scraping cơ bản)");
            System.out.println("0) Thoát");
            System.out.print("Chọn: ");
            String choice = SC.nextLine().trim();
            switch (choice) {
                case "1": BatchRenamer.run(); break;
                case "2": CSVFilter.run(); break;
                case "3": WebFetcher.run(); break;
                case "0": System.out.println("Bye!"); return;
                default: System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}
