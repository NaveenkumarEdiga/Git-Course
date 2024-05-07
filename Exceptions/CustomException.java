package Exceptions;



public class CustomException {
    public static void main(String[] args){
        String name = null;
        int size = 0;
        

        try {
             size = name.length();
             throw new NaveenException("kindly check your input once ");
        } catch (NaveenException e) {
              System.out.println( "Some thing went wrong" + e);
        }
        System.out.println(size);
    }
}
