package UserInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResources {
    public static void main(String[] args) {
        BufferedReader br = null;
        try{  
            InputStreamReader in = new InputStreamReader(System.in);
              br = new BufferedReader(in);
            int value = Integer.parseInt(br.readLine()) ;
            System.out.println(value);
      }catch(Exception e){
           System.out.println("Something went wrong");
      }
      finally{
            // finally block used to close the resources
            // finally block will be executed irrespective of the exception
            try {
                br.close();
                System.out.println("Buffer reader closed");
            } catch (IOException e) {
                e.printStackTrace();
            }
      }
    }

}
