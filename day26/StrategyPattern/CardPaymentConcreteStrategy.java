package PracticeSet.atlaslearnings.day26.StrategyPattern;

public class CardPaymentConcreteStrategy implements PaymentStrategy {
    public void process(double price) {
        System.out.println("payment processing using card" + price);
    }
}
