package abstractfactorypattern;

public class WattsappFactory implements ServiceProviderFactory {
    @Override
    public Notification getNotification(){
        return new WhattsappNotification();
    }
    @Override
    public Provider getProvider(){
       return new WhattsappProvider();
    }
}
