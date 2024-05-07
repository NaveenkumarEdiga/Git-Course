package Arrays;


class TwoDArray{

    public void result(){
        int[][] myArray = new int[3][4];

        // Assigning the values to the array
             for(int i=0; i<3 ; i++){
                 for(int j = 0; j<4 ;j++){
                     myArray[i][j] = (int)(Math.random() * 10);
                 }
             }
     
             System.out.println("Using For  loop");
     
             for(int i = 0; i<3; i++){
                 for(int j = 0; j < 4; j++){
                     System.out.print(myArray[i][j] + " ");
                 }
                 System.out.println();
             }
     
     
             System.out.println("Using For each loop");
             for (int[] n : myArray) {
                 
                 for (int value : n) {
                     System.out.print(value + " ");
                 }
                 System.out.println();
             }
    }
}

class JaggedArray{
    public void result(){
        int[][] myArray = new int[3][];

        myArray[0] = new int[3];
        myArray[1] = new int[2];
        myArray[2] = new int[4];
         
        for(int i=0;i<myArray.length; i++){

            for(int j = 0; j < myArray[i].length; j++){
                myArray[i][j] =(int) (Math.random() * 10);
            }
        }


        for (int[] is : myArray) {
            
              for(int n : is){
                System.out.print(n + " ");
              }
              System.out.println();
        }

     }
}




class MultiArray{
    public void result(){
        int[][] myArray = {{14,23,45,67},{34,67,89},{34,56,78,79}};
        // Using for loop
        for(int i=0;i<myArray.length; i++){
            for(int j = 0; j< myArray[i].length ; j++){
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }
        // usinf for each loop

        for(int[] n : myArray){
            for(int b : n){
                System.out.print(b+" ");
            }

            System.out.println();
        }

    }
}


class ThreeDArray{

      public void result(){



    /* one logic check once
        int [][][] Array = {{{1,2,4,5},{3,4,6,7},{2,34,6,7}}};


        for(int i = 0 ;i<Array.length;i++){
            for(int j=0; j<Array[i].length;j++){
                for(int k=0;k<Array[i][j].length; k++){
                    System.out.print(Array[i][j][k] + " ");
                }
                System.out.println();
            }
        }

        */
        int [][][] myArray = new int[4][4][5];

        for(int i = 0; i< myArray.length; i++){
              for(int j = 0;j<myArray[i].length; j++){
                   for(int k = 0 ; k<myArray[i][j].length;k++){
                    myArray[i][j][k] = (int)(Math.random() * 10);
                   }
              }
        }
         // for each loop
        for (int[][] i : myArray) {
            
            for(int[] j : i){
                for(int k :j){
                    System.out.print(k + " ");
                }
                System.out.println();

            } 
            System.out.println("............................................................................");
               
        }
        // for loop
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                    System.out.print("array3D[" + i + "][" + j + "][" + k + "] = " + myArray[i][j][k] +" ");
                }
                System.out.println();
            }
            System.out.println("................................");
        }
      }

}

public class MultiDArray {
    public static void main(String[] args) {
       TwoDArray myObj = new TwoDArray();
       myObj.result();
        
       JaggedArray myjagArray = new JaggedArray();
       myjagArray.result();

       MultiArray myArray = new MultiArray();
       myArray.result();
       
       ThreeDArray myThreedArray = new ThreeDArray();
       myThreedArray.result();
    }
}
