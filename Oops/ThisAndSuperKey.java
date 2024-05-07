package Oops;
class A extends Object{
     public A(){
        super();
        System.out.println("in A");
     }
     public A(int n){
        this();
        System.out.println("in A int");
     }
}class B extends A{
     public B(){
        super(5);// it will execute the constuctor of a superClass
        System.out.println("in B");
     }
     public B(int n){
        this();
        System.out.println("int in B");
     }
}
public class ThisAndSuperKey {
    public static void main(String[] args) {
        B myobj = new B(5);
    }
   
}
