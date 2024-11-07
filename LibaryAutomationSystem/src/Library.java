import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<User> users;
    private List<Book> books;

    public Library() {
        this.users = new ArrayList<>();
        this.books = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void borrowBook(User user, Book book, int overdueDays) {
        if (overdueDays > user.getMaxBorrowDays()) {
            double fee = (overdueDays - user.getMaxBorrowDays()) * book.getDailyLateFee();
            user.addLateFee(fee);
        }
        book.incrementBorrowCount();
    }

    public User getUserWithHighestLateFee() {
        User highestLateFeeUser = null;
        double maxLateFee = 0;
        for (User user : users) {
            if (user.getLateFee() > maxLateFee) {
                maxLateFee = user.getLateFee();
                highestLateFeeUser = user;
            }
        }
        return highestLateFeeUser;
    }

    public Book getMostBorrowedBook() {
        Book mostBorrowedBook = null;
        int maxBorrowCount = 0;
        for (Book book : books) {
            if (book.getBorrowCount() > maxBorrowCount) {
                maxBorrowCount = book.getBorrowCount();
                mostBorrowedBook = book;
            }
        }
        return mostBorrowedBook;
    }
}