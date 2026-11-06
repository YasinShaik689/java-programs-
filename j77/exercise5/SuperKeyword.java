package exercise5;

class Animal {
    String name = "Animal";
    
    void eat() {
        System.out.println("Animal is eating...");
    }
}

class Dog extends Animal {
    String name = "Dog";
    
    void eat() {
        System.out.println("Dog is eating...");
    }
    
    void display() {
        System.out.println("Name: " + name);
        // Using super to access the parent class variable
        System.out.println("Super Name: " + super.name);
        
        eat();
        // Using super to invoke the parent class method
        super.eat();
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.display();
    }
}
