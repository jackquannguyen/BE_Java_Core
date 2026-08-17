package vn.edu.rikkei.session02.ex01;

import java.util.Scanner;

public class CustomerMembershipClassification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- HỆ THỐNG PHÂN HẠNG THÀNH VIÊN CRM ---");
        System.out.print("Nhập tổng chi tiêu tích lũy (VNĐ): ");

        double totalSpending = scanner.nextDouble();

        String membershipRank;
        double discountRate;

        // Kiểm tra điều kiện biên
        if (totalSpending < 2_000_000) {
            membershipRank = "Đồng (Bronze)";
            discountRate = 2.0;
        } else if (totalSpending < 5_000_000) {
            membershipRank = "Bạc (Silver)";
            discountRate = 5.0;
        } else if (totalSpending < 15_000_000) {
            membershipRank = "Vàng (Gold)";
            discountRate = 10.0;
        } else {
            membershipRank = "Kim Cương (Diamond)";
            discountRate = 15.0;
        }

        boolean isVip;
        String customerGroup;

        // Khách hàng VIP nếu tỷ lệ chiết khấu từ 10% trở lên.
        if (discountRate >= 10.0) {
            isVip = true;
            customerGroup = "Khách hàng VIP";
        } else {
            isVip = false;
            customerGroup = "Khách hàng Tiêu chuẩn";
        }

        System.out.println();
        System.out.println("+-------------------------------------------------------+");
        System.out.println("|              KẾT QUẢ PHÂN HẠNG THÀNH VIÊN            |");
        System.out.println("+-------------------------------------------------------+");
        System.out.printf("| %-30s %,15.2f VNĐ |%n", "Tổng chi tiêu:", totalSpending);
        System.out.printf("| %-30s %-20s |%n", "Hạng thẻ thành viên:", membershipRank);
        System.out.printf("| %-30s %-20s |%n", "Tỷ lệ chiết khấu ưu đãi:", discountRate + "%");
        System.out.printf("| %-30s %-20s |%n", "Nhóm khách hàng:", customerGroup);
        System.out.println("+-------------------------------------------------------+");

        scanner.close();
    }
}
