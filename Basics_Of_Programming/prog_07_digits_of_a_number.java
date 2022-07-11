package Basics_Of_Programming;

import java.util.Scanner;

public class prog_07_digits_of_a_number {
    Scanner scn = new Scanner(System.in);
      int length = 0;

      int n = scn.nextInt();
      int d = n;
      while(d!=0)
      {
        d=d/10;
        length++;
      }
      

      int arr[];
      arr = new int[length];
      

      for(int i=0;i<arr.length;i++)
      {
        arr[i] = n%10;
        n=n/10;
      //System.out.println(arr[i]);
      }
      for(int j= arr.length -1; j>=0;j--)
      {
        System.out.println(arr[j]);
      }
       
}
