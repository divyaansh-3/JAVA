
class Employee {
    int empId;
    String name;

    Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + name);
    }
}


class Manager extends Employee {
    String department;
    Manager(int empId, String name, String department) {
        super(empId, name);   
        this.department = department;
    }

    void display() {
        super.display();    
        System.out.println("Department: " + department);
    }
}

public class exmp {
    public static void main(String[] args) {

        Manager m = new Manager(101, "Amit", "IT");
        m.display();
    }
}
