package exercise5;

interface Printable {
    void print();
}

interface Showable extends Printable {
    void show();
}

class Document implements Showable {
    @Override
    public void print() {
        System.out.println("Printing the document...");
    }
    
    @Override
    public void show() {
        System.out.println("Showing the document...");
    }
}

public class InterfaceInheritance {
    public static void main(String[] args) {
        Document doc = new Document();
        doc.print();
        doc.show();
    }
}
