import java.util.Scanner;
class Student{
    String name;
    int prn;
    Student(String n,int m){
        name= n;
        prn= m;
    }
    void display(){
        System.out.println("Student name is: "+name+ " and prn is "+prn);
    }
}
public class parameterised {
    public static void main(String[] args) {
        
    
    Scanner sc= new Scanner(System.in);
    System.out.print("enter name of student: ");
    String a= sc.nextLine();
    System.out.print("enter prn: ");
    int b= sc.nextInt();
    Student s1= new Student(a,b);
    s1.display();
    }



    
}
