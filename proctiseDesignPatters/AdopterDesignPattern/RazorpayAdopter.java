package AdopterDesignPattern;

public class RazorpayAdopter implements PaymentService {
   public RazoypayGateway razoypayGateway;
   
   public RazorpayAdopter(RazoypayGateway razoypayGateway){
        this.razoypayGateway = razoypayGateway;
   }
    
     String payment(int cId,int payId){
        int a = paypalGateway.payment(cId, payId);
        if(a==1){
            return "SUCCESS";
        else
            return "Failure";
          }

    }


}
