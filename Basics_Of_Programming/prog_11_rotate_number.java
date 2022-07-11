package Basics_Of_Programming;

import java.util.Scanner;

public class prog_11_rotate_number {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int temp =n;
        int digits=0;
   
        while(temp!=0)
        {
          temp /=10;
          digits++;
        }
   
        k=k%digits;
        
        if(k<0)
        {
          k += digits;
        }
   
        int div =1;
        int mult =1;
   
        for(int i=0;i<digits;i++)
        {
          if(i<k)
          {
            div *= 10;
   
          }
   
          else
          {
            mult *= 10;
          }
   
        }
   
        int reminder = n % div;
        int q = n/div;
        int result = (reminder * mult)+q;
        System.out.println(result);
     
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
       }

}
