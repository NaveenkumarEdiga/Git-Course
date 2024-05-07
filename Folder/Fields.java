package Folder;

public class Fields {
    private String name ;
    private int age;
    private String college;

    public Fields(){
                         // default constructor
    }
    public Fields(String name, int age, String college){ // parameterised constructor
        this.name = name;
        this.age = age;
        this.college = college;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getCollege(){
        return college;
    }

}
