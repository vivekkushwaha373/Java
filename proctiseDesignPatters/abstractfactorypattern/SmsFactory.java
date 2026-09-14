package abstractfactorypattern;

public class SmsFactory implements ServiceProviderFactory {
    @Override
    public Notification getNotification() {
        return new SmsNotification();
    }

    @Override
    public Provider getProvider() {
        return new SmsProvider();
    }
}
