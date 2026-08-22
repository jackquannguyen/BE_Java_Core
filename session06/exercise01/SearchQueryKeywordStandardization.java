package vn.edu.rikkei.session06.ex01;

import java.util.Scanner;

public class SearchQueryKeywordStandardization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- HỆ THỐNG LÀM SẠCH TỪ KHÓA TRUY VẤN ---");
        System.out.print("Nhập chuỗi truy vấn thô: ");
        String rawQuery = scanner.nextLine();

        // Loại bỏ ký tự đặc biệt
        String cleanQuery = rawQuery.replaceAll("[^a-zA-Z0-9\\s]", " ");

        // Chuyển về chữ thường và xóa khoảng trắng đầu/cuối
        cleanQuery = cleanQuery.toLowerCase().trim();

        // Kiểm tra trường hợp không có từ khóa hợp lệ
        if (cleanQuery.isEmpty()) {
            System.out.println("+-------------------------------------------------------+");
            System.out.println("|             KẾT QUẢ LÀM SẠCH TỪ KHÓA SEO             |");
            System.out.println("+-------------------------------------------------------+");
            System.out.println("| Không có từ khóa hợp lệ.                              |");
            System.out.println("+-------------------------------------------------------+");

            scanner.close();
            return;
        }

        // Tách chuỗi thành mảng từ khóa
        String[] words = cleanQuery.split("\\s+");

        // In kết quả
        System.out.println();
        System.out.println("+-------------------------------------------------------+");
        System.out.println("|             KẾT QUẢ LÀM SẠCH TỪ KHÓA SEO             |");
        System.out.println("+-------------------------------------------------------+");
        System.out.println("Chuỗi truy vấn gốc: [" + rawQuery + "]");
        System.out.println("Số từ khóa hợp lệ: " + words.length + " từ khóa");
        System.out.println("---------------------------------------------------------");

        for (int i = 0; i < words.length; i++) {
            System.out.printf("[%d] %-15s (%d ký tự)%n",
                    i + 1,
                    words[i],
                    words[i].length());
        }

        System.out.println("+-------------------------------------------------------+");

        scanner.close();
    }
}
