package class_assign;
class Employee{
    String name;
    double Base_salary;
    Employee(String name, double Base_salary){
        this.name=name;
        this.Base_salary=Base_salary;
    }
    double calculate_salary(){
        return Base_salary+ (Base_salary * 0.05);
    }
    void display(){
        System.out.println("---------------------------");
        System.out.println("Employee name is : "+name);
        System.out.println("Employee base_salary is : "+Base_salary);
        System.out.println("Employee's final salary is : "+this.calculate_salary());
        System.out.println("-----------------------------");

    }
}
class Manager extends Employee{
    Manager(String name, double Base_salary){
        super(name,Base_salary);
    }
    double calculate_salary(){
        double final_amount = super.calculate_salary();
        return final_amount + 2000;
    }
    void display(){
        System.out.println("-----------------------------");
        System.out.println("Employee name is : "+name);
        System.out.println(name+" is a Manager");
        System.out.println(name+"'s base_salary is : "+Base_salary);
        System.out.println(name+"'s final salary is : "+this.calculate_salary());
        System.out.println("-----------------------------");


    }
}
    class Executive extends Manager{
        Executive(String name, double salary){
            super(name,salary);

        }
        double calculate_salary(){
            double total_salary = super.calculate_salary();
            return (total_salary + (0.1 * total_salary));
        }
        void display(){
        System.out.println("-----------------------------");
        System.out.println("Employee name is : "+name);
        System.out.println(name+" is an Executive");
        System.out.println(name+"'s base_salary is : "+Base_salary);
        System.out.println(name+"'s final salary is : "+this.calculate_salary());
         System.out.println("-----------------------------");


    }
    }


public class Payroll {
    public static void main(String[] args) {
        Employee e = new Employee("john", 59000);
        Employee m = new Manager("tom", 78790);
        Manager ex = new Executive("jerry", 87680);
        e.display();
        m.display();
        ex.display();
    }
    
}
