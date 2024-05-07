package Interfaces;

interface Demo {
     int age = 23;
     public static final String name = "Naveen"; // public static and final are default we can skip this
     void run();
     void move();
}

class NewResult implements Demo{
       public void run(){
        System.out.println("this is Run");
       }

       public void move(){
        System.out.println("This is Move");
       }
}
public class WhatIsInterface {
    public static void main(String[] args){
        Demo myObj;
           myObj = new NewResult();
           myObj.move();
           myObj.run();
        //    Demo.name = "24"; we cant modify the values here beacause the variables are static & final
        System.out.println(Demo.age);
        System.out.println(Demo.name);

        System.out.println(NewResult.age);

           
    }
}
