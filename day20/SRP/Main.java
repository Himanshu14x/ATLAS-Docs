package PracticeSet.atlaslearnings.day20.SRP;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Effective Java", "Joshua Bloch", 500.0);

        BookFormatter formatter = new BookFormatter();
        BookDiscountCalculator discountCalculator = new BookDiscountCalculator();

        System.out.println(formatter.getFormattedTitle(book));
        System.out.println("Discounted Price: ₹" + discountCalculator.calculateDiscountedPrice(book, 0.1));
    }
}

