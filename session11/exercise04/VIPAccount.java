package vn.edu.rikkei.session11.ex04;

public class VIPAccount extends Account {

    public VIPAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public boolean transfer(Account target, double amount) {

        if (getBalance() >= amount) {

            deductBalance(amount);

            target.deposit(amount);

            return true;
        }

        System.out.println("Không đủ số dư để chuyển khoản!");
        return false;
    }
}
