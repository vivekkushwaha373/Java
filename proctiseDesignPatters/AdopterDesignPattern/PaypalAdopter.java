package AdopterDesignPattern;

public class PaypalAdopter implements PaymentService {
    
    PaypalGateway paypalGateway;
    
    public PaypalAdopter(PaypalGateway paypalGateway){
      this.paypalGateway = paypalGateway;
    }

    public String payment(int cId,int payId){
        Boolean done = paypalGateway.payment(Double.valueOf(cId), Double.valueOf(payId));
        if(done){
            return "SUCCESS";
        }
        else{
            return "Failure";
        }

    }


}
