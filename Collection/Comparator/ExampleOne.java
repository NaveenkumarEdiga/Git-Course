package Collection.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
// what is comparator :- if you want specify wthich logic you want to sort the elements
 // you can  use comparator.
public class ExampleOne {
    public static void main(String[] args){
        // Consider sting array list and sort them based on the Size

        Comparator<String> com = new Comparator<String>() {
            public int compare(String a , String b){
                if(a.length() < b.length()){ // descending order (<) for ascending(>)
                    return 1;
                }else{
                    return -1;
                }
            }
        };
        List <String> myList = new ArrayList<>();
        myList.add("Banana");
        myList.add("Grapes");
        myList.add("Anasa");
        myList.add("Apple");
        myList.add("DragonFruit");

        Collections.sort(myList,com);
        System.out.println(myList);

    }
}
