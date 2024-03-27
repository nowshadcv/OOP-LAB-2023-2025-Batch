package complexaddition;

import java.util.Scanner;

public class complexaddition {
			
			double real,img;
			complexaddition(double r,double i){
		        real = r; img = i;
		    }
			
				public static complexaddition sum(complexaddition c1,complexaddition c2)
				{
		            complexaddition temp = new complexaddition (0,0);
					temp.real = c1.real + c2.real;
					temp.img =c1.img + c2.img;
					return temp;
				}
				public static void main(String args[])
				{
					Scanner s = new Scanner(System.in);
					System.out.print("Enter first real part:");
					double r=s.nextInt();
					System.out.print("Enter second real part:");
					double p=s.nextInt();
					System.out.print("Enter first imaginary part:");
					double i=s.nextInt();
					System.out.print("Enter second imaginary part:");
					double q=s.nextInt();
					complexaddition c1= new complexaddition(r,i);
					complexaddition c2 = new complexaddition(p,q);
					complexaddition temp = sum(c1,c2);
					System.out.printf("Sum is :"+temp.real + "+"  + "i");
				}
			}

