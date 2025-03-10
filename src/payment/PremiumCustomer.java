package payment;

public class PremiumCustomer extends Customer {

    public PremiumCustomer(String name){
        super(name);
    }
    public void displayCustomerInfo(){
        System.out.println("Premium Coustomer: " + name);
    }
}
