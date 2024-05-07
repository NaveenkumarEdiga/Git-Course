package Collection.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args){

        /*  Comparator<Integer> com = new Comparator<Integer>() {
                    public int compare(Integer a , Integer b){
                        if(a % 10 > b % 10){ // for last digit use % (return the reminder) and for first digit use /  (return thr quotient)
                            return 1;
                        }else{
                            return -1;
                        }
                    }
                };
         */

         Comparator<Integer> com = (a,b) -> (a % 10 > b % 10) ? 1 : -1; // simplified in lamda
                
        List<Integer> myList = new ArrayList<>();
        myList.add(37);
        myList.add(18);
        myList.add(34);
        myList.add(62);
        // now i need to sort the elements based on last digit  of the value
        Collections.sort(myList,com);

        System.out.println(myList);
    }
}
