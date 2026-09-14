package abstractfactorypattern;

public class WhattsappNotification implements Notification{
    @Override
    public void getNotification(){
        System.out.println("Notification from Whattsapp");
    }
}
