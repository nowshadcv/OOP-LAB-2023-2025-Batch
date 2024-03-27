
package Overload;

import java.util.Scanner;

class Overload {
	void area(float x)
	{ System.out.println( "the area of sqr is: "+ Math.pow(x,2) +" sq units");}
	void area(float x,float y)
	{ System.out.println( "the area of rectangle is: "+ x*y +" sq units");}		
	void area(double x)
	{ System.out.println( "the area of circle is: "+ 3.14*x*x +" sq units");}
}
class m{
	public static void main(String[] args) {
		Overload O = new Overload();
		Scanner sc = new Scanner (System.in);
		Scanner ar = new Scanner (System.in);
		System.out.println("choose option");
		System.out.println("1.AREA of Square");
		System.out.println("2.AREA of Rectangle");
		System.out.println("3.AREA of Circle");
		
		int choice;
		float a,b;
		double c;
		choice =sc.nextInt();
		switch (choice)
		{
		case 1: System.out.println("Enter side of square");
				a = ar.nextFloat();
				O.area(a);
				break;
		case 2: System.out.println("Enter sides of Rectangle ");
				a = ar.nextFloat();
				b = ar.nextFloat();
				O.area(a,b);
				break;
		case 3: System.out.println("Enter radius of circle");
				c = ar.nextDouble();
				O.area(c);
			break;		
					}

	}
}
