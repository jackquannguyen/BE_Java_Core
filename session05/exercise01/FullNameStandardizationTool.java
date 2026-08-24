package vn.edu.rikkei.session05.ex01;

import java.util.Scanner;

public class FullNameStandardizationTool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- CÔNG CỤ CHUẨN HÓA HỌ TÊN HỌC VIÊN ---");
        System.out.print("Nhập họ và tên cần chuẩn hóa: ");
        String rawFullName = scanner.nextLine();

        // Xóa khoảng trắng ở đầu/cuối
        String cleanedName = rawFullName.trim();

        if (cleanedName.isEmpty()) {
            System.out.println("Họ tên không được để trống!");
            return;
        }

        // Tách chuỗi theo một hoặc nhiều khoảng trắng
        String[] words = cleanedName.split("\\s+");

        StringBuilder normalizedName = new StringBuilder();

        // Chuẩn hóa từng từ
        for (String word : words) {
            String normalizedWord =
                    word.substring(0, 1).toUpperCase()
                            + word.substring(1).toLowerCase();

            normalizedName.append(normalizedWord).append(" ");
        }

        String normalizedFullName = normalizedName.toString().trim();

        // Tạo email
        // Lấy tên chính là từ cuối cùng
        String mainName = words[words.length - 1].toLowerCase();

        StringBuilder email = new StringBuilder(mainName);

        // Lấy chữ cái đầu của họ và tên đệm
        for (int i = 0; i < words.length - 1; i++) {
            email.append(
                    words[i].substring(0, 1).toLowerCase()
            );
        }

        email.append("@rikkei.edu.vn");

        System.out.println("+-------------------------------------------------------+");
        System.out.println("|             KẾT QUẢ CHUẨN HÓA DỮ LIỆU               |");
        System.out.println("+-------------------------------------------------------+");
        System.out.println("| Chuỗi gốc:        [" + rawFullName + "]");
        System.out.println("| Họ tên chuẩn hóa: " + normalizedFullName);
        System.out.println("| Email học viện:   " + email);
        System.out.println("+-------------------------------------------------------+");

        scanner.close();
    }
}
