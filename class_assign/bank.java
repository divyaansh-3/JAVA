package class_assign;

class Account{
    double balance;

    Account(double amount){
        balance = amount;
    }

    double calculate_Interest(){
        return 0.02 * balance;
    }
}

class SavingsAccount extends Account{
    double final_amount;

    SavingsAccount(double amount){
        super(amount);
    }

    double calculate_Interest(){
        if(balance <= 50000){
            final_amount = 0.04 * balance;
        }
        else{
            final_amount = (0.04 * balance) + 500;
        }
        return final_amount;
    }
}

class FixedAccount extends SavingsAccount{

    FixedAccount(double amount){
        super(amount);
    }

    double calculate_Interest(){
        double sa_interest = super.calculate_Interest();
        return sa_interest * 0.02;
    }
}

public class bank{
    public static void main(String[] args){

        SavingsAccount a = new FixedAccount(60000);
        Account b = new SavingsAccount(80000);

        double interest = b.calculate_Interest();

        double result = a.calculate_Interest();

        System.out.println("Interest = " + result);
        System.out.println("Savings Account Interest = " + interest);

    }
}