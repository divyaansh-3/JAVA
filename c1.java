class Student{
    String name;
    Student(String name){
        this.name=name;
    }
    void display(){
        System.out.println("Name: "+ this.name);
    }
}
public class c1 {
    public static void main(String[] args) {
        Student s= new Student("ALice");
        s.display();
    }
    
}
