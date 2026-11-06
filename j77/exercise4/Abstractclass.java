package exercise4;

abstract class Shape {
    abstract double area();
}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    double area() {
        return length * breadth;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    double area() {
        return 3.14 * radius * radius;
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(double b, double h) {
        base = b;
        height = h;
    }

    double area() {
        return 0.5 * base * height;
    }
}

class AbstractDemo {
    public static void main(String[] args) {
        Shape s1 = new Rectangle(10, 5);
        Shape s2 = new Circle(7);
        Shape s3 = new Triangle(8, 6);

        System.out.println("Area of Rectangle: " + s1.area());
        System.out.println("Area of Circle: " + s2.area());
        System.out.println("Area of Triangle: " + s3.area());
    }
}