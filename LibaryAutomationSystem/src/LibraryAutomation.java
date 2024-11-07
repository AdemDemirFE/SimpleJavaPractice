public class LibraryAutomation {
    public static void main(String[] args) {
        Library library = new Library();

        // Creating users and books
        User student = new User("John", 3, 15);
        User teacher = new User("Emily", 5, 30);
        User guest = new User("Michael", 1, 7);

        Book book1 = new Book("Java Programming", 2.5);
        Book book2 = new Book("Data Structures", 1.0);

        // Adding users and books to the library
        library.addUser(student);
        library.addUser(teacher);
        library.addUser(guest);

        library.addBook(book1);
        library.addBook(book2);

        // Borrowing books
        library.borrowBook(student, book1, 20); // overdue
        library.borrowBook(teacher, book2, 40); // overdue
        library.borrowBook(guest, book1, 10); // overdue

        // Finding user with the highest late fee and most borrowed book
        User highestLateFeeUser = library.getUserWithHighestLateFee();
        Book mostBorrowedBook = library.getMostBorrowedBook();

        System.out.println("User with the highest late fee: " + highestLateFeeUser.getName());
        System.out.println("Most borrowed book: " + mostBorrowedBook.getTitle());
    }
}