class Person {
    String name;
    int age;

    
    Person(String name, int age) {
        this.name = name;   
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    int rollNo;

    Student(String name, int age, int rollNo) {
        super(name, age);      
        this.rollNo = rollNo;    
    }


    void display() {
        super.display();        
        System.out.println("Roll No: " + rollNo);
    }
}


public class example{
    public static void main(String[] args) {

        Student s = new Student("Rahul", 20, 101);
        s.display();
    }
}
