package vn.edu.rikkei.session11.ex01;

public class Main {
    public static void main(String[] args) {

        PartTimeEmployee employee =
                new PartTimeEmployee(
                        "EMP-PT01",
                        "Nguyễn Văn An",
                        80,
                        45000
                );

        System.out.println("+-------------------------------------------------------+");
        System.out.println("|          THU NHẬP NHÂN VIÊN BÁN THỜI GIAN            |");
        System.out.println("+-------------------------------------------------------+");

        System.out.printf("| Mã NV: %-15s | Họ tên: %-20s |%n",
                employee.getEmpId(),
                employee.getEmpName());

        System.out.printf("| Số giờ làm: %-8d | Đơn giá: %,.0f VNĐ/giờ        |%n",
                employee.getWorkingHours(),
                employee.getHourlyRate());

        System.out.println("|-------------------------------------------------------|");

        System.out.printf("| -> THU NHẬP THỰC LĨNH: %,.2f VNĐ              |%n",
                employee.calculateSalary());

        System.out.println("+-------------------------------------------------------+");


        /*
         Employee emp = new Employee("E01", "Nguyễn Văn A");

         Dòng trên báo lỗi vì Employee là abstract class.
         Abstract class chỉ dùng làm lớp cha/khuôn mẫu,
         không thể tạo đối tượng trực tiếp bằng từ khóa new.
        */
    }
}
