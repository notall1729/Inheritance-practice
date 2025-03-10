import payment.*;

public class Main {
    public static void main(String[] args) {
        RegularCustomer regularCustomer1 = new RegularCustomer("Fatemeh");
        RegularCustomer regularCustomer2 = new RegularCustomer("Aryan");
        PremiumCustomer premiumCustomer = new PremiumCustomer("Hananeh");

        PayPalPayment payPalPayment = new PayPalPayment("Hananeh6778@gmail.com");
        BitcoinPayment bitcoinPayment = new BitcoinPayment("1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa");
        CreditCardPayment creditCardPayment = new CreditCardPayment("1234 5678 9012 3456", "Areyan Karimi");

        regularCustomer1.displayCustomerInfo();
        regularCustomer2.displayCustomerInfo();
        premiumCustomer.displayCustomerInfo();
        printLine();

        regularCustomer1.makePayment(bitcoinPayment,2000000);
        regularCustomer1.makePayment(bitcoinPayment, 500000);
        regularCustomer2.makePayment(creditCardPayment, 7000000);
        regularCustomer2.makePayment(creditCardPayment, 67000);
        premiumCustomer.makePayment(payPalPayment, 475000);
        premiumCustomer.makePayment(payPalPayment, 8690000);
        printLine();

        regularCustomer1.showPaymentHistory();
        printLine();

        regularCustomer2.showPaymentHistory();
        printLine();

        premiumCustomer.showPaymentHistory();
        printLine();

    }
    public static void printLine(){
        System.out.println("---------------------------------------------------");
        System.out.println();
    }
}