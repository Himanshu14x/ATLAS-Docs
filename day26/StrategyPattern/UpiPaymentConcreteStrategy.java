package PracticeSet.atlaslearnings.day26.StrategyPattern;

class UpiPaymentConcreteStrategy implements PaymentStrategy {
    public void process(double price) {
        System.out.println("payment processing using UPI: " + price);
    }
}
