package ConditionalStatements;
public class TernaryOperator {
    
    public static void main(String[] args){
        int x = 23;

        //ternaryOperator:- (condition) ? true : false;

        String result = (x % 2 == 0 ) ? x +"The given value is even": x +"It\'s a odd number";
   
         System.out.println(result);
        
    }
}
