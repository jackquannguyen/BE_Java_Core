package vn.edu.rikkei.session09.ex02;

public class ServerConnection {

    public static final int MAX_CONNECTIONS = 3;

    private static int activeConnections = 0;

    private String connectionId;
    private boolean isConnected = false;

    public ServerConnection(String connectionId) {
        this.connectionId = connectionId;

        if (activeConnections < MAX_CONNECTIONS) {
            isConnected = true;
            activeConnections++;

            System.out.println(
                    "[" + connectionId + "] Mở thành công! (Active: "
                            + activeConnections + "/" + MAX_CONNECTIONS + ")"
            );

        } else {
            isConnected = false;

            System.out.println(
                    "[" + connectionId
                            + "] TỪ CHỐI KẾT NỐI! Đã đạt giới hạn tối đa "
                            + activeConnections + "/" + MAX_CONNECTIONS
            );
        }
    }

    public void closeConnection() {
        if (isConnected) {
            activeConnections--;
            isConnected = false;

            System.out.println(
                    "[" + connectionId + "] Đã đóng kết nối! (Active: "
                            + activeConnections + "/" + MAX_CONNECTIONS + ")"
            );
        }
    }

    public static int getActiveConnections() {
        return activeConnections;
    }

    public boolean isConnected() {
        return isConnected;
    }

    public String getConnectionId() {
        return connectionId;
    }
}
