package PracticeSet.atlaslearnings.day37.day37Test.Main;

public class BookService {
    private final BookRepository bookRepository;


    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    public boolean isBookCountLow() {
        int count = bookRepository.getBookCount();
        System.out.println("Real method isBookCountLow() called.");
        return count < 10;
    }


    public String getBookServiceStatus() {
        if (isBookCountLow()) {
            return "LOW_STOCK";
        }
        return "IN_STOCK";
    }
}

