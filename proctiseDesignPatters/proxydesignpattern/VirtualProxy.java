package proxydesignpattern;

public class VirtualProxy implements BankDetails {

      private BankDetails bankDetails;
      
      VirtualProxy(){
        System.out.println("Bank details is ready to be loaded");
      }

      public void loadDetails(){
        if(bankDetails == null){
            bankDetails = new LoadBankDetails();
        }else
        {
            bankDetails.loadDetails();
        }
      }

    
}
