
class Main{
    // to perform addition
    public int getSum(int a ,int b){
        return a +b;
    }
    //to perform subtraction
    public int getSub(int a ,int b){
        return a + b;
    }
}
public class Program{
    public static void main(String[] args){
        Main myObj = new Main();
        int result =  myObj. getSum(12,24);
        int output = myObj.getSub(20, 10);
        System.out.println("Addition:- " +result);
        System.out.println("Subtraction"+output);
    }
}