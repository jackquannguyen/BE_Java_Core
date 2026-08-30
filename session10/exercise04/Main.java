package vn.edu.rikkei.session10.ex04;

public class Main {
    public static void main(String[] args) {

        Shape[] shapes = {
                new Circle(5.0),
                new Rectangle(4.0, 6.0),
                new Circle(3.0)
        };

        double totalArea = 0;

        System.out.println("+-------------------------------------------------------+");
        System.out.println("|             THỐNG KÊ DIỆN TÍCH BẢN VẼ CAD           |");
        System.out.println("+-------------------------------------------------------+");

        for (int i = 0; i < shapes.length; i++) {

            Shape shape = shapes[i];

            double area = shape.getArea();

            totalArea += area;

            System.out.printf(
                    "| %d. [%-20s] | Diện tích: %8.2f cm2 |%n",
                    i + 1,
                    shape.getName(),
                    area
            );
        }

        System.out.println("|-------------------------------------------------------|");

        System.out.printf(
                "| -> TỔNG DIỆN TÍCH BẢN VẼ: %.2f cm2                 |%n",
                totalArea
        );

        System.out.println("+-------------------------------------------------------+");
    }
}
