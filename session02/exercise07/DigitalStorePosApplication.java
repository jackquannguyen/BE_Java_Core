package vn.edu.rikkei.session02.ex07;

import java.util.Scanner;

public class DigitalStorePosApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double VAT_RATE = 0.08;

        double subtotal = 0.0;
        double discountRate = 0.0;
        String memberRank = "Thường";

        int choice;

        do {
            System.out.println();
            System.out.println("=========================================================");
            System.out.println("  HỆ THỐNG POS RIKKEI DIGITAL STORE - CA LÀM VIỆC");
            System.out.println("=========================================================");
            System.out.println("1. Thêm mặt hàng   | 2. Áp dụng chiết khấu | 3. Xem tạm tính");
            System.out.println("4. In hóa đơn chốt | 5. Kết thúc ca làm việc");
            System.out.print("Chọn chức năng (1-5): ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhập đơn giá sản phẩm (VNĐ): ");
                    double unitPrice = scanner.nextDouble();

                    System.out.print("Nhập số lượng: ");
                    int quantity = scanner.nextInt();

                    if (unitPrice <= 0 || quantity <= 0) {
                        System.out.println("=> Đơn giá và số lượng phải lớn hơn 0.");
                        break;
                    }

                    // Sử dụng vòng lặp for để cộng nhanh N sản phẩm vào hóa đơn.
                    for (int i = 1; i <= quantity; i++) {
                        subtotal += unitPrice;
                    }

                    System.out.printf(
                            "=> Đã thêm vào giỏ. Tổng tạm tính: %,.2f VNĐ%n",
                            subtotal
                    );
                    break;

                case 2:
                    System.out.println("--- HẠNG THÀNH VIÊN ---");
                    System.out.println("1. VIP - Giảm 10%");
                    System.out.println("2. Thân thiết - Giảm 5%");
                    System.out.println("3. Thường - Giảm 0%");
                    System.out.print("Chọn hạng thành viên (1-3): ");

                    int memberChoice = scanner.nextInt();

                    switch (memberChoice) {
                        case 1:
                            discountRate = 0.10;
                            memberRank = "VIP";
                            System.out.println("=> Đã áp dụng hạng VIP - Giảm 10%.");
                            break;

                        case 2:
                            discountRate = 0.05;
                            memberRank = "Thân thiết";
                            System.out.println("=> Đã áp dụng hạng Thân thiết - Giảm 5%.");
                            break;

                        case 3:
                            discountRate = 0.0;
                            memberRank = "Thường";
                            System.out.println("=> Đã áp dụng hạng Thường - Không giảm giá.");
                            break;

                        default:
                            System.out.println("=> Hạng thành viên không hợp lệ.");
                            break;
                    }
                    break;

                case 3:
                    double previewDiscount = subtotal * discountRate;
                    double previewAfterDiscount = subtotal - previewDiscount;
                    double previewVat = previewAfterDiscount * VAT_RATE;
                    double previewTotal = previewAfterDiscount + previewVat;

                    System.out.println();
                    System.out.println("+-------------------------------------------------------+");
                    System.out.println("|              TẠM TÍNH HÓA ĐƠN HIỆN TẠI               |");
                    System.out.println("+-------------------------------------------------------+");
                    System.out.printf("| Tiền hàng:                     %,14.2f VNĐ |%n", subtotal);
                    System.out.printf("| Chiết khấu (%s - %.0f%%):       -%,13.2f VNĐ |%n",
                            memberRank, discountRate * 100, previewDiscount);
                    System.out.printf("| Thuế VAT (8%%):                 +%,13.2f VNĐ |%n", previewVat);
                    System.out.println("|-------------------------------------------------------|");
                    System.out.printf("| Tạm tính thanh toán:           %,14.2f VNĐ |%n", previewTotal);
                    System.out.println("+-------------------------------------------------------+");
                    break;

                case 4:
                    if (subtotal <= 0) {
                        System.out.println("=> Giỏ hàng đang trống. Không thể chốt thanh toán.");
                        break;
                    }

                    double discountAmount = subtotal * discountRate;
                    double amountAfterDiscount = subtotal - discountAmount;
                    double vatAmount = amountAfterDiscount * VAT_RATE;
                    double totalAmount = amountAfterDiscount + vatAmount;

                    String gift;

                    if (totalAmount > 5_000_000) {
                        gift = "Tai nghe không dây";
                    } else {
                        gift = "Voucher 50K";
                    }

                    System.out.println();
                    System.out.println("+=======================================================+");
                    System.out.println("|           HÓA ĐƠN THANH TOÁN RIKKEI DIGITAL          |");
                    System.out.println("+=======================================================+");
                    System.out.printf("| Tiền hàng hàng hóa (Subtotal):   %,14.2f VNĐ |%n", subtotal);
                    System.out.printf("| Chiết khấu %s (%.0f%%):           -%,13.2f VNĐ |%n",
                            memberRank, discountRate * 100, discountAmount);
                    System.out.printf("| Thuế VAT (8%%):                   +%,13.2f VNĐ |%n", vatAmount);
                    System.out.println("|-------------------------------------------------------|");
                    System.out.printf("| TỔNG THANH TOÁN:                 %,14.2f VNĐ |%n", totalAmount);
                    System.out.printf("| Quà tặng tri ân:                 %-20s |%n", gift);
                    System.out.println("+=======================================================+");

                    // Làm mới giỏ hàng sau khi chốt hóa đơn.
                    subtotal = 0.0;
                    discountRate = 0.0;
                    memberRank = "Thường";

                    System.out.println("=> Đã chốt đơn và làm mới giỏ hàng.");
                    break;

                case 5:
                    System.out.println("=> Kết thúc ca làm việc. Xin chào!");
                    break;

                default:
                    System.out.println("=> Lựa chọn không hợp lệ. Vui lòng chọn từ 1 đến 5.");
                    break;
            }

            // Xử lý ký tự xuống dòng còn lại sau nextInt()/nextDouble().
            scanner.nextLine();

        } while (choice != 5);

        scanner.close();
    }
}
