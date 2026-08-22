package vn.edu.rikkei.session07.ex02;

public class BankAccount {
    String accountNumber;
    String accountHolder;
    double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Nạp %,.2f VNĐ thành công%n", amount);
        } else {
            System.out.println("Số tiền nạp không hợp lệ");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Số tiền rút không hợp lệ");
        } else if (amount > balance) {
            System.out.println("Số dư không đủ");
        } else {
            balance -= amount;
            System.out.printf("Rút %,.2f VNĐ thành công%n", amount);
        }
    }

    public void displayBalance() {
        System.out.println("Số tài khoản: " + accountNumber);
        System.out.println("Chủ tài khoản: " + accountHolder);
        System.out.printf("Số dư: %,.2f VNĐ%n", balance);
    }
}
