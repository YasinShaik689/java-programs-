package excercise6;

public class MultiTryCatch {
    public static void main(String args[]){
        try{
            int arr[] = {10,20,30};
            arr[5]=50;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException raised\n"+ e);
        }
        try{
            int data=100/0;
            System.out.println(data);
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception raised\n"+ e);
        }

    }
    
}
