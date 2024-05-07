package CastingTypes;

class Parent{
    public void run1(){
             System.out.println("in Parent class");
    }
}

class Child extends Parent{
    public void run2(){
        System.out.println("in Child Class");
    }
}

public class TpeCasting {
    public static void main(String[] args){

         // Up Casting

         Child myObj = new Child();

         Parent obj = myObj;
          obj.run1();

        Parent myObj1 = new Child();
        Child Obj1 = (Child) myObj1;
            Obj1.run2();


    }
}
