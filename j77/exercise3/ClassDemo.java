
package exercise3;
class Students {
    String name;
    int age;

    void setData(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class ClassDemo {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.setData("Yasin", 19);
        s1.display();
    }
}