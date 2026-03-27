package class_assign3;
abstract class Plan {
    private String patientName;
    private double baseFee;


    Plan(String patientName, double baseFee) {
        this.patientName = patientName;
        this.baseFee = baseFee;
    }

    
    public String getPatientName() {
        return patientName;
    }

    public double getBaseFee() {
        return baseFee;
    }

    
    abstract double calculateBill();
}


class SilverPlan extends Plan {
    SilverPlan(String patientName, double baseFee) {
        super(patientName, baseFee);
    }

    double calculateBill() {
        return getBaseFee() + 15;
    }
}

class GoldPlan extends Plan {
    GoldPlan(String patientName, double baseFee) {
        super(patientName, baseFee);
    }

    double calculateBill() {
        double surcharge = getBaseFee() * 0.10;
        return getBaseFee() + surcharge - 20;
    }
}

class BillingSystem {
    public static void printInvoice(Plan p) {
        System.out.println("Patient: " + p.getPatientName());
        System.out.println("Final Bill: " + p.calculateBill());
        System.out.println("--------------------------");
    }
}


public class TelemedicineBilling {
    public static void main(String[] args) {

        Plan p1 = new SilverPlan("John", 100.0);
        Plan p2 = new GoldPlan("Sophia", 200.0);
        Plan p3 = new GoldPlan("Max", 50.0);

        BillingSystem.printInvoice(p1);
        BillingSystem.printInvoice(p2);
        BillingSystem.printInvoice(p3);
    }
}