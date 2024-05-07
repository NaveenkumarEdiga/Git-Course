package Oops;

abstract class Mobile{
    
    private String brand ;

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public abstract void rom(); // abstract method
    public void batteryCapacity(){
        System.out.println("4000 mah");
    }
    public void ram(){
        System.out.println("8 GB Ram" );
    }
    
}
 class Samsung extends Mobile{  // concrete class
    
    public void rom(){
        System.out.println("256 GB");
    }
}


public class AbstractClass {
    public static void main(String[] args) {
        Mobile myObj = new Samsung();
        myObj.setBrand("Samsung");
         String result = myObj.getBrand();
         System.out.println(result);
        myObj.ram();
        myObj.rom();
        myObj.batteryCapacity();

    }
}
