package Collection.MapConcept;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashMapConcept {
    public static void main(String[] args) {
        Map<String, Integer> obj = new Hashtable<String , Integer>();
        if(obj.isEmpty()){
            obj.put("Naveen", 70);
            obj.put("Pawan", 65);
            obj.put("Chandra", 80);
            obj.put("Suresh", 75);
        }

        obj.put("Pawan", 76);
       
        System.out.println(obj.values());
        System.err.println(obj.entrySet());
        obj.remove("Pawan");
        obj.replace("Naveen",80);
        obj.replace("Naveen",80 , 90);
        System.out.println(obj.containsKey("Vijay"));
        for(String keys : obj.keySet() ){
            System.out.println(keys + ":" + obj.get(keys));
        }
    }
}
