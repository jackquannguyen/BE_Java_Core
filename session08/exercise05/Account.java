package vn.edu.rikkei.session08.ex05;

public class Account {

    private static int autoId = 1001;

    private String accountNumber;
    private String customerName;
    private double balance;

    public Account(String customerName, double balance) {

        this.accountNumber = "ACC-" + autoId;

        autoId++;

        this.customerName = customerName;
        this.balance = balance;
    }

    public void displayAccount() {

        System.out.println(
                "Mã TK: " + accountNumber
                        + " | Chủ TK: " + customerName
        );

        System.out.printf(
                "-> Số dư hiện tại: %,.0f VNĐ%n",
                balance
        );
    }
}
