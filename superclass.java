class parent{
    void display(){
        System.out.println("parent class method");
    }
}
class child extends parent{
    void display(){
        super.display();  // super keyword is used for calling the parent class method.
        System.out.println("child class method");
    }
}
public class superclass {
    public static void main(String args[]){
        child c = new child();
        c.display();
    }


    
}
