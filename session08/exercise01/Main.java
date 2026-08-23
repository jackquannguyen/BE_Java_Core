package vn.edu.rikkei.session08.ex01;

public class Main {
    public static void main(String[] args) {

        System.out.println("+-------------------------------------------------------+");
        System.out.println("|             THỐNG KÊ SỐ LƯỢNG SINH VIÊN             |");
        System.out.println("+-------------------------------------------------------+");

        Student sv1 = new Student("SV-01", "Nguyễn Văn An");
        System.out.print("| [SV 1] ");
        sv1.displayInfo();
        System.out.println("| -> Tổng số sinh viên hiện tại: " + Student.totalStudents);

        Student sv2 = new Student("SV-02", "Trần Thị Bình");
        System.out.print("| [SV 2] ");
        sv2.displayInfo();
        System.out.println("| -> Tổng số sinh viên hiện tại: " + Student.totalStudents);

        Student sv3 = new Student("SV-03", "Lê Hoàng Cường");
        System.out.print("| [SV 3] ");
        sv3.displayInfo();
        System.out.println("| -> Tổng số sinh viên hiện tại: " + Student.totalStudents);

        System.out.println("+-------------------------------------------------------+");
    }
}
