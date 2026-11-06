package excercise6;
import java.io.*;

public class ThrowsExample {
    public static void readFile() throws IOException {
        throw new IOException("File not found");
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}