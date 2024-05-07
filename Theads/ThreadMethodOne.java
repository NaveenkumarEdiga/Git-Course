package Theads;

class A extends Thread{
    @Override
    public void run(){
      for(int i=0; i<5;i++){
          System.out.println("Hi");
          try {
            Thread.sleep(10);
          } catch (Exception e) {
            System.out.println(e.getMessage());
          }

        }
    }
}
class B extends Thread{
    @Override
    public void run(){
        for(int i=0; i<5;i++){
            System.out.println("Hello");
            try {
                Thread.sleep(10);
              } catch (Exception e) {
                System.out.println(e.getMessage());
              }
          }
    }
}

public class ThreadMethodOne {
    public static void main(String[] args) {
        A thread1 = new A();
        B thread2 = new B();

        thread1.start();
        try {
            Thread.sleep(2);
          } catch (Exception e) {
            System.out.println(e.getMessage());
          }
        thread2.start();
    }

}