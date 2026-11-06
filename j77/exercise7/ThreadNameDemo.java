package exercise7;

class NamedThread extends Thread {
    @Override
    public void run() {
        System.out.println("Task is being executed by: " + this.getName());
    }
}

public class ThreadNameDemo {
    public static void main(String[] args) {
        NamedThread t1 = new NamedThread();
        NamedThread t2 = new NamedThread();
        
        System.out.println("Default name of t1: " + t1.getName());
        System.out.println("Default name of t2: " + t2.getName());

        t1.setName("Data-Processor-Thread");
        t2.setName("Network-Sender-Thread");
        
        System.out.println("\n--- After using setName() ---");
        System.out.println("New name of t1: " + t1.getName());
        System.out.println("New name of t2: " + t2.getName());
        
        System.out.println("\n--- Starting Threads ---");
        t1.start();
        t2.start();
        
        
        Thread mainThread = Thread.currentThread();
        System.out.println("\nOriginal name of the main thread: " + mainThread.getName());
        
        mainThread.setName("Master-Control-Program");
        System.out.println("New name of the main thread: " + mainThread.getName());
    }
}

