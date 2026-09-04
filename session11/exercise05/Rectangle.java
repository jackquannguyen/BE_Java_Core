package vn.edu.rikkei.session11.ex05;

public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void resize(double percent) {

        double ratio = 1 + percent / 100;

        width *= ratio;
        height *= ratio;
    }
}
