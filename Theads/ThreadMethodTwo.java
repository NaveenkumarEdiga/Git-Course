package Theads;


public class ThreadMethodTwo{
    public static void main(String[] args){
           Runnable obj1 =  () -> {
                for(int i=0;i<5;i++){
                    System.out.println("Hii");
                    try{
                        Thread.sleep(10);
                    }catch(Exception e){System.out.println(e.getMessage());}
                }
              };
              Thread thread1 = new Thread(obj1);

         Runnable obj2 = () -> {
                for(int i=0;i<5;i++){
                    System.out.println("Hello");
                    try{
                        Thread.sleep(10);
                    }catch(Exception e){System.out.println(e.getMessage());}
                }
            };
           
          Thread thread2 = new Thread(obj2);
          thread1.start();
            try{
                Thread.sleep(2);
            }catch(Exception e){System.out.println(e.getMessage());}
           thread2.start();
    }
}
