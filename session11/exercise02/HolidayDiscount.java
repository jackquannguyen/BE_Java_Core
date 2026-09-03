package vn.edu.rikkei.session11.ex02;

public class HolidayDiscount implements IDiscount {

    @Override
    public double applyDiscount(double totalAmount) {
        return totalAmount * 0.80;
    }
}
