package PracticeSet.atlaslearnings.day26.StrategyPattern;

public class Main {
    public static void main(String[] args) {
PaymentUsingStrategy cardPayment = new PaymentUsingStrategy(new CardPaymentConcreteStrategy());
cardPayment.process(500);

        PaymentUsingStrategy cashPayment = new PaymentUsingStrategy(new CashPaymentConcreteStrategy());
        cashPayment.process(250.0);

        PaymentUsingStrategy upiPayment = new PaymentUsingStrategy(new UpiPaymentConcreteStrategy());
        upiPayment.process(1000.0);
    }
}
