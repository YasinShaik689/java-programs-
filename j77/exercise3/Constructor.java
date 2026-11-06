
package exercise3;
class Constructor {
    String name;
    int age;

    Constructor() {
        name = "Unknown";
        age = 0;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Constructor s = new Constructor();
        s.display();
    }
}