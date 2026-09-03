package vn.edu.rikkei.session11.ex02;

public class VIPDiscount implements IDiscount {

    @Override
    public double applyDiscount(double totalAmount) {
        return totalAmount * 0.85;
    }
}
