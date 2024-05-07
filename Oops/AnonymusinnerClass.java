package Oops;

class Method{
    public void result(){
        System.out.println(" In Result show");
    }
}
public class AnonymusinnerClass {
    public static void main(String[] args) {
        Method myObj = new Method(){
            public void result(){
                System.out.println("In New Show");  // anonymus inner class
            }

        };
        myObj.result();
    }
}
