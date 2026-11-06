package excercise6;
public class ThrowableExample {
    public static void main(String[] args) {
        try {
            throw new Exception("Something went wrong");
        } catch (Throwable t) {          
            System.out.println("Caught Throwable: " + t.getMessage());
            System.out.println("Class: " + t.getClass().getName());
        }
    }
}