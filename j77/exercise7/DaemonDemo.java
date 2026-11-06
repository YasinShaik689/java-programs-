package exercise7;

class BackgroundWorker extends Thread {
    public void run() {
       System.out.println("Run in background");
    }
}

public class DaemonDemo {
    public static void main(String[] args) {
        BackgroundWorker ob = new BackgroundWorker();
        ob.setDaemon(true); //done before the start method 
        
        ob.start();
        
        System.out.println("Main (User) thread is doing some work...");
        try {
        
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        
        System.out.println("Main (User) thread is now finished!");
        System.out.println("Since no User threads are left, the JVM will automatically shut down the Daemon thread and exit.");
    
    }
}

