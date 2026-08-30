package vn.edu.rikkei.session10.ex05;

public class SavingsAccount extends BankAccount {

    private int termMonths;

    public SavingsAccount(String accountId,
                          double balance,
                          int termMonths) {

        super(accountId, balance);
        this.termMonths = termMonths;
    }

    public int getTermMonths() {
        return termMonths;
    }

    public void setTermMonths(int termMonths) {
        this.termMonths = termMonths;
    }

    @Override
    public double calculateAnnualInterest() {
        return getBalance() * 0.068;
    }
}
