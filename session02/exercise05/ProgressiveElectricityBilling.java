package vn.edu.rikkei.session02.ex05;

import java.util.Scanner;

public class ProgressiveElectricityBilling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Mức tiêu thụ theo từng bậc
        final int LEVEL_1_LIMIT = 50;
        final int LEVEL_2_LIMIT = 100;
        final int LEVEL_3_LIMIT = 200;
        final int LEVEL_4_LIMIT = 300;

        // Đơn giá điện theo từng bậc (VNĐ/kWh)
        final double LEVEL_1_PRICE = 1800.0;
        final double LEVEL_2_PRICE = 1860.0;
        final double LEVEL_3_PRICE = 2160.0;
        final double LEVEL_4_PRICE = 2720.0;
        final double LEVEL_5_PRICE = 3050.0;

        final double VAT_RATE = 0.08;

        System.out.println("--- HỆ THỐNG TÍNH HOÁ ĐƠN ĐIỆN SINH HOẠT ---");
        System.out.print("Nhập số điện tiêu thụ trong tháng (kWh): ");
        int kwh = scanner.nextInt();

        if (kwh < 0) {
            System.out.println("=> Số điện tiêu thụ không hợp lệ. kWh phải >= 0.");
            scanner.close();
            return;
        }

        double subtotal;

        if (kwh <= LEVEL_1_LIMIT) {
            subtotal = kwh * LEVEL_1_PRICE;

        } else if (kwh <= LEVEL_2_LIMIT) {
            subtotal = LEVEL_1_LIMIT * LEVEL_1_PRICE
                    + (kwh - LEVEL_1_LIMIT) * LEVEL_2_PRICE;

        } else if (kwh <= LEVEL_3_LIMIT) {
            subtotal = LEVEL_1_LIMIT * LEVEL_1_PRICE
                    + (LEVEL_2_LIMIT - LEVEL_1_LIMIT) * LEVEL_2_PRICE
                    + (kwh - LEVEL_2_LIMIT) * LEVEL_3_PRICE;

        } else if (kwh <= LEVEL_4_LIMIT) {
            subtotal = LEVEL_1_LIMIT * LEVEL_1_PRICE
                    + (LEVEL_2_LIMIT - LEVEL_1_LIMIT) * LEVEL_2_PRICE
                    + (LEVEL_3_LIMIT - LEVEL_2_LIMIT) * LEVEL_3_PRICE
                    + (kwh - LEVEL_3_LIMIT) * LEVEL_4_PRICE;

        } else {
            subtotal = LEVEL_1_LIMIT * LEVEL_1_PRICE
                    + (LEVEL_2_LIMIT - LEVEL_1_LIMIT) * LEVEL_2_PRICE
                    + (LEVEL_3_LIMIT - LEVEL_2_LIMIT) * LEVEL_3_PRICE
                    + (LEVEL_4_LIMIT - LEVEL_3_LIMIT) * LEVEL_4_PRICE
                    + (kwh - LEVEL_4_LIMIT) * LEVEL_5_PRICE;
        }

        double vatAmount = subtotal * VAT_RATE;
        double totalAmount = subtotal + vatAmount;

        System.out.println();
        System.out.println("+-------------------------------------------------------+");
        System.out.println("|             CHI TIẾT HÓA ĐƠN TIỀN ĐIỆN               |");
        System.out.println("+-------------------------------------------------------+");
        System.out.printf("| Lượng điện tiêu thụ:         %-8d kWh             |%n", kwh);
        System.out.printf("| Tiền điện chưa thuế:         %,12.2f VNĐ          |%n", subtotal);
        System.out.printf("| Thuế VAT (8%%):               %,12.2f VNĐ          |%n", vatAmount);
        System.out.println("|-------------------------------------------------------|");
        System.out.printf("| TỔNG CỘNG THANH TOÁN:        %,12.2f VNĐ          |%n", totalAmount);
        System.out.println("+-------------------------------------------------------+");

        scanner.close();
    }
}
