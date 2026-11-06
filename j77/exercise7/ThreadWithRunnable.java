package exercise7;

class Test implements Runnable {
    public void run() {
       System.out.println("this is run method");
    }
}

public class ThreadWithRunnable {
    public static void main(String[] args) {
        Test ob = new Test();
        
        Thread ob1 = new Thread(ob); 
        ob1.start();
        
        
    }
}

