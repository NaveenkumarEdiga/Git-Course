package Interfaces;


/*
 * FUnctional interface is a interface which  has only one method called " FI".
 * functional interfaces used in lamda java 8 feature
 */
@FunctionalInterface
 interface Customer{
        void run();
 }
 /* 
    class Agent implements Customer{
        public void run(){
                System.out.println("In run Show");
        }
    }
 */
public class Interfce_Func {
    // we cant instantiate  the interface class so by solving this we need to implemnt method in subclass
    public static void main (String[] args){
        // another way also we can write 
             /*  Customer obj ;
                obj = new Agent();
                obj.run();
            */

            Customer obj = new Customer() {
                public void run(){
                    System.out.println("In Run Show");
                }
            };
            obj.run();
 
    }

}
