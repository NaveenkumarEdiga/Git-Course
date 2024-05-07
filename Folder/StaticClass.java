package Folder;

public class StaticClass {
    public String name;
    public String number;
    public static String city;

    // we can access the static variables in non static there is no harmfull to use
    public void result(){
        System.out.println("Name :- "+ name + ":" + number +":"+city);
    }
    /*
     * Static method:- in static method we can't access the non static varibales .
     * if we have obj we can access the help of obj
     * static keyword belongs to the class not the object
     */
    public static void run(StaticClass obj){
        System.out.println(obj.name + ":"+obj.number +":"+ city);
    }
}
