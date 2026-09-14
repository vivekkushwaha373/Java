package AdopterDesignPattern;

public class PaymentClient {
    PaymentService paymentService;
    public PaymentClient(PaymentService paymentService){
         this.paymentService = paymentService;
    }

    public void doPayment(){
            String res = paymentService.payment(1, 2);
            if(res.equals("SUCCESS")){
                System.out.println("Payment successful");
            }else{
                System.out.println("Payment failed");
            }
    }

}
