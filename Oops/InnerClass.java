package Oops;

class A {
    public  String name = "naveen";
    public void show(){
        System.out.println("In Show Method");
    }

    class B {
        public void method(){
            System.out.println("In Method ");
        }
    } 
}

public class InnerClass {
    public static void main(String[] args) {
         A myObj = new A();
          myObj.show();
         A.B myObj1 = myObj.new B();
         myObj1.method();
    }
}
