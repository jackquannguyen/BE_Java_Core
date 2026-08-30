package vn.edu.rikkei.session10.ex04;

public class Circle extends Shape {

    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return Math.PI * r * r;
    }

    @Override
    public String getName() {
        return String.format("Circle r=%.1f", r);
    }
}
