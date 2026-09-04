package vn.edu.rikkei.session11.ex05;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle =
                new Rectangle(10, 20);

        System.out.println("+-------------------------------------------------------+");
        System.out.println("|             THỬ NGHIỆM PHÓNG TO HÌNH HỌC             |");
        System.out.println("+-------------------------------------------------------+");

        System.out.printf(
                "| [Ban đầu] Width: %.2f | Height: %.2f                 |%n",
                rectangle.getWidth(),
                rectangle.getHeight()
        );

        System.out.printf(
                "| -> Diện tích gốc: %.2f cm2                           |%n",
                rectangle.getArea()
        );

        System.out.println("|-------------------------------------------------------|");

        rectangle.resize(50);

        System.out.printf(
                "| [Sau resize +50%%] Width: %.2f | Height: %.2f         |%n",
                rectangle.getWidth(),
                rectangle.getHeight()
        );

        System.out.printf(
                "| -> DIỆN TÍCH MỚI: %.2f cm2                           |%n",
                rectangle.getArea()
        );

        System.out.println("+-------------------------------------------------------+");
    }
}
