package Oops;

import Folder.Fields;

public class Encapsulation {
     public static void main(String[] args) {
        Fields myObj = new Fields("Name" ,23 ,"Gates Institute Of Technology");
        System.out.println(myObj.getAge());
        System.out.println(myObj.getName());
        System.out.println(myObj.getCollege());
     }
}
