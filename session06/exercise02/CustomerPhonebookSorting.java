package vn.edu.rikkei.session06.ex02;

import java.util.Arrays;
import java.util.Scanner;

public class CustomerPhonebookSorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- CÔNG CỤ SẮP XẾP DANH BẠ VIP ---");

        int n;
        do {
            System.out.print("Nhập số lượng SĐT (N từ 3 đến 20): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Dữ liệu không hợp lệ. Vui lòng nhập số nguyên!");
                scanner.next();
                System.out.print("Nhập lại N: ");
            }

            n = scanner.nextInt();
            scanner.nextLine();

            if (n < 3 || n > 20) {
                System.out.println("N phải nằm trong khoảng từ 3 đến 20.");
            }
        } while (n < 3 || n > 20);

        String[] phoneList = new String[n];

        // SĐT Việt Nam: 10 chữ số, bắt đầu bằng 03, 05, 07, 08 hoặc 09.
        String phoneRegex = "^0[35789]\\d{8}$";

        for (int i = 0; i < phoneList.length; i++) {
            while (true) {
                System.out.print("Nhập SĐT #" + (i + 1) + ": ");
                String phone = scanner.nextLine().trim();

                if (phone.matches(phoneRegex)) {
                    phoneList[i] = phone;
                    break;
                }

                System.out.println("SĐT không hợp lệ! Vui lòng nhập lại.");
            }
        }

        // Lưu danh bạ ban đầu trước khi sắp xếp.
        String[] originalPhoneList = phoneList.clone();

        // Bubble Sort tăng dần theo thứ tự từ điển.
        for (int i = 0; i < phoneList.length - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < phoneList.length - 1 - i; j++) {
                if (phoneList[j].compareTo(phoneList[j + 1]) > 0) {
                    String temp = phoneList[j];
                    phoneList[j] = phoneList[j + 1];
                    phoneList[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }

        System.out.println();
        System.out.println("+-------------------------------------------------------+");
        System.out.println("|             DANH BẠ KHÁCH HÀNG ĐÃ SẮP XẾP            |");
        System.out.println("+-------------------------------------------------------+");
        System.out.println("| Danh bạ ban đầu:");
        System.out.println("| -> " + Arrays.toString(originalPhoneList));
        System.out.println("|-------------------------------------------------------|");
        System.out.println("| Danh bạ theo thứ tự ABC (Tăng dần):");
        System.out.println("| -> " + Arrays.toString(phoneList));
        System.out.println("+-------------------------------------------------------+");

        scanner.close();
    }
}
