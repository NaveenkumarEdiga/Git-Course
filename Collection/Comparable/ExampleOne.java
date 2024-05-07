package Collection.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Comparable :- if you want to give a powen to a class itself or compile itself or 
 * to compare object to itself we can you comparable
 */
class Student implements Comparable<Student>{
    String name;
    String location;
    int age ;
     public Student(String name, String location, int age) {
         this.name = name;
         this.location = location;
         this.age = age;
     }

     public String toString() {
         return "Student [name=" + name + ", location=" + location + ", age=" + age + "]";
     }


    public int compareTo(Student that) {
       if(this.age > that.age){
            return 1;
       }else{
        return -1;
       }
    }
 }

public class ExampleOne {
    public static void main(String[] args) {

        List<Student> myList = new ArrayList<Student>();
        myList.add(new Student("Naveen","Kalyandurg", 23));
        myList.add(new Student("Suresh", "Bengaluru", 22));
        myList.add(new Student("Chandra", "Bengaluru", 25));
        myList.add(new Student("Reshma","Gooty", 24));

        Collections.sort(myList);
        for(Student stud : myList){
            System.out.println(stud);
        }
         
    }
}
