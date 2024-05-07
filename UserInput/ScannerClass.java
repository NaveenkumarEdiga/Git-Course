package UserInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Buffer {

    BufferedReader read = null;
    public int getValue() throws IOException{
        System.out.println("Enter a number");
        InputStreamReader stream = new InputStreamReader(System.in);
          read = new BufferedReader(stream);
        int value =Integer.parseInt(read.readLine());

        return value;
    }
}
class ScannerObj {

    Scanner scr = null;
    public String getresult(){
        System.out.println("Enter a input value");
        scr =new Scanner(System.in);
        String name = scr.nextLine();
        
        return name;
    }
}

public class ScannerClass{
    public static void main(String[] args) {

        ScannerObj  object = new ScannerObj();
        System.out.println(object.getresult());

        Buffer br = new Buffer();

    try {
       int result =  br.getValue();
       System.out.println(result);
    } catch (Exception e) {
       System.out.println("Something went wrong");
    }
    finally{
        object.scr.close();
        System.out.println("Scanner closed");
        try {
            br.read.close();
            System.out.println("bufferReader closed");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    }
}