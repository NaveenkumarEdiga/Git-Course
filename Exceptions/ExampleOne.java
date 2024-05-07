package Exceptions;

public class ExampleOne {
    public static void main(String[] args) {
        int a = 10;
        int b = 2 ;
        int result = 0;
        String name = null;
    
        // int result = a / b;
        // System.out.println(result);
        // System.out.println("Good Morning"); 
        /*this statement will not be executed because
           the Exception occured at line 8
        */
        try{
             result = a / b;
             int [] array = new int[5];
             System.out.println(array[3]);
             System.out.println(name.length());
        }
        catch(ArithmeticException e){
            System.out.println("Something went wrong" + e);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println(" make sure that index value peoperly" + e);
        }
        catch(Exception e){
            System.out.println("Something went wrong"+ e);
        }

        System.out.println(result);
        System.out.println("This is statement executed");



    }
}
