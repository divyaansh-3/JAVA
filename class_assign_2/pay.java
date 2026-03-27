package class_assign_2;
abstract class payment{
    private int transactionid;
    private double amount;
    payment(int transactionid, double amount){
        this.transactionid= transactionid;
        this.amount=amount;
    }
    public int getTransactionId(){
        return transactionid;
    }
    public double getAmount(){
        return amount;
    }
    abstract double processPayment();
}
class CreditcardPayment extends payment{
    CreditcardPayment(int transactionid,double amount){
        super(transactionid, amount);
    }
    double processPayment(){
        return getAmount() + (getAmount()*0.02);
    }
}
class UPIPayment extends payment{
    private String upiID;
    UPIPayment(int transactionid, double amount , String upiID){
        super(transactionid, amount);
        this.upiID = upiID;
    }
    double processPayment(){
        if(upiID == null || upiID.isEmpty()){
            System.out.println("Invalid UPI ID");
            return 0;
        }
        return getAmount();
    }

}
class PaymentProcessor{
    public static void process(payment p){
        double result = p.processPayment();
        System.out.println("Transaction ID : " + p.getTransactionId());
        System.out.printf("Processed Amount: %.1f\n",result);
        System.out.println("-----------------------");
    }
}
public class pay {
    public static void main(String[] args) {
        payment p1 = new CreditcardPayment(101, 1000);
        payment p2 = new UPIPayment(102, 1000, "user@upi");
        payment [] payments = {p1,p2};
        double total =0 ;
        for(payment p : payments){
            PaymentProcessor.process(p);
            total += p.processPayment();
        }
        System.out.printf("Total: %.1f\n", total);
    }
    
}
