package vn.edu.rikkei.session10.ex03;

public class Main {
    public static void main(String[] args) {

        BonusCalculator calculator = new BonusCalculator();

        double salary = 10_000_000;

        double bonus1 =
                calculator.calculateBonus(salary);

        double bonus2 =
                calculator.calculateBonus(salary, 1.5);

        double bonus3 =
                calculator.calculateBonus(salary, 1.5, 4);

        System.out.println("+-------------------------------------------------------+");
        System.out.println("|             BÁO CÁO TIỀN THƯỞNG CUỐI NĂM            |");
        System.out.println("+-------------------------------------------------------+");

        System.out.printf(
                "| Lương cơ bản chuẩn:      %,15.2f VNĐ        |%n",
                salary
        );

        System.out.println("|-------------------------------------------------------|");

        System.out.printf(
                "| [TH1 - Cố định 10%%]:    %,15.2f VNĐ        |%n",
                bonus1
        );

        System.out.printf(
                "| [TH2 - Theo KPI 1.5]:    %,15.2f VNĐ        |%n",
                bonus2
        );

        System.out.printf(
                "| [TH3 - KPI + 4 năm]:     %,15.2f VNĐ        |%n",
                bonus3
        );

        System.out.println("+-------------------------------------------------------+");
    }
}
