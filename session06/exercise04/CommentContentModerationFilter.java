package vn.edu.rikkei.session06.ex04;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CommentContentModerationFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedWords = {"scam", "hack", "spam", "fake"};

        // Tạo regex dạng: (?i)\b(scam|hack|spam|fake)\b
        StringBuilder regexBuilder = new StringBuilder("(?i)\\b(");

        for (int i = 0; i < bannedWords.length; i++) {
            regexBuilder.append(Pattern.quote(bannedWords[i]));

            if (i < bannedWords.length - 1) {
                regexBuilder.append("|");
            }
        }

        regexBuilder.append(")\\b");
        String regex = regexBuilder.toString();

        System.out.println("--- HỆ THỐNG KIỂM DUYỆT BÌNH LUẬN TỰ ĐỘNG ---");
        System.out.print("Nhập bình luận: ");
        String comment = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(comment);

        int violationCount = 0;
        StringBuilder detectedWords = new StringBuilder();

        while (matcher.find()) {
            violationCount++;

            if (detectedWords.length() > 0) {
                detectedWords.append(", ");
            }

            detectedWords.append(matcher.group().toLowerCase());
        }

        String sanitizedComment = comment.replaceAll(regex, "***");

        System.out.println();
        System.out.println("+-------------------------------------------------------+");
        System.out.println("|             KẾT QUẢ KIỂM DUYỆT NỘI DUNG              |");
        System.out.println("+-------------------------------------------------------+");
        System.out.println("| Bình luận gốc:  " + comment);

        if (violationCount > 0) {
            System.out.println("| Số từ vi phạm:  " + violationCount
                    + " từ khóa (" + detectedWords + ")");
        } else {
            System.out.println("| Số từ vi phạm:  0 từ khóa");
        }

        System.out.println("| Bình luận sạch: " + sanitizedComment);
        System.out.println("|-------------------------------------------------------|");

        if (violationCount >= 2) {
            System.out.println("| CẢNH BÁO TÀI KHOẢN: GẮN CỜ VI PHẠM (>= 2 từ cấm)    |");
        } else {
            System.out.println("| TRẠNG THÁI: Nội dung chưa đạt mức gắn cờ tài khoản.   |");
        }

        System.out.println("+-------------------------------------------------------+");

        scanner.close();
    }
}
