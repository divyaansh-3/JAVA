package I;

public class wrapperExample {
    public static void main(String[] args){
        int x=5;
        Integer Wrappedx = Integer.valueOf(x);
        int unwrappedx = Wrappedx.intValue();
        System.out.println("wrapped : "+Wrappedx +" unwrapped: "+ unwrappedx);

    }
    
}
