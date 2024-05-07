package Collection.ListInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;



public class ArrayListTopic{
    public static void main(String[] args){
        List  <Integer>myObj = new ArrayList<Integer>();
        myObj.add(50);
        myObj.add(90);
        myObj.add(68);
        myObj.add(53);
        myObj.add(2);

        
        myObj.addFirst(100);
        myObj.addLast(66);
        if(myObj.isEmpty()){
            myObj.add(49);
            myObj.add(40);
            System.out.println(myObj);
        }else{
            Collections.sort(myObj);
            for(int i = 0 ;i<myObj.size();i++){
                System.out.println(myObj.contains(i));
                System.out.println(myObj.get(i));

            }
            System.out.println("................Iterator..................");
            Iterator<Integer> it = myObj.iterator();
            while(it.hasNext()){
                int num = it.next();
            
                System.out.println(num);
                
            }

         System.out.println(".....................forEach loop..............");

         for(int num : myObj){
            System.out.println(num);
         }


         // Conevrt list into an array
         Object[] myArray = myObj.toArray();
         System.out.println(myArray);
         for(Object n :myArray){
              int num = (Integer)n;
              System.out.println(num);
         }

        

        }

    }
}