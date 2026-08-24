package vn.edu.rikkei.session05.ex03;

import java.util.Scanner;

public class ServerAccessLogAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- MODULE PHÂN TÍCH SERVER ACCESS LOG ---");
        System.out.print("Nhập dòng log: ");

        String logLine = scanner.nextLine();

        // Tìm vị trí Timestamp
        int timestampStart = logLine.indexOf("[");
        int timestampEnd = logLine.indexOf("]");

        // Tìm vị trí IP
        int ipStart = logLine.indexOf("IP: ");
        int ipEnd = logLine.indexOf(" |", ipStart);

        // Tìm vị trí Status
        int statusStart = logLine.indexOf("STATUS: ");
        int statusEnd = logLine.indexOf(" |", statusStart);

        // Tìm vị trí Message
        int messageStart = logLine.indexOf("MSG: ");

        // Kiểm tra định dạng log
        if (timestampStart == -1
                || timestampEnd == -1
                || ipStart == -1
                || ipEnd == -1
                || statusStart == -1
                || statusEnd == -1
                || messageStart == -1) {

            System.out.println("Dòng log không đúng định dạng!");
            return;
        }

        // Trích xuất dữ liệu
        String timestamp =
                logLine.substring(timestampStart + 1, timestampEnd);

        String ipAddress =
                logLine.substring(ipStart + 4, ipEnd);

        String statusText =
                logLine.substring(statusStart + 8, statusEnd);

        int statusCode = Integer.parseInt(statusText);

        String message =
                logLine.substring(messageStart + 5);

        // Kiểm tra cảnh báo
        boolean hasError =
                logLine.contains("ERROR") || statusCode >= 400;

        System.out.println("+-------------------------------------------------------+");
        System.out.println("|             BÁO CÁO TRÍCH XUẤT NHẬT KÝ LOG          |");
        System.out.println("+-------------------------------------------------------+");
        System.out.println("| Thời gian (Timestamp): " + timestamp);
        System.out.println("| Địa chỉ Client IP:     " + ipAddress);
        System.out.println("| HTTP Status Code:      " + statusCode);
        System.out.println("| Nội dung thông điệp:   " + message);
        System.out.println("|-------------------------------------------------------|");

        if (hasError) {
            System.out.println(
                    "| CẢNH BÁO HỆ THỐNG: PHÁT HIỆN LỖI TRUY CẬP ("
                            + statusCode + ")"
            );
        } else {
            System.out.println(
                    "| CẢNH BÁO HỆ THỐNG: KHÔNG PHÁT HIỆN LỖI"
            );
        }

        System.out.println("+-------------------------------------------------------+");

        scanner.close();
    }
}
