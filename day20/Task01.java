package PracticeSet.atlaslearnings.day20;


 class BankNotifications {
    public void sendOTP(String via) {
        if (via.equals("email")) {
            System.out.println(("email sent to your mail id"));
        }
    }
}


 interface BankNotifications1  {
    public void sendOTP(String via);
}

class EmailNotify implements BankNotifications1  {
    public void sendOTP(String via) {
        System.out.println(("email sent to your mail id"));
    }

}
class MobileNotify implements BankNotifications1  {
    public void sendOTP(String via) {
        System.out.println(("msg sent to your Mobile no"));
    }

}
class WhatsappNotify implements BankNotifications1  {
    public void sendOTP(String via) {
        System.out.println(("msg sent to your whatsapp "));
    }

}


public class Task01 {
}
