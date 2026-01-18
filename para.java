public class para {
    static double add(float a, float b){
        return (double)a+(double)b;
    }
    public static void main(String[] args) {
        float a= 9.66f;
        float b=8.99f;
        double res = add(a,b);
        System.out.printf("result is:%.2f%n",res);
        System.out.printf("%n");
        System.out.println(a);
        
    }
    
}
