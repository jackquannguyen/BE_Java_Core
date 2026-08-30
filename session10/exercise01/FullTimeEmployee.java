package vn.edu.rikkei.session10.ex01;

public class FullTimeEmployee extends Employee {
    private double allowance;

    public FullTimeEmployee(String empId,
                            String fullName,
                            double baseSalary,
                            double allowance) {

        super(empId, fullName, baseSalary);
        this.allowance = allowance;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    public double getTotalSalary() {
        return getBaseSalary() + allowance;
    }
}
