package Exceptions;

class NaveenException extends Exception {
    public NaveenException(String value){
      super(value);
     }
}
public class ExampleTwo {
    public static void main(String[] args){
         int a = 20;
         int b = 0 ;
         try{
            b = 18/a;
            if (b == 0){
                throw new  NaveenException(" The value is devided by zero");
            }
         }catch(ArithmeticException e){
                  b = 18/2;
                  System.out.println("It is A default valule " + e);
         }
         catch(Exception e){
            System.out.println("Something went wrong" + e);
         }

         System.out.println(b);

    }
}
