package abstractfactorypattern;

public class SmsNotification implements Notification {
    
    @Override
    public void getNotification(){
        System.out.println("Notification from Sms");
    }
}
