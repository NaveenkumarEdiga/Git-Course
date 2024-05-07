package Oops;

class Addition{
    public Addition(int i ,int j){
           super();
          System.out.println(i + j);
    }
}
  class  Substraction extends Addition{
         public Substraction( int i ,int j){
            super(i,j);
            System.out.println(i - j);
         }
}
  class Multiplication extends Substraction{
        public Multiplication(int i, int j){
            super(i,j);
          System.out.println(i * j);
        }
  }
  class Division extends Multiplication{

    public Division(){
         super(10,20);
    }
    public Division(int i, int j) {
         this();
         System.out.println( i / j);
    }
}

public class Main {
    public static void main(String[] args){
        Division myObj = new Division(20,10);
    }
  
}
