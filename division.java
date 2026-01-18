import java.util.Scanner;
public class division {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter your first number: ");
        int a=sc.nextInt();
         System.out.println("enter your second number: ");
         int b= sc.nextInt();
         if(b==0){
            System.out.println("Division by zero is not allowed");
         }
         else{
            System.out.println("result is: "+ (double) a/b);
         }
    }
    
}
