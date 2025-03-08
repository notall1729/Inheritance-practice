package payment;

public interface PaymentStrategy {

 public void pay(double amount);
 public String getPaymentDetails();

}
public class CreditCardPayment implements PaymentStrategy{

    String cardNumber;
    String cardHolderName;

    public CreditCardPayment(String cardNumber, String cardHolderName){
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }
    public void pay(double amount){

    }
    public String getPaymentDetails(){

    }

}

public class PayPalPayment implements PaymentStrategy{
    String email;

    public PayPalPayment(String email){
        this.email = email;
    }
    public void pay(double amount){

    }
    public String getPaymentDetails(){

    }

}

public class BitcoinPayment implements PaymentStrategy{

    String walletAddress;

    public BitcoinPayment(String walletAddress){
        this.walletAddress = walletAddress;
    }
    public void pay(double amount){

    }
    public String getPaymentDetails(){

    }
}