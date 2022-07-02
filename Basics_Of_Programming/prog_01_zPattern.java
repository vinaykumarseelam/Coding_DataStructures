import java.util.*;

public class prog_01_zPattern {

    public static void main(String[] args) {
        
        // System.out.println("*****");
        // System.out.println(" " + " " + " " + "*" );
        // System.out.println( " " + " " + "*" );
        // System.out.println(  " " + "*" );
        
        // System.out.println("*****");
        
        int oldArr[];
       oldArr = new int[8];
       oldArr[5] = 3;
       System.out.println(oldArr[5]);

       for(int i=1; i<oldArr.length;i++)
  {
     
      
    oldArr[5] = i;
    System.out.println(oldArr[5] + " " + i); 
  }



    }
}