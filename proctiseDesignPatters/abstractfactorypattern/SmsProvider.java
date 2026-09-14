package abstractfactorypattern;

public class SmsProvider implements Provider {
    @Override
    public void provider(){
        System.out.println("Sms provider called");
    }
}
