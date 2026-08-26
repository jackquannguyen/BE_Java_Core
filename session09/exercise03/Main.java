package vn.edu.rikkei.session09.ex03;

public class Main {
    public static void main(String[] args) {

        LibraryBook book1 =
                new LibraryBook(
                        "BK-01",
                        "Lập trình Java Core",
                        "Nguyễn Văn A"
                );

        LibraryBook book2 =
                new LibraryBook(
                        "BK-02",
                        "Cấu trúc dữ liệu",
                        "Trần Văn B"
                );

        System.out.println("+-------------------------------------------------------+");
        System.out.println("|             QUẢN LÝ MƯỢN TRẢ SÁCH THƯ VIỆN          |");
        System.out.println("+-------------------------------------------------------+");

        if (book1.borrowBook()) {
            System.out.println(
                    "| [Mượn BK-01] Thành công! -> Tổng sách đang mượn: "
                            + LibraryBook.getTotalBorrowed()
            );
        }

        if (book2.borrowBook()) {
            System.out.println(
                    "| [Mượn BK-02] Thành công! -> Tổng sách đang mượn: "
                            + LibraryBook.getTotalBorrowed()
            );
        }

        if (book1.returnBook()) {
            System.out.println(
                    "| [Trả BK-01] Thành công! -> Tổng sách đang mượn: "
                            + LibraryBook.getTotalBorrowed()
            );
        }

        System.out.println("|-------------------------------------------------------|");

        System.out.println(
                "| Thống kê: Còn lại "
                        + LibraryBook.getTotalBorrowed()
                        + " sách đang được độc giả mượn"
        );

        System.out.println("+-------------------------------------------------------+");
    }
}
