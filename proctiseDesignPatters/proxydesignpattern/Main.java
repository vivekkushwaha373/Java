package proxydesignpattern;

public class Main {
    public static void main(String[] args) {
        // BankDetails loadBankDetails = new LoadBankDetails();
        BankDetails loBankDetails = new VirtualProxy();
        loBankDetails.loadDetails();

    }
}
