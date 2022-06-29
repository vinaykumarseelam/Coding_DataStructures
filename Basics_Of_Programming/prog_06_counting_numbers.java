package Basics_Of_Programming;

import java.util.Scanner;

public class prog_06_counting_numbers {
    Scanner scn = new Scanner(System.in);

    int x = scn.nextInt();
    int count = 0;
    while (x!=0)
    {
      x = x/10;
      count++;
    }
    System.out.println(count);  
}
