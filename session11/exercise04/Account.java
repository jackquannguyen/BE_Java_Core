package vn.edu.rikkei.session11.ex04;

public abstract class Account {

    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Concrete method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    /*
     * Chỉ cho lớp con sử dụng để trừ tiền.
     * balance vẫn giữ private để đảm bảo encapsulation.
     */
    protected void deductBalance(double amount) {
        balance -= amount;
    }

    // Abstract method
    public abstract boolean transfer(Account target, double amount);
}
