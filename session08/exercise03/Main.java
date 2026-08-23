package vn.edu.rikkei.session08.ex03;

public class Main {
    public static void main(String[] args) {

        UserAccount account =
                new UserAccount("admin_rikkei", "Secret123");

        System.out.println("+-------------------------------------------------------+");
        System.out.println("|              NHẬT KÝ BẢO MẬT TÀI KHOẢN              |");
        System.out.println("+-------------------------------------------------------+");

        account.displayProfile();

        System.out.println("|-------------------------------------------------------|");

        System.out.print("[Lần 1] ");
        account.changePassword(
                "WrongPass",
                "NewPass999"
        );

        System.out.print("[Lần 2] ");
        account.changePassword(
                "Secret123",
                "NewPass999"
        );

        System.out.println("+-------------------------------------------------------+");
    }
}
