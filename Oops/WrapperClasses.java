package Oops;

public class WrapperClasses {
    public static void main(String[] args) {

        int number =10;
         Integer integer = number; // auto-boxing

         int number1 = integer; // auto-unboxing (integer.intValue())
         System.out.println(number1);
        String num = integer.toString();
        System.out.println(num);

     // convert Sting to integer
        String age = "23";
        int ageName = Integer.parseInt(age);
        System.out.println(ageName);


    }
}
