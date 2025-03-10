package payment;

import java.util.ArrayList;

public abstract class Customer {
String name;
ArrayList<String> paymentHistory;

public Customer(String name){
    this.name = name;
    paymentHistory = new ArrayList<>();
}
    public abstract void displayCustomerInfo();
     public void makePayment(PaymentStrategy paymentStrategy, double amount){
     paymentStrategy.pay(amount);
     paymentHistory.add("Amount: " + amount + "by" + paymentStrategy.getPaymentDetails());
     paymentHistory.add(paymentStrategy.getPaymentDetails());
     }

    public void showPaymentHistory() {
         System.out.println("Payment History for " + name + ":");
         for(int i = 0; i<paymentHistory.size(); i++)
             System.out.println(paymentHistory.get(i));
    }
}


