package vn.edu.rikkei.session11.ex04;

public class Main {
    public static void main(String[] args) {

        StandardAccount standard =
                new StandardAccount(
                        "STD-01",
                        1_000_000
                );

        VIPAccount vip =
                new VIPAccount(
                        "VIP-01",
                        5_000_000
                );

        System.out.println("+-------------------------------------------------------+");
        System.out.println("|          NHẬT KÝ CHUYỂN KHOẢN RIKKEI BANK            |");
        System.out.println("+-------------------------------------------------------+");


        // Giao dịch 1
        boolean transaction1 =
                standard.transfer(vip, 500_000);

        System.out.printf(
                "| [GD 1 - Standard] Chuyển 500,000 + Phí 5,000 => %s%n",
                transaction1 ? "OK" : "FAIL"
        );

        System.out.printf(
                "| -> Số dư STD-01: %,.0f VNĐ | VIP-01: %,.0f VNĐ%n",
                standard.getBalance(),
                vip.getBalance()
        );

        System.out.println("|-------------------------------------------------------|");


        // Giao dịch 2
        boolean transaction2 =
                vip.transfer(standard, 1_000_000);

        System.out.printf(
                "| [GD 2 - VIP] Chuyển 1,000,000 (Miễn phí) => %s%n",
                transaction2 ? "OK" : "FAIL"
        );

        System.out.printf(
                "| -> Số dư VIP-01: %,.0f VNĐ | STD-01: %,.0f VNĐ%n",
                vip.getBalance(),
                standard.getBalance()
        );

        System.out.println("+-------------------------------------------------------+");
    }
}
