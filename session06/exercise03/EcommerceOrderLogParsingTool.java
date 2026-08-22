package vn.edu.rikkei.session06.ex03;

public class EcommerceOrderLogParsingTool {
    public static void main(String[] args) {
        String[] logs = {
                "ORD-001|2026-08-03|2500000.0|SUCCESS",
                "ORD-002|2026-08-03|1200000.0|CANCELLED",
                "ORD-003|2026-08-03|4800000.0|SUCCESS",
                "ORD-004|2026-08-03|850000.0|SUCCESS",
                "ORD-005|2026-08-03|3200000.0|FAILED"
        };

        double totalRevenue = 0;
        int successCount = 0;

        String maxOrderCode = "";
        double maxOrderValue = -1;

        System.out.println("--- MODULE PHÂN TÍCH GIAO DỊCH E-COMMERCE ---");
        System.out.println("Đang xử lý " + logs.length + " dòng nhật ký giao dịch...");

        for (String log : logs) {
            String[] parts = log.split("\\|");

            // Mỗi log hợp lệ phải có đúng 4 trường dữ liệu.
            if (parts.length != 4) {
                continue;
            }

            String orderCode = parts[0];
            String amountText = parts[2];
            String status = parts[3];

            if (status.equals("SUCCESS")) {
                try {
                    double amount = Double.parseDouble(amountText);

                    totalRevenue += amount;
                    successCount++;

                    if (amount > maxOrderValue) {
                        maxOrderValue = amount;
                        maxOrderCode = orderCode;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Bỏ qua dữ liệu tiền không hợp lệ của đơn: " + orderCode);
                }
            }
        }

        System.out.println();
        System.out.println("+-------------------------------------------------------+");
        System.out.println("|          BÁO CÁO DOANH THU ĐƠN HÀNG THÀNH CÔNG       |");
        System.out.println("+-------------------------------------------------------+");
        System.out.printf("| Tổng số giao dịch xử lý:        %d đơn hàng%n", logs.length);
        System.out.printf("| Giao dịch thành công (SUCCESS): %d đơn hàng%n", successCount);
        System.out.println("|-------------------------------------------------------|");
        System.out.printf("| TỔNG DOANH THU HỢP LỆ:          %,.2f VNĐ%n", totalRevenue);

        if (successCount > 0) {
            System.out.printf("| ĐƠN HÀNG LỚN NHẤT:              %s (%,.0f VNĐ)%n",
                    maxOrderCode, maxOrderValue);
        } else {
            System.out.println("| ĐƠN HÀNG LỚN NHẤT:              Không có");
        }

        System.out.println("+-------------------------------------------------------+");
    }
}
