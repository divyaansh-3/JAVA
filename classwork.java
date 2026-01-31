class Animal{
    void eat(){
        System.out.println("this animal eats food.");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("dog barks!");
    }

}
public class classwork {
    public static void main(String[] args) {
        Dog d =new Dog();
        d.eat();
        d.bark();
    }
    
}
