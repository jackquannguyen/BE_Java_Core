package vn.edu.rikkei.session09.ex04;

public class Main {
    public static void main(String[] args) {

        double r = 5.0;
        double h = 10.0;

        double perimeter =
                GeometryUtils.circlePerimeter(r);

        double area =
                GeometryUtils.circleArea(r);

        double volume =
                GeometryUtils.cylinderVolume(r, h);

        System.out.println("+-------------------------------------------------------+");
        System.out.println("|           BÁO CÁO THỐNG KÊ HÌNH HỌC ĐƯỜNG TRÒN       |");
        System.out.println("+-------------------------------------------------------+");

        System.out.printf("| Bán kính (r):             %.2f cm%n", r);
        System.out.printf("| Chiều cao trụ (h):        %.2f cm%n", h);

        System.out.println("|-------------------------------------------------------|");

        System.out.printf("| CHU VI HÌNH TRÒN:         %.2f cm%n", perimeter);
        System.out.printf("| DIỆN TÍCH HÌNH TRÒN:      %.2f cm2%n", area);
        System.out.printf("| THỂ TÍCH HÌNH TRỤ:        %.2f cm3%n", volume);

        System.out.println("+-------------------------------------------------------+");
    }
}
