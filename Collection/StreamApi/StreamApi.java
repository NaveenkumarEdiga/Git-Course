package Collection.StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args){
        List<Integer> myList = Arrays.asList(2,4,6,7,9,3,5);

        // filter implemntation
            Predicate<Integer> filt = new Predicate<Integer>() {
                public boolean test(Integer n){
                    return n % 2 == 0;
                }
            };
            
        // map implementation
           Function<Integer , Integer> mapOut = new Function<Integer,Integer>() {
                public Integer apply(Integer n) {
                    return n * 2;
                }        
           };

         //

        //  we can't reUse a Str1 because it's already used
        Stream<Integer> str1 = myList.stream();
        Stream<Integer> str2 = str1.filter(filt);
        Stream<Integer> str3 = str2.map(mapOut);
        int result = str3.reduce(0,(c,e) -> c + e);

        System.out.println(result);
        // another way
          int output = myList.stream()
                             .filter(n-> n%2==0)
                             .map(n -> n*2)
                             .reduce(0,(a ,b) -> a + b);

        System.out.println(output);


        // now sort the even elements using stream

        Stream<Integer> sortedValue = myList.stream()
                                            .filter(n -> n%2 == 0)
                                            .sorted();
             List <Integer> evenList = sortedValue.toList();
             System.out.println(evenList);

       // now sort the odd values using stream
       Stream<Integer> oddValue = myList.stream()
                                        .filter(n -> n%2 != 0)
                                        .sorted();
            List<Integer> oddList = oddValue.toList();
            System.out.println(oddList);

        // to convert List to array using toArray method
            Integer[] arrayList = oddList.toArray(new Integer[oddList.size()]);
             for (Integer num : arrayList){
                 System.out.println(num);

             }
          

    }
}
