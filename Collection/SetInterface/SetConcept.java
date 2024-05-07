package Collection.SetInterface;

// import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;



public class SetConcept {
    public static void main(String[] args){

        //   HashSet :- its  doesn't allow the Duplicate values but it provides the unique values .
        //  TreeSet : it will not allow the dublicate values at the same time this set will sort the elements.
        Set<Integer> obj = new TreeSet<Integer>();
        int number = 0;
        obj.add(60);
        for (int i=0 ; i<5 ;i++){
            number = (int) (Math.random() * 100);
            obj.add(number);
        }
        
           Iterator <Integer> values = obj.iterator();
           while(values.hasNext()){
              int num = values.next();
              System.out.println(num);
           }
    }
}
