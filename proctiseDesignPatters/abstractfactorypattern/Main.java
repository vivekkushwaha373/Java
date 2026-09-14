package abstractfactorypattern;

public class Main {
    public static void main(String[] args) {
        ServiceProviderFactory serviceProviderFactory = new WattsappFactory();
        Notification notification = serviceProviderFactory.getNotification();
        Provider provider= serviceProviderFactory.getProvider();
        notification.getNotification();
        provider.provider();
    }
}
