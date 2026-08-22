package vn.edu.rikkei.session07.ex03;

public class Employee {
    String empId;
    String empName;
    double baseSalary;
    double rate;
    double allowance;

    public Employee(String empId, String empName,
                    double baseSalary, double rate, double allowance) {
        this.empId = empId;
        this.empName = empName;
        this.baseSalary = baseSalary;
        this.rate = rate;
        this.allowance = allowance;
    }

    public double calculateTotalSalary() {
        return baseSalary * rate + allowance;
    }

    public void displayPayrollTicket() {
        System.out.println("Mã NV: " + empId);
        System.out.println("Họ tên: " + empName);
        System.out.printf("Lương cơ bản: %,.2f VNĐ%n", baseSalary);
        System.out.printf("Hệ số: %.2f%n", rate);
        System.out.printf("Phụ cấp: %,.2f VNĐ%n", allowance);
        System.out.printf("Lương thực lĩnh: %,.2f VNĐ%n",
                calculateTotalSalary());
        System.out.println("--------------------------------");
    }
}
