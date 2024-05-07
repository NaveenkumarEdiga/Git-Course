package Oops;

import Folder.StaticClass;
public class StaticConcept {
    public static void main(String[] args) {
        StaticClass myObj = new StaticClass();
        myObj.name ="Naveen kumar";
        myObj.number = "9398685694";
        StaticClass.city = "Kalyandurg";

        myObj.result();
        StaticClass.run(myObj);

    }
}
