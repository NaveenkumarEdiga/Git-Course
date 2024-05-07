package Oops;

public class StringFile {
    public static void main(String[] args) {
        /*
         *  String means the collection of chars , and denoted by " " quotes
         */
            String normal = "Suresh ";
            String  result = normal.concat("Guru");
            System.out.println(normal);
            System.out.println(result);
         String name =new String(" Naveen kumar ");
        String cocat = name.concat("Ediga");
        System.out.println(name.charAt(4));
        System.out.println(name.length());
        System.out.println(name.isEmpty());
        System.out.println(cocat.substring(6));
        System.out.println(cocat.length());
        System.out.println(cocat.trim().length());
       String subStr =  name.trim().substring(0,6);
       System.out.println(subStr);
        System.out.println( name.split("o"));
        name.contains("s");
        System.out.println( name.contains("a"));
        // String Buffer is used modifie the string because these are mutable string

       StringBuffer buffer = new StringBuffer("Naveen kumar ");
       buffer.append( "Ediga");
       System.out.println(buffer);
       String str = buffer.toString();
       System.out.println(str);
       buffer.delete(0,6);
       System.out.println("........");
      
       buffer.deleteCharAt(4);
       System.out.println(buffer);
    }
    
}
