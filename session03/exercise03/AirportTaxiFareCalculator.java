package vn.edu.rikkei.session03.ex03;

import java.util.Scanner;

public class AirportTaxiFareCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double FIRST_KM_FARE = 20_000.0;
        final double KM_2_TO_20_FARE = 15_000.0;
        final double KM_21_PLUS_FARE = 12_000.0;
        final double NIGHT_SURCHARGE_RATE = 0.20;

        System.out.println("--- HỆ THỐNG TÍNH CƯỚC RIKKEI AIRPORT TAXI ---");

        System.out.print("Nhập quãng đường di chuyển (km): ");
        double km = scanner.nextDouble();

        System.out.print("Nhập giờ xuất phát (0 - 23h): ");
        int hour = scanner.nextInt();

        if (km <= 0) {
            System.out.println("=> Quãng đường phải lớn hơn 0 km.");
            scanner.close();
            return;
        }

        if (hour < 0 || hour > 23) {
            System.out.println("=> Giờ xuất phát không hợp lệ. Vui lòng nhập từ 0 đến 23.");
            scanner.close();
            return;
        }

        double baseFare;

        if (km <= 1) {
            baseFare = FIRST_KM_FARE;
        } else if (km <= 20) {
            baseFare = FIRST_KM_FARE
                    + (km - 1) * KM_2_TO_20_FARE;
        } else {
            baseFare = FIRST_KM_FARE
                    + 19 * KM_2_TO_20_FARE
                    + (km - 20) * KM_21_PLUS_FARE;
        }

        boolean isNight = hour >= 22 || hour <= 5;

        double nightSurcharge;

        if (isNight) {
            nightSurcharge = baseFare * NIGHT_SURCHARGE_RATE;
        } else {
            nightSurcharge = 0.0;
        }

        double totalFare = baseFare + nightSurcharge;
        String timeStatus = isNight ? "Khung giờ đêm" : "Khung giờ ngày";

        System.out.println();
        System.out.println("+-------------------------------------------------------+");
        System.out.println("|             HÓA ĐƠN CƯỚC PHÍ TAXI SÂN BAY            |");
        System.out.println("+-------------------------------------------------------+");
        System.out.printf("| Quãng đường di chuyển:       %8.2f km               |%n", km);
        System.out.printf("| Giờ khởi hành:               %02d:00 (%s) |%n", hour, timeStatus);
        System.out.printf("| Cước phí theo quãng đường:   %,12.2f VNĐ           |%n", baseFare);
        System.out.printf("| Phụ thu chạy đêm (20%%):      %,12.2f VNĐ           |%n", nightSurcharge);
        System.out.println("|-------------------------------------------------------|");
        System.out.printf("| TỔNG CƯỚC THANH TOÁN:        %,12.2f VNĐ           |%n", totalFare);
        System.out.println("+-------------------------------------------------------+");

        scanner.close();
    }
}
