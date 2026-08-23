package vn.edu.rikkei.session08.ex02;

public class Main {
    public static void main(String[] args) {

        System.out.println("+-------------------------------------------------------+");
        System.out.println("|            CẤU HÌNH HỆ THỐNG RIKKEI STORE           |");
        System.out.println("+-------------------------------------------------------+");

        System.out.println("| Tên hệ thống:      "
                + SystemConfig.SYSTEM_NAME);

        System.out.println("| Phiên bản lõi:     "
                + SystemConfig.APP_VERSION);

        System.out.printf("| Giới hạn Request:  %,d req/connection%n",
                SystemConfig.MAX_REQUESTS);

        System.out.println("+-------------------------------------------------------+");
    }
}
