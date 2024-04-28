
class Main{
    public int getSum(int a ,int b){
        return a +b;
    }
}
public class Program{
    public static void main(String[] args){
        Main myObj = new Main();
        int result =  myObj. getSum(12,24);
        System.out.println(result);
    }
}