package exercise5;

class Shape {
    void draw() {
        System.out.println("Drawing a shape...");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle...");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle...");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
       
        
        Shape myShape;
        myShape = new Shape();
        myShape.draw();
        
      
        myShape = new Circle();
        myShape.draw(); 
        
        myShape = new Rectangle();
        myShape.draw();
    }
}
