package vn.edu.rikkei.session08.ex04;

public class Main {
    public static void main(String[] args) {

        double usd = 100;

        System.out.println("+-------------------------------------------------------+");
        System.out.println("|         BẢNG TÍNH CHUYỂN ĐỔI NGOẠI TỆ USD/VND       |");
        System.out.println("+-------------------------------------------------------+");

        System.out.printf(
                "| [Tỷ giá hiện tại] 1 USD = %,.2f VNĐ%n",
                CurrencyConverter.exchangeRate
        );

        System.out.printf(
                "| -> %,.2f USD = %,.2f VNĐ%n",
                usd,
                CurrencyConverter.toVND(usd)
        );

        System.out.println("|-------------------------------------------------------|");

        CurrencyConverter.setExchangeRate(25600.0);

        System.out.printf(
                "| [Cập nhật tỷ giá] 1 USD = %,.2f VNĐ%n",
                CurrencyConverter.exchangeRate
        );

        System.out.printf(
                "| -> %,.2f USD = %,.2f VNĐ%n",
                usd,
                CurrencyConverter.toVND(usd)
        );

        System.out.println("+-------------------------------------------------------+");

        // Kiểm tra chiều ngược lại VND -> USD
        double vnd = 2560000;

        System.out.printf(
                "%,.2f VNĐ = %,.2f USD%n",
                vnd,
                CurrencyConverter.toUSD(vnd)
        );
    }
}
