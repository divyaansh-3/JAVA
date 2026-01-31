class Demo{
    Demo(){
        this("DEfault Constructor");
    }
    Demo(String message){
        System.out.println(message);
    }
}
public class c2 {
    public static void main(String[] args) {
        new Demo();
    }
    
}
