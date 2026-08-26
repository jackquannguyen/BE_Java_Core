package vn.edu.rikkei.session09.ex01;

public class InventoryItem {
    private String itemCode;
    private String itemName;
    private double price;
    private int quantity;

    public InventoryItem(String itemCode, String itemName, double price, int quantity) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
        setQuantity(quantity);
    }

    public String getItemCode() {
        return itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        } else {
            System.out.println("Lỗi: Số lượng tồn kho không được âm!");
        }
    }

    public void displayItem() {
        System.out.println("Mã hàng: " + itemCode);
        System.out.println("Tên hàng: " + itemName);
        System.out.printf("Giá: %,.2f VNĐ%n", price);
        System.out.println("Số lượng tồn: " + quantity);
    }
}
