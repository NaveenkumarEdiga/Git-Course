package Arrays;

public class Arrays {
    public static void main(String[] args) {
        /*
         * Arrays:- Collection of elements placed into a array
         * Syntax :- dataType []  name = {   };
         * 
         * int[] myArray = new int[]; this way also we can create array and add the values into it
         */
        // one method to write an array
         int[] array = {20,30,40,50,60};

         System.out.println(array[2]);

         // Another method to create array 

         int[] myArray = new int [5];
        int [] newArray = new int[myArray.length];
        int count =0;
         myArray[0]= 20;
         myArray[1]= 35;
         myArray[2]= 4;
         myArray[3]= 8;
         myArray[4]= 38;
         for(int i=0;i<myArray.length; i++){
            if(myArray[i] % 2 ==0){
                newArray[i] = myArray[i];
                count++;
            }
         }

         // to print even numbers
         for(int i = 0; i<count;i++){
            System.out.println(newArray[i]);
         }
       
    }
}
