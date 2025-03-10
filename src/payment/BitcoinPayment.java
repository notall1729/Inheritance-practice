package payment;

public class BitcoinPayment implements PaymentStrategy{

    String walletAddress;

    public BitcoinPayment(String walletAddress){
        this.walletAddress = walletAddress;
    }
    @Override
    public void pay(double amount){
        System.out.println("Paid " + amount + " using digital Wallet.");
    }
    @Override
    public String getPaymentDetails(){
        return "Wallet Address: " +walletAddress;
    }
}