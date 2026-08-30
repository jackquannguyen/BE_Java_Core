package vn.edu.rikkei.session10.ex05;

public class Main {
    public static void main(String[] args) {

        double balance = 50_000_000;

        BankAccount normalAccount =
                new BankAccount(
                        "ACC-01",
                        balance
                );

        SavingsAccount savingsAccount =
                new SavingsAccount(
                        "SAVE-01",
                        balance,
                        12
                );

        double normalInterest =
                normalAccount.calculateAnnualInterest();

        double savingsInterest =
                savingsAccount.calculateAnnualInterest();

        double difference =
                savingsInterest - normalInterest;

        System.out.println("+-------------------------------------------------------+");
        System.out.println("|             BẢNG SO SÁNH TIỀN LÃI HÀNG NĂM          |");
        System.out.println("+-------------------------------------------------------+");

        System.out.printf(
                "| Số dư gốc giao dịch:     %,15.2f VNĐ        |%n",
                balance
        );

        System.out.println("|-------------------------------------------------------|");

        System.out.printf(
                "| [TK Thường - 1.2%%]:      %,15.2f VNĐ / năm  |%n",
                normalInterest
        );

        System.out.printf(
                "| [TK Tiết kiệm - 6.8%%]:   %,15.2f VNĐ / năm  |%n",
                savingsInterest
        );

        System.out.printf(
                "| -> CHÊNH LỆCH LỢI NHUẬN: +%,14.2f VNĐ        |%n",
                difference
        );

        System.out.println("+-------------------------------------------------------+");
    }
}
