package Enum;

enum Laptop {
    Lenovo(2500),HP(2540),Redmi(3400),Acer();

    private int price ;
    private int customPrice;
    private Laptop(int i) {
        this .price = i;
    }
    private Laptop() {
        customPrice = 0;
    }
    public int getPrice() {
        return price;
    }
    public int getCustomPrice() {
        return customPrice;
    } 

    public void setCustomPrice(int pri){
        this.customPrice = pri;
    }
}

public class EnumClass {
    public static void main(String[] args) {
        
        for(Laptop myLap : Laptop.values())
       {
               myLap.setCustomPrice(4000);
            int finalPrice  = (myLap.getPrice() != 0) ?  myLap.getPrice()  : myLap.getCustomPrice();
            System.out.println("Brand : "+myLap.name()+ " Price : "+ finalPrice);
        }
    } 
}
