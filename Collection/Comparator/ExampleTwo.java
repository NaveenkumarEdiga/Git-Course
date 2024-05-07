package Collection.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Student{
   String name;
   String location;
   int age ;
    public Student(String name, String location, int age) {
        this.name = name;
        this.location = location;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", location=" + location + ", age=" + age + "]";
    }
}
public class ExampleTwo {
    public static void main(String[] args){
        // Consider a Studdent obj and  sort the Students based on age
 
       /*  Comparator<Student> com = new Comparator<Student>() {
            public int compare(Student a ,Student b){
                    if(a.age > b.age){
                        return 1;
                    }else{
                        return -1;
                    }
            }
        }; 
           */

            // Simplified in lamda expresion
        Comparator<Student> com = (a ,b)-> (a.age < b.age) ? 1 : -1 ;

        List<Student> myList = new ArrayList<>();
        myList.add(new Student("Naveen","Kalyandurg", 23));
        myList.add(new Student("Suresh", "Bengaluru", 22));
        myList.add(new Student("Chandra", "Bengaluru", 25));
        myList.add(new Student("Reshma","Gooty", 24));
         
        Collections.sort(myList, com);
        for(Student list : myList){
            System.out.println(list);
        }
        
    }
}
