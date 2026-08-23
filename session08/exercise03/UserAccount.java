package vn.edu.rikkei.session08.ex03;

public class UserAccount {

    private String username;
    private String password;

    public UserAccount(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean changePassword(String oldPass, String newPass) {

        if (this.password.equals(oldPass)) {
            this.password = newPass;

            System.out.println(
                    "CẬP NHẬT THÀNH CÔNG! Mật khẩu đã được thay đổi"
            );

            return true;
        } else {
            System.out.println(
                    "Cập nhật thất bại: Mật khẩu cũ không chính xác"
            );

            return false;
        }
    }

    public void displayProfile() {
        System.out.println(
                "Tài khoản: " + username
                        + " | Mật khẩu: ********"
        );
    }
}
