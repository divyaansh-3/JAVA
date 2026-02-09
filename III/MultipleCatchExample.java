package III;

public class MultipleCatchExample {
    public static void main(String [] args){
        try{
            String str =null;
            System.out.println(str.length());
        } catch(NullPointerException e){
            System.out.println("null pointer Object is null.");
        } catch (Exception e){
            System.out.println("Some other error occured. ");
        }
        System.out.println( "program continues after exception handling.");
    }
    
}
