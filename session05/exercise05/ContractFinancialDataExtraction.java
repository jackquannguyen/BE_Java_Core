package vn.edu.rikkei.session05.ex05;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ContractFinancialDataExtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(
                "--- HỆ THỐNG TRÍCH XUẤT SỐ LIỆU HỢP ĐỒNG ---"
        );

        System.out.print("Nhập nội dung hợp đồng: ");
        String contractText = scanner.nextLine();

        // Regex tìm các số có từ 4 chữ số trở lên
        String regex = "\\b\\d{4,}\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(contractText);

        StringBuilder moneyList = new StringBuilder();

        double totalContractValue = 0;
        int paymentCount = 0;

        while (matcher.find()) {
            String numberText = matcher.group();

            double money =
                    Double.parseDouble(numberText);

            totalContractValue += money;
            paymentCount++;

            if (moneyList.length() > 0) {
                moneyList.append(" | ");
            }

            moneyList.append(
                    String.format("%,.0f", money)
            );
        }

        System.out.println("+-------------------------------------------------------+");
        System.out.println("|           BÁO CÁO TRÍCH XUẤT SỐ LIỆU REGEX          |");
        System.out.println("+-------------------------------------------------------+");

        if (paymentCount > 0) {
            System.out.println(
                    "| Các số tiền tìm thấy: " + moneyList
            );
        } else {
            System.out.println(
                    "| Các số tiền tìm thấy: Không tìm thấy"
            );
        }

        System.out.println(
                "| Số khoản thanh toán:  "
                        + paymentCount + " khoản"
        );

        System.out.println("|-------------------------------------------------------|");

        System.out.printf(
                "| TỔNG GIÁ TRỊ HỢP ĐỒNG: %,.2f VNĐ%n",
                totalContractValue
        );

        System.out.println("+-------------------------------------------------------+");

        scanner.close();
    }
}
