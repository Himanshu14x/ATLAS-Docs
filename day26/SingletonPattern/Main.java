package PracticeSet.atlaslearnings.day26.SingletonPattern;

public class Main {
    public static void main(String[] args) {
        DManager dManager =  DManager.getInstance();
        dManager.addItem("Item 1");
        dManager.addItem("Item 2");
        dManager.addItem("Item 3");
        System.out.println("Items: "+dManager.getItems());

        dManager.removeItem("Item 1");
        System.out.println("After removal: "+dManager.getItems());
    }
}
