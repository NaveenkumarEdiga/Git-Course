package Collection.ListInterface;

import java.util.ArrayList;
import java.util.List;

public class Example { 
    public static void main(String[] args) { 
      List<String> cars = new ArrayList<String>();
      cars.add("Volvo");
      cars.add("BMW");
      cars.add("Ford");
      cars.add("Mazda");
      cars.addFirst("10");
      System.out.println(cars);
    } 
  }
  
