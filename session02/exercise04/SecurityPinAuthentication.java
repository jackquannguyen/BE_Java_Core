package vn.edu.rikkei.session02.ex04;

import java.util.Scanner;

public class SecurityPinAuthentication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final String SECRET_PIN = "889900";
        final int maxAttempts = 3;

        int attempts = 0;
        boolean isAuthenticated = false;

        System.out.println("--- CỔNG XÁC THỰC AN TOÀN HỆ THỐNG ---");

        while (attempts < maxAttempts) {
            System.out.printf("[Lần %d/%d] Nhập mã PIN bảo mật: ", attempts + 1, maxAttempts);
            String inputPin = scanner.nextLine();

            if (SECRET_PIN.equals(inputPin)) {
                isAuthenticated = true;

                System.out.println();
                System.out.println("+-------------------------------------------------------+");
                System.out.println("|  XÁC THỰC THÀNH CÔNG — CHÀO MỪNG QUẢN TRỊ VIÊN!     |");
                System.out.println("+-------------------------------------------------------+");

                break;
            }

            attempts++;
            int remainingAttempts = maxAttempts - attempts;

            if (remainingAttempts > 0) {
                System.out.println("=> Mật khẩu không chính xác! Bạn còn "
                        + remainingAttempts + " lần thử.");
            }
        }

        if (!isAuthenticated) {
            System.out.println();
            System.out.println("+-------------------------------------------------------+");
            System.out.println("| TÀI KHOẢN ĐÃ BỊ TẠM KHÓA DO NHẬP SAI QUÁ 3 LẦN!      |");
            System.out.println("+-------------------------------------------------------+");
        }

        scanner.close();
    }
}
