package PracticeSet.atlaslearnings.day20.SRP;

public class BookDiscountCalculator {
    public double calculateDiscountedPrice(Book book, double discountPercentage) {
        return book.getPrice() * (1 - discountPercentage);
    }
}
