package vn.edu.rikkei.session11.ex02;

public class Main {
    public static void main(String[] args) {

        double totalAmount = 2_000_000;

        IDiscount vipDiscount = new VIPDiscount();
        IDiscount holidayDiscount = new HolidayDiscount();

        double vipPrice = vipDiscount.applyDiscount(totalAmount);
        double holidayPrice = holidayDiscount.applyDiscount(totalAmount);

        System.out.println("+-------------------------------------------------------+");
        System.out.println("|             SO SÁNH CHIẾT KHẤU ĐƠN HÀNG              |");
        System.out.println("+-------------------------------------------------------+");

        System.out.printf("| Giá trị đơn hàng gốc:     %,.2f VNĐ          |%n",
                totalAmount);

        System.out.println("|-------------------------------------------------------|");

        System.out.printf("| [VIP Discount - 15%%]:     %,.2f VNĐ          |%n",
                vipPrice);

        System.out.printf("| [Holiday Discount - 20%%]: %,.2f VNĐ          |%n",
                holidayPrice);

        System.out.println("+-------------------------------------------------------+");
    }
}
