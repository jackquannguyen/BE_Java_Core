package vn.edu.rikkei.session03.ex05;

import java.util.Scanner;

public class AirlineFlightTimeStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- THỐNG KÊ HOẠT ĐỘNG BAY RIKKEI AIRLINES ---");
        System.out.print("Nhập số chuyến bay cần thống kê (N): ");
        int totalFlights = scanner.nextInt();

        double totalFlightHours = 0.0;
        int validFlights = 0;

        for (int i = 1; i <= totalFlights; i++) {
            System.out.print("Nhập giờ bay của Chuyến số " + i + ": ");
            double flightHour = scanner.nextDouble();

            if (flightHour <= 0) {
                if (flightHour == 0) {
                    System.out.println("-> Cảnh báo: Chuyến bay số " + i
                            + " bị hủy (0 giờ) -> Bỏ qua thống kê.");
                } else {
                    System.out.println("-> Cảnh báo: Chuyến bay số " + i
                            + " lỗi dữ liệu -> Bỏ qua thống kê.");
                }
                continue;
            }

            totalFlightHours += flightHour;
            validFlights++;
        }

        System.out.println();
        System.out.println("+-------------------------------------------------------+");
        System.out.println("|             BÁO CÁO THỐNG KÊ HOẠT ĐỘNG BAY           |");
        System.out.println("+-------------------------------------------------------+");
        System.out.printf("| Tổng chuyến bay thống kê:    %-10s             |%n",
                totalFlights + " chuyến");
        System.out.printf("| Số chuyến bay thành công:    %-10s             |%n",
                validFlights + " chuyến");
        System.out.printf("| Tổng giờ bay tích lũy:       %8.2f giờ              |%n",
                totalFlightHours);

        if (validFlights == 0) {
            System.out.printf("| Thời gian bay bình quân:     %-22s |%n",
                    "Không có dữ liệu");
        } else {
            double averageFlightHours = totalFlightHours / validFlights;
            System.out.printf("| Thời gian bay bình quân:     %8.2f giờ/chuyến       |%n",
                    averageFlightHours);
        }

        System.out.println("+-------------------------------------------------------+");

        scanner.close();
    }
}
