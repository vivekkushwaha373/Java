package factorydesingpattern;

// simple factory class

class NotificationFactory(
    
    
    public static Notification GetNotification(String notificationtype){
     
        if(notificationtype.equals("email")){
            return new EmailNotification();
        }
        else if(notificationtype.equals("whattup")){
            return new WhattupNotification();
        }
        else
        {
            throw new RuntimeException("Error Getting Notification");
        }
     
    
    
    }


)


public class SendNotification {
    public static void main(String[] args) {
        
        NotificationFactory.GetNotification("whattup").send();
        
    }
}
