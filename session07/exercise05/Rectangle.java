package vn.edu.rikkei.session07.ex05;

public class Rectangle {
    double width;
    double height;

    public Rectangle(double width, double height) {
        if (width <= 0) {
            System.out.println(
                    "Chiều rộng không hợp lệ, tự động gán = 1.0"
            );
            this.width = 1.0;
        } else {
            this.width = width;
        }

        if (height <= 0) {
            System.out.println(
                    "Chiều dài không hợp lệ, tự động gán = 1.0"
            );
            this.height = 1.0;
        } else {
            this.height = height;
        }
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public void displayRectangleInfo() {
        System.out.printf("Chiều rộng: %.2f m%n", width);
        System.out.printf("Chiều dài: %.2f m%n", height);
        System.out.printf("Chu vi: %.2f m%n", getPerimeter());
        System.out.printf("Diện tích: %.2f m2%n", getArea());
        System.out.println("--------------------------------");
    }
}
