package Exceptions;

class DuckingExp{
    public void handlingException() throws ClassNotFoundException  {
            Class.forName("Exceptions.ExampleTwo");  
    }
}


public class DuckingException {
    public static void main(String[] args) {
        DuckingExp myObj = new DuckingExp();
        try{
            myObj.handlingException();
        }catch(Exception e){
            System.out.println("Claass is not found "+ e);
        }
      
    }
}
