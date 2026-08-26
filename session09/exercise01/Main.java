package vn.edu.rikkei.session09.ex01;

public class Main {
    public static void main(String[] args) {

        InventoryItem item =
                new InventoryItem("INV-01", "Chuột không dây", 250000, 20);

        System.out.println("+-------------------------------------------------------+");
        System.out.println("|             NHẬT KÝ KIỂM DUYỆT KHO HÀNG             |");
        System.out.println("+-------------------------------------------------------+");
        System.out.println("| Mặt hàng: " + item.getItemCode()
                + " | " + item.getItemName());

        System.out.println("|-------------------------------------------------------|");

        item.setQuantity(35);

        System.out.println("| [Lần 1] Cập nhật SL = 35 => Thành công");
        System.out.println("| -> Tồn kho: " + item.getQuantity());

        System.out.println("|-------------------------------------------------------|");

        System.out.println("| [Lần 2] Cập nhật SL = -5");
        item.setQuantity(-5);

        System.out.println("| -> Số lượng tồn kho được giữ nguyên: "
                + item.getQuantity() + " sản phẩm");

        System.out.println("+-------------------------------------------------------+");
    }
}
