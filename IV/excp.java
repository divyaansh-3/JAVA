package IV;
import java.io.*;
import java.rmi.StubNotFoundException;

public class excp {
    public static void main(String[] args) {
        String s = "";
        try{
            System.out.println(getLength(s));
        }
        catch(IllegalArgumentException e){
            System.out.println("IllegalArgumentException caught");
        }
        
        try{
            System.out.println(getLength(s));
        }
        catch(IllegalArgumentException e){
            
            System.out.println("IllegalArgumentException caught");
        }
        s = null;
       
        try{
            System.out.println(getLength(s));
        }
        catch(IllegalArgumentException e){
            
            System.out.println("IllegalArgumentException caught");
            System.out.println(e.getMessage());
            
        }
         s= null;
    }
    

    public static int getLength(String s) {
        if(s == null)
            throw new IllegalArgumentException("The argument cannot be null");
        return s.length();
    }
    
}
