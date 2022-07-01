package Basics_Of_Programming;

import java.util.Scanner;

public class prog_08_reverse_number {
    Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();

     int d=n;
     int length=0;

     while(d!=0)
     {
       d=d/10;
       length++;
     } 

     int newArr[];
     newArr = new int[length];

     for(int i=0;i<newArr.length;i++)
     {
       newArr[i] = n%10;
       n=n/10;
       System.out.println(newArr[i]);
     }
}
