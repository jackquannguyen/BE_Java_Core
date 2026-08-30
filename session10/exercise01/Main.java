package vn.edu.rikkei.session10.ex01;

public class Main {
    public static void main(String[] args) {

        FullTimeEmployee employee =
                new FullTimeEmployee(
                        "EMP-01",
                        "Nguyễn Văn An",
                        10_000_000,
                        2_500_000
                );

        System.out.println("+-------------------------------------------------------+");
        System.out.println("|              HỒ SƠ NHÂN VIÊN CHÍNH THỨC             |");
        System.out.println("+-------------------------------------------------------+");

        employee.displayInfo();

        System.out.printf("| Phụ cấp thâm niên: %,15.0f VNĐ                  |%n",
                employee.getAllowance());

        System.out.println("|-------------------------------------------------------|");

        System.out.printf("| -> TỔNG THU NHẬP: %,18.0f VNĐ                  |%n",
                employee.getTotalSalary());

        System.out.println("+-------------------------------------------------------+");
    }
}
