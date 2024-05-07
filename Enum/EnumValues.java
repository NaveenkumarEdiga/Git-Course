package Enum;


enum Status{
    Pending, Running,Failed,Success
}
public class EnumValues {
    public static void main(String[] args){
         Status myStatus = Status.Success;
        // By uing if 
         if(myStatus == Status.Pending){
            System.out.println("Please Wait...!");
         }else if(myStatus == Status.Failed){
            System.out.println("Bad Request");
         }else if(myStatus == Status.Running){
            System.out.println("All Good");
         } else{
            System.out.println("Great...!!");
          }

          // By Using Switch 
          switch (myStatus) {
            case Pending :
                    System.out.println("Please wait");
                break;
            case Success:
                    System.out.println("Great ..!");
                break;
            case Running:
                    System.out.println("All Good");
                break;
            case Failed:
                    System.out.println("Bad Request");
                break;
            default:
                    System.out.println(" Check your input status");
                break;
          }

          // by using for loop
          for(Status obj : Status.values()){
               System.out.println(obj +" " + obj.ordinal());
          }
    }      
}
