package proxydesignpattern;

public class LoadBankDetails implements BankDetails {

    public LoadBankDetails() {
        System.out.println("Bank Details are being Loaded...");
        loadDetails();
    }

    public void loadDetails(){
        try{
           Thread.sleep(5000);
        }catch(InterruptedException e){

        }finally{
            System.out.println("Details fetched");
        }
    }


}