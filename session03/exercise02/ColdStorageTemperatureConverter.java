package vn.edu.rikkei.session03.ex02;

import java.util.Scanner;

public class ColdStorageTemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tempC = 0.0;

        System.out.println("--- CÔNG CỤ QUY ĐỔI NHIỆT ĐỘ KHO LẠNH VACCINE ---");
        System.out.println("1. Nhập độ C (Celsius) | 2. Nhập độ F (Fahrenheit) | 3. Nhập độ K (Kelvin)");
        System.out.print("Chọn đơn vị gốc (1-3): ");
        int choice = scanner.nextInt();

        System.out.print("Nhập giá trị nhiệt độ: ");
        double inputTemperature = scanner.nextDouble();

        switch (choice) {
            case 1:
                tempC = inputTemperature;
                break;

            case 2:
                tempC = (inputTemperature - 32.0) * 5.0 / 9.0;
                break;

            case 3:
                tempC = inputTemperature - 273.15;
                break;

            default:
                System.out.println("=> Lựa chọn không hợp lệ. Vui lòng chọn từ 1 đến 3.");
                scanner.close();
                return;
        }

        double tempF = tempC * 9.0 / 5.0 + 32.0;
        double tempK = tempC + 273.15;

        String safetyStatus;

        if (tempC >= -2.0 && tempC <= 8.0) {
            safetyStatus = "AN TOÀN - ĐẠT CHUẨN BẢO QUẢN";
        } else {
            safetyStatus = "CẢNH BÁO NGUY HIỂM - VI PHẠM DẢI NHIỆT ĐỘ VACCINE";
        }

        System.out.println();
        System.out.println("+-------------------------------------------------------+");
        System.out.println("|           BẢNG QUY ĐỔI NHIỆT ĐỘ KHO BẢO QUẢN         |");
        System.out.println("+-------------------------------------------------------+");
        System.out.printf("| Nhiệt độ Celsius (C):        %10.2f °C              |%n", tempC);
        System.out.printf("| Nhiệt độ Fahrenheit (F):     %10.2f °F              |%n", tempF);
        System.out.printf("| Nhiệt độ Kelvin (K):         %10.2f K               |%n", tempK);
        System.out.println("|-------------------------------------------------------|");
        System.out.printf("| ĐÁNH GIÁ AN TOÀN: %-35s |%n", safetyStatus);
        System.out.println("+-------------------------------------------------------+");

        scanner.close();
    }
}
