package I;
// Interface
interface Animal {
    void sound();   // abstract method
}

// Class implementing interface
class Dog implements Animal {

    public void sound() {
        System.out.println("Dog barks.");
    }
}

// Main class
public class InterfaceExample {
    public static void main(String[] args) {

        Animal a = new Dog();  // interface reference, object of implementing class
        a.sound();
    }
}
