package vn.edu.rikkei.session02.ex02;

import java.util.Scanner;

public class MiniAtmNavigationMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = 5_000_000.0;
        int choice;

        do {
            System.out.println();
            System.out.println("--- MENU GIAO DỊCH ATM MINI ---");
            System.out.println("1. Xem số dư | 2. Nộp tiền | 3. Rút tiền | 4. Thoát");
            System.out.print("Chọn chức năng (1-4): ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("+-------------------------------------------------------+");
                    System.out.printf("| SỐ DƯ HIỆN TẠI:              %,15.2f VNĐ |%n", balance);
                    System.out.println("+-------------------------------------------------------+");
                    break;

                case 2:
                    System.out.print("Nhập số tiền cần nộp: ");
                    double depositAmount = scanner.nextDouble();

                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.printf(
                                "=> Nộp thành công %,.2f VNĐ. Số dư mới: %,.2f VNĐ%n",
                                depositAmount,
                                balance
                        );
                    } else {
                        System.out.println("=> Số tiền nộp phải lớn hơn 0.");
                    }
                    break;

                case 3:
                    System.out.print("Nhập số tiền cần rút: ");
                    double withdrawAmount = scanner.nextDouble();

                    if (withdrawAmount > 0 && withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.printf(
                                "=> Rút thành công %,.2f VNĐ. Số dư mới: %,.2f VNĐ%n",
                                withdrawAmount,
                                balance
                        );
                    } else if (withdrawAmount <= 0) {
                        System.out.println("=> Số tiền rút phải lớn hơn 0.");
                    } else {
                        System.out.println("=> Số dư không đủ để thực hiện giao dịch.");
                    }
                    break;

                case 4:
                    System.out.println("=> Cảm ơn quý khách đã sử dụng dịch vụ ATM. Xin chào!");
                    break;

                default:
                    System.out.println("=> Lựa chọn không hợp lệ. Vui lòng chọn từ 1 đến 4.");
                    break;
            }

        } while (choice != 4);

        scanner.close();
    }
}
