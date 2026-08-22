package vn.edu.rikkei.session06.ex05;

import java.util.Arrays;
import java.util.Scanner;

public class WarehouseSkuBinarySearchTool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] skuList = {
                "SKU-A01",
                "SKU-B12",
                "SKU-C05",
                "SKU-D88",
                "SKU-E33",
                "SKU-F90",
                "SKU-G11"
        };

        System.out.println("--- HỆ THỐNG TRA CỨU NHỊ PHÂN KHO LẠNH SKU ---");
        System.out.println("Danh mục SKU: " + Arrays.toString(skuList));
        System.out.print("Nhập mã SKU cần tìm: ");

        String targetSku = scanner.nextLine().toUpperCase().trim();

        int left = 0;
        int right = skuList.length - 1;
        int foundIndex = -1;
        int steps = 0;

        while (left <= right) {
            steps++;

            int mid = left + (right - left) / 2;
            int cmp = skuList[mid].compareTo(targetSku);

            if (cmp == 0) {
                foundIndex = mid;
                break;
            } else if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println();
        System.out.println("+-------------------------------------------------------+");
        System.out.println("|             KẾT QUẢ TRA CỨU NHỊ PHÂN SKU             |");
        System.out.println("+-------------------------------------------------------+");
        System.out.println("| Mã tra cứu:         " + targetSku);

        if (foundIndex != -1) {
            System.out.println("| Trạng thái:         TÌM THẤY TRONG DANH MỤC");
            System.out.println("| Vị trí kệ lạnh:     Kệ số #" + foundIndex
                    + " (Index " + foundIndex + ")");
        } else {
            System.out.println("| Trạng thái:         KHÔNG TÌM THẤY");
            System.out.println("| Vị trí kệ lạnh:     Không xác định");
        }

        System.out.println("| Hiệu năng tìm kiếm: Hoàn thành sau " + steps
                + " bước chia đôi");
        System.out.println("+-------------------------------------------------------+");

        scanner.close();
    }
}
