package Arrays;

// import java.util.Scanner;

public class Loops {
    public static void main(String[] args){
        /*
         * While loop:-
         *  syntax :-while(condition){
         *               code to be executed
         *            }
         */
        int i = 1; 
        while(i <= 4){
            System.out.println("Hi" + i);

                // int j = 1;
                // while(j <= 4){
                //     System.out.println("Hello"+ j);
                //     j++;
                // }
               
            i++;
        }
          /*
           * do while loop
           * 
           * Syntax:- do{
           *         // code to be executed
           *      }while(true);
           */
        int x = 5;
           do{
                System.out.println("Hi" + x);
                x++;
           }while(x<=4);

        /*
         * for loop :-
         * Syntax:- for(initialization; condition ; increment){
         *                  code to be executed
         *              }
         */
        String[] array = {"Monday","Tuesday","Wednesday","Thursday","Friday"};
        for(int c = 0; c <= array.length; c++){
             System.out.println(array[c] +" : "+"Day :-" + c);

             for(int d = 1; d<=9; d++){
                System.out.println("Time :" + (d +8) +"-" +(d+9));
             }
        }
        
    }
}
