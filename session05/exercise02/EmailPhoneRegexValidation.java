package vn.edu.rikkei.session05.ex02;

import java.util.Scanner;

public class EmailPhoneRegexValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final String REGEX_EMAIL =
                "^[A-Za-z0-9._%+-]+@(rikkei\\.edu\\.vn|gmail\\.com)$";

        final String REGEX_PHONE =
                "^(03[2-9]|05[25689]|07[06789]|08[1-9]|09[0-46-9])\\d{7}$";

        System.out.println("--- HỆ THỐNG THẨM ĐỊNH FORM ĐĂNG KÝ ONLINE ---");

        System.out.print("Nhập địa chỉ Email: ");
        String email = scanner.nextLine();

        System.out.print("Nhập Số điện thoại: ");
        String phone = scanner.nextLine();

        boolean isEmailValid = email.matches(REGEX_EMAIL);
        boolean isPhoneValid = phone.matches(REGEX_PHONE);

        System.out.println("+-------------------------------------------------------+");
        System.out.println("|            KẾT QUẢ XÁC THỰC DỮ LIỆU REGEX           |");
        System.out.println("+-------------------------------------------------------+");

        System.out.println("| Email đăng ký:     " + email);

        if (isEmailValid) {
            System.out.println("| Trạng thái Email:  HỢP LỆ (Valid)");
        } else {
            System.out.println("| Trạng thái Email:  KHÔNG HỢP LỆ (Invalid)");
        }

        System.out.println("|-------------------------------------------------------|");

        System.out.println("| SĐT đăng ký:       " + phone);

        if (isPhoneValid) {
            System.out.println("| Trạng thái SĐT:    HỢP LỆ (Valid)");
        } else {
            System.out.println("| Trạng thái SĐT:    KHÔNG HỢP LỆ (Invalid)");
        }

        System.out.println("|-------------------------------------------------------|");

        if (isEmailValid && isPhoneValid) {
            System.out.println("| KẾT QUẢ CHUNG: HỒ SƠ ĐẠT CHUẨN ĐỊNH DẠNG");
        } else {
            System.out.println("| KẾT QUẢ CHUNG: HỒ SƠ CHƯA ĐẠT CHUẨN");
        }

        System.out.println("+-------------------------------------------------------+");

        scanner.close();
    }
}
