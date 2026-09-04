package vn.edu.rikkei.session11.ex04;

public class StandardAccount extends Account {

    private static final double TRANSFER_FEE = 5000;

    public StandardAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public boolean transfer(Account target, double amount) {

        double totalAmount = amount + TRANSFER_FEE;

        if (getBalance() >= totalAmount) {

            deductBalance(totalAmount);

            target.deposit(amount);

            return true;
        }

        System.out.println("Không đủ số dư để chuyển khoản!");
        return false;
    }
}
