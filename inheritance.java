class parent{
    int a=10;
    void showparent(){
        System.out.println("this is parent class");
    }
}
class child extends parent{
    void showchild(){
        System.out.println("this is child class");
    }
}
public class inheritance {
    public static void main(String[] args) {
        child obj=new child();
        obj.showparent();
        obj.showchild();
        System.out.println("value of a is: "+ obj.a);
    }
}
