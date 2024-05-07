package Interfaces.Lamda_Expression;

@FunctionalInterface
interface Arithemetic {
    int add(int a ,int b);
}

public class LamdaWithReturn {
    public static void main(String[] args){
        Arithemetic myObj = (a ,b) -> a + b;
        myObj.add(2,5);
    }
}
