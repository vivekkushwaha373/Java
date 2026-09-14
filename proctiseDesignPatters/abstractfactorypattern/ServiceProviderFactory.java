package abstractfactorypattern;

public interface ServiceProviderFactory  {
    
    Notification getNotification();
    Provider getProvider();

}
