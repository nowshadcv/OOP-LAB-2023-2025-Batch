package pgrm19;

import java.util.*;
class Box 
{
   int l,b;
   int CalculateArea()
   { 
      int a;
      a=l*b;
      return a;
    }

Box()
{
  l=10;
  b=5;
}

Box(int length,int breadth)
{
   l=length;
   b=breadth;
}
}
class BoxArea
{
   public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        Box b1=new Box(20,10);
        Box b2=new Box();
        int result=b1.CalculateArea();
         int result1=b2.CalculateArea();
        System.out.println(result);
        System.out.println(result1);
     }
}