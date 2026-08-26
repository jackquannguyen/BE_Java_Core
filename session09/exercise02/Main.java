package vn.edu.rikkei.session09.ex02;

public class Main {
    public static void main(String[] args) {

        System.out.println("+-------------------------------------------------------+");
        System.out.println("|             GIÁM SÁT KẾT NỐI MÁY CHỦ RIKKEI         |");
        System.out.println("+-------------------------------------------------------+");

        ServerConnection conn1 = new ServerConnection("Conn 1");
        ServerConnection conn2 = new ServerConnection("Conn 2");
        ServerConnection conn3 = new ServerConnection("Conn 3");
        ServerConnection conn4 = new ServerConnection("Conn 4");

        System.out.println("+-------------------------------------------------------+");

        System.out.println("\nĐóng Conn 2:");
        conn2.closeConnection();

        System.out.println("\nThử mở Conn 5:");
        ServerConnection conn5 = new ServerConnection("Conn 5");
    }
}
