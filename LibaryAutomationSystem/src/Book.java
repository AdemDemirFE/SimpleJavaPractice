public class Book {
    private String title;
    private double dailyLateFee;
    private int borrowCount;

    public Book(String title, double dailyLateFee) {
        this.title = title;
        this.dailyLateFee = dailyLateFee;
        this.borrowCount = 0;
    }

    public double getDailyLateFee() {
        return dailyLateFee;
    }

    public void incrementBorrowCount() {
        this.borrowCount++;
    }

    public int getBorrowCount() {
        return borrowCount;
    }

    public String getTitle() {
        return title;
    }
}