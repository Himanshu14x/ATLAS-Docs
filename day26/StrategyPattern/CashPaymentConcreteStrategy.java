package PracticeSet.atlaslearnings.day26.StrategyPattern;

class CashPaymentConcreteStrategy implements PaymentStrategy {
    public void process(double price) {
        System.out.println("payment processing using cash: " + price);
    }
}
