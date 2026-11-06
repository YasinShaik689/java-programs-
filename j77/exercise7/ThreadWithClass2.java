package exercise7;

class NumberPrinter extends Thread {
    @Override
    public void run() {
        System.out.println("Number Printer Thread started.");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Printing number: " + i);
        }
        System.out.println("Number Printer Thread finished.");
    }
}

public class ThreadWithClass2 {
    public static void main(String[] args) {
        NumberPrinter ob = new NumberPrinter();
        ob.start();
    }
}

