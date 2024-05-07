package Interfaces;

interface Computer{
   void result();
}

class  LapTap implements Computer{
    public void result(){
        System.out.println(" compilem, run");
    }
}
class Desktop  implements Computer{
    public void result(){
        System.out.println(" compilem, run : fasterOne");
    }
}
class Developer{
    public void show(Computer obj){
         obj.result();
    }
}

public class NeedInterfaces {
    public static void main(String[] args) {
        Computer myObj = new LapTap();
        Computer myObj1 = new Desktop();

        Developer obj = new Developer();
             obj.show(myObj);
    }
}
