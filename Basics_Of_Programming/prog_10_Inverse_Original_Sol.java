package Basics_Of_Programming;

import java.util.Scanner;

public class prog_10_Inverse_Original_Sol {
    Scanner scn = new Scanner (System.in);
  int input = scn.nextInt();

int od;
int op =1;
int inv =0;
while(input!=0)
{
 od = input%10;
 int id = op;
 int ip = od;

 inv = inv + id * (int)Math.pow(10,ip-1);
 input = input/10;
 op++;

}
System.out.println(inv);
}
