package excercise6;

public class TryCatch {
    public static void main(String args[]){
        try{
            int data=100/0;
            System.out.println(data);
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception raised\n"+ e);
        
        }
    }
    
}
