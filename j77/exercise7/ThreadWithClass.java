package exercise7;
class MyThread extends Thread {
    public void run() {
        System.out.println("This is the run method of MyThread");
    }
}

public class ThreadWithClass {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start(); 
        
        
    }
}

