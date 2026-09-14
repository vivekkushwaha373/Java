package factorydesingpattern;

public class EmailNotification implements Notification {
    public void send(){
        System.out.println("Notiofaction from Email");
    }
}
