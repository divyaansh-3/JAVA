class Student {
    String name = "Ravi";
}

class Employee {
    int salary = 30000;
}

public class test {
    public static void main(String[] args) {

        Student s = new Student();     
        Employee e = new Employee();   
        Student s2 = new Student();    

        System.out.println("Student name: " + s.name);
        System.out.println("Employee salary: " + e.salary);
        System.out.println("Another student name: " + s2.name);
    }
}
