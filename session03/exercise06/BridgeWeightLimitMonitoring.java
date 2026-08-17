package vn.edu.rikkei.session03.ex06;

import java.util.Scanner;

public class BridgeWeightLimitMonitoring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double MAX_ALLOWED_WEIGHT = 18.0;

        int totalVehicles = 0;
        int overloadCount = 0;
        int validCount = 0;

        double weight;
        int vehicleNumber = 1;

        System.out.println("--- TRẠM KIỂM SOÁT TẢI TRỌNG CẦU BÃI CHÁY ---");

        do {
            System.out.print("Nhập tải trọng xe số " + vehicleNumber
                    + " (Tấn, nhập -1 để kết thúc): ");
            weight = scanner.nextDouble();

            // Giá trị -1 là sentinel dùng để kết thúc ca trực.
            if (weight == -1) {
                break;
            }

            if (weight < 0) {
                System.out.println("-> Lỗi: Tải trọng không hợp lệ. Vui lòng nhập lại.");
                continue;
            }

            totalVehicles++;

            if (weight > MAX_ALLOWED_WEIGHT) {
                overloadCount++;
                System.out.println("-> VI PHẠM: Xe quá tải 18 Tấn -> Cấm qua cầu!");
            } else {
                validCount++;
                System.out.println("-> Hợp lệ: Cho phép qua cầu.");
            }

            vehicleNumber++;

        } while (true);

        double overloadRate;

        if (totalVehicles == 0) {
            overloadRate = 0.0;
        } else {
            overloadRate = (double) overloadCount / totalVehicles * 100;
        }

        String infrastructureStatus;

        if (overloadRate > 20.0) {
            infrastructureStatus = "NGUY CƠ QUÁ TẢI HẠ TẦNG CAO";
        } else {
            infrastructureStatus = "HẠ TẦNG TRONG NGƯỠNG AN TOÀN";
        }

        System.out.println();
        System.out.println("+-------------------------------------------------------+");
        System.out.println("|            BÁO CÁO TẢI TRỌNG CA TRỰC TRẠM CÂN        |");
        System.out.println("+-------------------------------------------------------+");
        System.out.printf("| Tổng số xe được kiểm tra:    %-10s              |%n",
                totalVehicles + " xe");
        System.out.printf("| Số xe hợp lệ qua cầu:        %-10s              |%n",
                validCount + " xe");
        System.out.printf("| Số xe vi phạm quá tải:       %d xe (Tỷ lệ: %.1f%%)      |%n",
                overloadCount, overloadRate);
        System.out.println("|-------------------------------------------------------|");
        System.out.printf("| ĐÁNH GIÁ HẠ TẦNG: %-34s |%n", infrastructureStatus);
        System.out.println("+-------------------------------------------------------+");

        scanner.close();
    }
}
