package AdopterDesignPattern;

public class Main {
    public static void main(String[] args) {
        
        PaymentClient paymentClient = new PaymentClient(new PaypalAdopter(new PaypalGateway()));

        paymentClient.doPayment();

        

    }
}
