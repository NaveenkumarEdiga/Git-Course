package Interfaces.Lamda_Expression;


@FunctionalInterface
interface Object {
    void show(int a);
}

public class Lamda_Exp {
    public static void main(String[] args) {
        Object myObj =  a -> System.out.println(a);


        myObj.show(40);
    }

}
