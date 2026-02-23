package IV;

public class superclass {
    void method(){
        System.out.println("SuperClass method executed");
    }
    
}
class Subclass extends superclass{
    void method() throws ArithmeticException {
        System.out.println("Subclass method executed");
        throw new ArithmeticException("Exception in Subclass");
    }
    public static void main(String[] args){
        superclass s= new Subclass();
        try{
            s.method();

        }
        catch (ArithmeticException e){
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
