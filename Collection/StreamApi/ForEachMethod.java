package Collection.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachMethod {
   public static void main(String[] args) {
       List<Integer> myList = Arrays.asList(2,4,5,8,10);
       // implementation
       /*  Consumer<Integer> con = new Consumer<Integer>() {
                public void accept(Integer n){
                    System.out.println(n);
                }
             };
        */
       Consumer<Integer> con = n -> System.out.println(n);

        myList.forEach( n -> System.out.println(n));
    
   } 
}
