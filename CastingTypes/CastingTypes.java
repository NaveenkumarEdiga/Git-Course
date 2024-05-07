package CastingTypes;

public class CastingTypes {
    public static void main(String[] args){
        // byte -> short -> char -> int -> long -> float -> double // implicit(widening) casting
        float a =10.0f;
        double b = a; //  here we are converting this into int to double 
        System.out.println( "Widening casting :"+b);

       /*Narrowing (explicit) casting :-
         double -> float -> long -> int -> char -> short -> byte // manually
        */
        double x =10;
        int y = (int)x;

        System.out.println("Narrowing casting :"+y);
        // casting promotion
        byte c  = 20;
        byte d = 40;
        int e = d *c;
        System.out.println("casting promotion: " +e);
      //widening casting 
        char j = '4';
        long k = j;
        System.out.println(k);


    }
}
