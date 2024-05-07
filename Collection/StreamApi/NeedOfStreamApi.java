package Collection.StreamApi;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;



public class NeedOfStreamApi{
    public static void main(String[] args) {
        // int sum = 0;
        List<Integer>  myList = Arrays.asList(2,3,6,79,8);
        Iterator<Integer> it = myList.iterator();

        System.out.println("............for Loop.................");
            for(int i=0;i<myList.size(); i++){
                System.out.println(myList.get(i));
            }
        System.out.println(".............Enhanced for loop........");
            for(int num : myList){
                System.out.println(num);
            }
        System.out.println("...................Using iterator ...............");
            while(it.hasNext()){
                int num = it.next();
                System.out.println(num);
            }
        System.out.println("................forEach loop.....................");
             myList.forEach(n -> System.out.println(n)); 


        // we can add even numbers in the above list
      /*   while(it.hasNext()){
            int num = it.next();
            if(num % 2 == 0 ){
            num = num * 2;
            sum += num;
            }
        }
        System.out.println(sum);
      */
        
    }
}
