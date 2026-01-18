public class method {
    void add(int a, int b){
        System.out.println("sum is:(int) "+(a+b));
    }
    void add(double a, double b){
        System.out.println("sum is :(double) "+(a+b));
    }
    public static void main(String[] args) {
        method obj = new method();
        obj.add(10,20);
        obj.add(10.5,20.5);
        
    }
}
