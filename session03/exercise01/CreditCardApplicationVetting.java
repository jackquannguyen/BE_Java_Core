package vn.edu.rikkei.session03.ex01;

import java.util.Scanner;

public class CreditCardApplicationVetting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- HỆ THỐNG THẨM ĐỊNH HỒ SƠ TÍN DỤNG RIKKEI BANK ---");

        System.out.print("Nhập họ tên người nộp đơn: ");
        String fullName = scanner.nextLine();

        System.out.print("Nhập độ tuổi: ");
        int age = scanner.nextInt();

        System.out.print("Nhập thu nhập ròng tháng (VNĐ): ");
        double monthlyIncome = scanner.nextDouble();

        System.out.print("Khách hàng có nợ xấu không? (true/false): ");
        boolean hasBadDebt = scanner.nextBoolean();

        boolean isApproved = false;
        double creditLimit = 0.0;
        String result;
        String reason = "";

        if (age < 20 || age > 60) {
            result = "KHÔNG ĐẠT";
            reason = "Ngoài độ tuổi quy định";
        } else if (hasBadDebt) {
            result = "KHÔNG ĐẠT";
            reason = "Lịch sử tín dụng có nợ xấu";
        } else if (monthlyIncome < 10_000_000.0) {
            result = "KHÔNG ĐẠT";
            reason = "Thu nhập dưới mức tối thiểu 10 triệu VNĐ";
        } else {
            isApproved = true;
            creditLimit = monthlyIncome * 3;
            result = "ĐẠT YÊU CẦU";
        }

        String badDebtStatus = hasBadDebt ? "Có" : "Không có";

        System.out.println();
        System.out.println("+-------------------------------------------------------+");
        System.out.println("|              KẾT QUẢ THẨM ĐỊNH TÍN DỤNG              |");
        System.out.println("+-------------------------------------------------------+");
        System.out.printf("| Người nộp đơn:               %-24s |%n", fullName);
        System.out.printf("| Tuổi:                        %-24s |%n", age + " tuổi");
        System.out.printf("| Thu nhập tháng:              %,14.2f VNĐ     |%n", monthlyIncome);
        System.out.printf("| Trạng thái nợ xấu:           %-24s |%n", badDebtStatus);
        System.out.println("|-------------------------------------------------------|");
        System.out.printf("| KẾT QUẢ PHÊ DUYỆT:           %-24s |%n", result);

        if (isApproved) {
            System.out.printf("| HẠN MỨC THẺ ĐƯỢC CẤP:        %,14.2f VNĐ     |%n", creditLimit);
        } else {
            System.out.printf("| Lý do từ chối:               %-24s |%n", reason);
        }

        System.out.println("+-------------------------------------------------------+");

        scanner.close();
    }
}
