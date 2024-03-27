package program10;

import java.util.Scanner;

class OverLoadDemo { 
		void area(float x)
		{
			System.out.println("The area of the square is "+Math.pow(x, 2)+" sq units");}
		void area(float x, float y) {
			System.out.println("The area of the rectangle is "+x*y+" sq units");}
		void area(double x) {
			double z= 3.14 * x * x;
			System.out.println("The area of the circle is "+z+" sq units"); }
		}
		class OverLoad {
			public static void main(String args[]) {
				double r;
				int p,m,n;
				OverLoadDemo ob = new OverLoadDemo();
				Scanner s = new Scanner(System.in);
				System.out.print ("Enter the length of square :");
				p=s.nextInt();
				ob.area(p);
				System.out.print ("Enter the length of rectangle :");
				m=s.nextInt();
				System.out.print ("Enter the breadth of rectangle :");
				n=s.nextInt();
				ob.area(m,n);
				System.out.print ("Enter the radious of circle :");
				r=s.nextDouble();
				ob.area(r); 
}}