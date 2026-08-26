package vn.edu.rikkei.session09.ex03;

public class LibraryBook {

    private static int totalBorrowed = 0;

    private String bookId;
    private String title;
    private String author;
    private boolean isBorrowed;

    public LibraryBook(String bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    public boolean borrowBook() {

        if (!isBorrowed) {
            isBorrowed = true;
            totalBorrowed++;
            return true;
        }

        System.out.println(
                "Cảnh báo: Sách " + bookId + " đã được mượn!"
        );

        return false;
    }

    public boolean returnBook() {

        if (isBorrowed) {
            isBorrowed = false;
            totalBorrowed--;
            return true;
        }

        System.out.println(
                "Cảnh báo: Sách " + bookId + " đang ở thư viện!"
        );

        return false;
    }

    public static int getTotalBorrowed() {
        return totalBorrowed;
    }

    public void displayBook() {
        String status = isBorrowed
                ? "Đang cho mượn"
                : "Sẵn sàng";

        System.out.println(
                bookId + " | "
                        + title + " | "
                        + author + " | "
                        + status
        );
    }

    public String getBookId() {
        return bookId;
    }
}
