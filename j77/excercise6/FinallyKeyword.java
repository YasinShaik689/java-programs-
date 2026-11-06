package excercise6;

public class FinallyKeyword {
    public static void main(String args[]){
        try{
            int data=100/0;
            System.out.println(data);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception raised\n"+ e);
        
        }finally{
            System.out.println("Finally block is always executed");
        }
    }
}
