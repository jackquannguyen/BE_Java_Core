package vn.edu.rikkei.session05.ex04;

import java.util.Scanner;

public class PalindromeStringVerification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(
                "--- CÔNG CỤ KIỂM TRA CHUỖI ĐỐI XỨNG PALINDROME ---"
        );

        System.out.print("Nhập chuỗi văn bản: ");
        String inputText = scanner.nextLine();

        // Loại bỏ khoảng trắng, dấu câu và ký tự đặc biệt
        String cleanedText =
                inputText
                        .replaceAll("[^a-zA-Z0-9]", "")
                        .toLowerCase();

        // Đảo ngược chuỗi
        StringBuilder sb = new StringBuilder(cleanedText);

        String reversedText =
                sb.reverse().toString();

        // Kiểm tra đối xứng
        boolean isPalindrome =
                cleanedText.equals(reversedText);

        System.out.println("+-------------------------------------------------------+");
        System.out.println("|           KẾT QUẢ PHÂN TÍCH CHUỖI ĐỐI XỨNG          |");
        System.out.println("+-------------------------------------------------------+");
        System.out.println("| Chuỗi gốc:        " + inputText);
        System.out.println("| Chuỗi làm sạch:   " + cleanedText);
        System.out.println("| Chuỗi đảo ngược:  " + reversedText);
        System.out.println("|-------------------------------------------------------|");

        if (isPalindrome) {
            System.out.println(
                    "| KẾT LUẬN: LÀ CHUỖI ĐỐI XỨNG PALINDROME"
            );
        } else {
            System.out.println(
                    "| KẾT LUẬN: KHÔNG PHẢI CHUỖI ĐỐI XỨNG"
            );
        }

        System.out.println("+-------------------------------------------------------+");

        scanner.close();
    }
}
