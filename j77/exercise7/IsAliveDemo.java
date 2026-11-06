package exercise7;

class AliveThread extends Thread {
    public void run() {
        System.out.println("Hello world");
        
    }
}

public class IsAliveDemo {
    public static void main(String[] args) {
        AliveThread t1 = new AliveThread();
        
   
        System.out.println("Before start(), is t1 alive? " + t1.isAlive());
        
        t1.start(); 
        System.out.println("After start(), is t1 alive? " + t1.isAlive());
    
    }
}

