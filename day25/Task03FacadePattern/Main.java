package PracticeSet.atlaslearnings.day25.Task03FacadePattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Facade Method DP - Structural Design Pattern");
        MallFacade mallFacade = new MallFacade();
        mallFacade.getItems("Fruits");
        mallFacade.payBill("123", "billno 44", 500.0);
    }
}
