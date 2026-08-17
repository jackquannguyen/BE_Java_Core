package vn.edu.rikkei.session03.ex07;

import java.util.Scanner;

public class LuxuryBuffetPosApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double ADULT_PRICE = 350_000.0;
        final double CHILD_PRICE = 180_000.0;
        final double GROUP_DISCOUNT_RATE = 0.10;
        final double VAT_RATE = 0.08;

        double currentAdultPrice = ADULT_PRICE;
        double currentChildPrice = CHILD_PRICE;

        double totalShiftRevenue = 0.0;
        int tablesCount = 0;

        int choice;

        do {
            System.out.println();
            System.out.println("=========================================================");
            System.out.println("  HỆ THỐNG POS - RIKKEI LUXURY BUFFET RESTAURANT");
            System.out.println("=========================================================");
            System.out.println("1. Thanh toán bàn mới    | 2. Xem doanh thu ca");
            System.out.println("3. Cập nhật giá vé       | 4. Đóng ca & Thoát");
            System.out.print("Chọn chức năng (1-4): ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhập số vé Người lớn: ");
                    int adults = scanner.nextInt();

                    System.out.print("Nhập số vé Trẻ em: ");
                    int children = scanner.nextInt();

                    if (adults < 0 || children < 0) {
                        System.out.println("=> Số lượng vé không được âm.");
                        break;
                    }

                    if (adults + children == 0) {
                        System.out.println("=> Bàn phải có ít nhất 1 khách.");
                        break;
                    }

                    int totalGuests = adults + children;

                    double subtotal = adults * currentAdultPrice
                            + children * currentChildPrice;

                    double discount;

                    if (totalGuests >= 5) {
                        discount = subtotal * GROUP_DISCOUNT_RATE;
                        System.out.println("-> Tổng đoàn " + totalGuests
                                + " người -> Đủ điều kiện Ưu đãi đoàn đông 10%!");
                    } else {
                        discount = 0.0;
                    }

                    double vatAmount = (subtotal - discount) * VAT_RATE;
                    double tableTotal = subtotal - discount + vatAmount;

                    totalShiftRevenue += tableTotal;
                    tablesCount++;

                    System.out.println();
                    System.out.println("+=======================================================+");
                    System.out.println("|          HÓA ĐƠN BUFFET - RIKKEI RESTAURANT          |");
                    System.out.println("+=======================================================+");
                    System.out.printf("| Số vé Người lớn (%,.0f):      %-8d vé              |%n",
                            currentAdultPrice, adults);
                    System.out.printf("| Số vé Trẻ em (%,.0f):         %-8d vé              |%n",
                            currentChildPrice, children);
                    System.out.printf("| Tiền ăn tạm tính:             %,14.2f VNĐ        |%n",
                            subtotal);
                    System.out.printf("| Ưu đãi đoàn đông (10%%):       -%,13.2f VNĐ        |%n",
                            discount);
                    System.out.printf("| Thuế VAT (8%%):                +%,13.2f VNĐ        |%n",
                            vatAmount);
                    System.out.println("|-------------------------------------------------------|");
                    System.out.printf("| TỔNG THANH TOÁN BÀN:          %,14.2f VNĐ        |%n",
                            tableTotal);
                    System.out.println("+=======================================================+");
                    break;

                case 2:
                    System.out.println();
                    System.out.println("+-------------------------------------------------------+");
                    System.out.println("|              DOANH THU CA HIỆN TẠI                   |");
                    System.out.println("+-------------------------------------------------------+");
                    System.out.printf("| Số bàn đã thanh toán:          %-10d bàn           |%n",
                            tablesCount);
                    System.out.printf("| Tổng doanh thu tích lũy:       %,14.2f VNĐ        |%n",
                            totalShiftRevenue);
                    System.out.println("+-------------------------------------------------------+");
                    break;

                case 3:
                    System.out.println("--- CẬP NHẬT BIỂU GIÁ VÉ GIỜ VÀNG ---");
                    System.out.printf("Giá Người lớn hiện tại: %,.2f VNĐ%n", currentAdultPrice);
                    System.out.printf("Giá Trẻ em hiện tại:    %,.2f VNĐ%n", currentChildPrice);

                    System.out.print("Nhập giá vé Người lớn mới (VNĐ): ");
                    double newAdultPrice = scanner.nextDouble();

                    System.out.print("Nhập giá vé Trẻ em mới (VNĐ): ");
                    double newChildPrice = scanner.nextDouble();

                    if (newAdultPrice > 0 && newChildPrice > 0) {
                        currentAdultPrice = newAdultPrice;
                        currentChildPrice = newChildPrice;
                        System.out.println("=> Cập nhật biểu giá vé thành công.");
                    } else {
                        System.out.println("=> Giá vé phải lớn hơn 0. Không cập nhật.");
                    }
                    break;

                case 4:
                    System.out.println();
                    System.out.println("+=======================================================+");
                    System.out.println("|              BÁO CÁO CHỐT CA LÀM VIỆC                |");
                    System.out.println("+=======================================================+");
                    System.out.printf("| Tổng số bàn đã thanh toán:    %-10d bàn           |%n",
                            tablesCount);
                    System.out.printf("| Tổng doanh thu cả ca:         %,14.2f VNĐ        |%n",
                            totalShiftRevenue);
                    System.out.println("+=======================================================+");
                    System.out.println("=> Đã đóng ca làm việc. Xin chào!");
                    break;

                default:
                    System.out.println("=> Lựa chọn không hợp lệ. Vui lòng chọn từ 1 đến 4.");
                    break;
            }

        } while (choice != 4);

        scanner.close();
    }
}
