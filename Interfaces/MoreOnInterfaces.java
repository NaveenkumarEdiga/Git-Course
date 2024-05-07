package Interfaces;
/**
 * 
 * class => class ===> extends
 * class => interface ===> implements
 * class => abstract ===>  extends
 * interface => interface ===> extends
 */
interface TeacherA {
     void prepExam();
     void writeExam();
}
interface TeacherB{
    void invisilator();
}
interface TeacherC extends TeacherB{
    void checking();
}

class Student implements TeacherA ,TeacherC{
   public void prepExam(){
         System.out.println("Preparation Started..!");
    }
   public void writeExam(){
        System.out.println("Exam Started");
   }
   public void invisilator(){
        System.out.println("Invisilation started");
   }
   public void checking(){
    System.out.println("Exam ended");
   }
}
public class MoreOnInterfaces {
    public static void main(String[] args){
        TeacherA obj;
        obj = new Student();
        obj.prepExam();
        obj.writeExam();
        TeacherC obj1 = new Student();
        obj1.invisilator();
        obj1.checking();
    }
}
