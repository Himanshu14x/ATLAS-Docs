package PracticeSet.atlaslearnings.day25.Task03FacadePattern;

public class BillingCounterService {
    public void payBill(String accountId, String billId, double amount) {
        System.out.println("paying for Mangoes "+ amount +"for billId "+ billId + "from account" +accountId);
    }
}