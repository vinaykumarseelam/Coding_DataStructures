package Basics_Of_Programming;

import java.util.Scanner;

public class prog_05_fibanacii {
    Scanner scn = new Scanner (System.in);

      int n = scn.nextInt();

      int a = 0;
      int b = 1;
      int count = 0;

      for(int i=0; i<n;i++)
      {



               System.out.println(a);
count = a+b;
a = b;
b = count;


        
      }
}
