package vn.edu.rikkei.session03.ex04;

import java.util.Scanner;

public class LuckyNumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int LUCKY_NUMBER = 72;
        final int MAX_GUESSES = 5;

        int attempts = 0;
        boolean isWon = false;

        System.out.println("--- MINI-GAME: ĐOÁN SỐ MAY MẮN (Từ 1 đến 100) ---");

        while (attempts < MAX_GUESSES) {
            System.out.printf("[Lần %d/%d] Bạn đoán số mấy?: ", attempts + 1, MAX_GUESSES);
            int guess = scanner.nextInt();

            attempts++;

            if (guess == LUCKY_NUMBER) {
                isWon = true;

                System.out.println();
                System.out.println("+=======================================================+");
                System.out.printf("|   CHÚC MỪNG! BẠN ĐÃ ĐOÁN ĐÚNG SỐ BÍ MẬT LÀ %d!       |%n", LUCKY_NUMBER);
                System.out.printf("|   Bạn đã chiến thắng chỉ sau %d lượt dự đoán!          |%n", attempts);
                System.out.println("+=======================================================+");

                break;
            } else if (guess > LUCKY_NUMBER) {
                System.out.println("-> Gợi ý: Số bí mật NHỎ HƠN số bạn đoán!");
            } else {
                System.out.println("-> Gợi ý: Số bí mật LỚN HƠN số bạn đoán!");
            }

            int remainingGuesses = MAX_GUESSES - attempts;

            if (remainingGuesses > 0) {
                System.out.println("=> Bạn còn " + remainingGuesses + " lượt đoán.");
            }
        }

        if (!isWon) {
            System.out.println();
            System.out.println("+=======================================================+");
            System.out.println("|   THUA CUỘC! BẠN ĐÃ DÙNG HẾT 5 LƯỢT DỰ ĐOÁN.          |");
            System.out.printf("|   Số bí mật chính xác là: %-28d |%n", LUCKY_NUMBER);
            System.out.println("+=======================================================+");
        }

        scanner.close();
    }
}
