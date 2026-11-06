package exercise7;

class Greeting implements Runnable {
    @Override
    public void run() {
        System.out.println("Greeting Runnable started.");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Hello! Welcome to Java Threads.");
        }
        System.out.println("Greeting Runnable finished.");
    }
}

public class ThreadWithRunnable2 {
    public static void main(String[] args) { 
        Greeting ob= new Greeting(); 
        Thread ob2 = new Thread(ob);
        ob2.start();
    }
}

