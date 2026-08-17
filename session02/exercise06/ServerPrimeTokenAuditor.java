package vn.edu.rikkei.session02.ex06;

import java.util.Scanner;

public class ServerPrimeTokenAuditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- KIỂM TOÁN MÃ KHÓA VÀNG MÁY CHỦ ---");
        System.out.print("Nhập ID bắt đầu (startId): ");
        int startId = scanner.nextInt();

        System.out.print("Nhập ID kết thúc (endId): ");
        int endId = scanner.nextInt();

        if (startId > endId) {
            System.out.println("=> Dải ID không hợp lệ. startId phải nhỏ hơn hoặc bằng endId.");
            scanner.close();
            return;
        }

        int primeCount = 0;

        System.out.println();
        System.out.println("+-------------------------------------------------------+");
        System.out.println("|         DANH SÁCH MÁY CHỦ ĐẠT MÃ KHÓA VÀNG           |");
        System.out.println("+-------------------------------------------------------+");
        System.out.printf("| Dải quét ID:                 %d đến %d%n", startId, endId);
        System.out.print("| Các ID Nguyên tố (Prime): ");

        for (int i = startId; i <= endId; i++) {
            boolean isPrime = true;

            if (i <= 1) {
                isPrime = false;
            } else {
                for (int j = 2; j * j <= i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
                primeCount++;
            }
        }

        System.out.println();
        System.out.printf("| Tổng số máy chủ đạt chuẩn:   %d máy chủ%n", primeCount);
        System.out.println("+-------------------------------------------------------+");

        scanner.close();
    }
}
