class Student {
    String name = "Ravi";
}

class Employee {
    int salary = 30000;
}

public class test {
    public static void main(String[] args) {

        Student s = new Student();     // object 1
        Employee e = new Employee();   // object 2
        Student s2 = new Student();    // object 3

        System.out.println("Student name: " + s.name);
        System.out.println("Employee salary: " + e.salary);
        System.out.println("Another student name: " + s2.name);
    }
}
