package vn.edu.rikkei.session07.ex01;

public class Product {
    String productId;
    String productName;
    double price;
    int quantity;

    public Product() {
        this.productId = "PRD-000";
        this.productName = "Chưa đặt tên";
        this.price = 0.0;
        this.quantity = 0;
    }

    public Product(String productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalStockValue() {
        return price * quantity;
    }

    public void displayProductInfo() {
        System.out.println("Mã SP: " + productId);
        System.out.println("Tên SP: " + productName);
        System.out.printf("Giá: %,.2f VNĐ%n", price);
        System.out.println("Số lượng: " + quantity);
        System.out.printf("Tổng giá trị kho: %,.2f VNĐ%n", getTotalStockValue());
        System.out.println("--------------------------------");
    }
}
