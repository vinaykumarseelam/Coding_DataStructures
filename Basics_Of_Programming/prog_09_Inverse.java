package Basics_Of_Programming;

public class prog_09_Inverse {
    Scanner scn = new Scanner (System.in);
  int input = scn.nextInt();


  
int length = 0;
int d = input;
int k = 0;

while(d!=0)
{
  d = d/10;
  length++;
}
int oldArr[];
oldArr = new int[length+1];
  int newArr[];
  newArr = new int[length+1];

  

  for(int i=1; i<oldArr.length; i++)
  {
    oldArr[i] = input % 10;
    input = input/10;
  }
  for(int i=1; i<newArr.length;i++)
  {
     int a = oldArr[i];        
    newArr[a] = i;
  }

  for(int i=newArr.length-1; i>0;i--)
  {
    System.out.print(newArr[i]);
  }
   
}
