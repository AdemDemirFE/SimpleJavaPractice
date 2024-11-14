public class User {
    private String name;
    private int maxBookLimit;
    private int maxBorrowDays;
    private double lateFee;

    public User(String name, int maxBookLimit, int maxBorrowDays) {
        this.name = name;
        this.maxBookLimit = maxBookLimit;
        this.maxBorrowDays = maxBorrowDays;
        this.lateFee = 0;
    }

    public void addLateFee(double amount) {
        this.lateFee += amount;
    }

    public double getLateFee() {
        return lateFee;
    }

    public String getName() {
        return name;
    }

    public int getMaxBookLimit() {
        return maxBookLimit;
    }

    public int getMaxBorrowDays() {
        return maxBorrowDays;
    }
}