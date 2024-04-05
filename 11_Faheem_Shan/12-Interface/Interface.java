package Interface;

import java.util.Scanner;
import java.lang.Math; 

interface AP{
	void input();
	void area();
	void perimeter();
}

class Circle implements AP{
	int r =0;
	double pi =3.14,area=0,perimeter=0;
	public void input() {
		Scanner c =new Scanner(System.in);
		r=c.nextInt();
	}
	public void area() {
		area = pi * r* r;
		System.out.println("Area of Circle: "+area);
	}
	public void perimeter() {
		perimeter =2*pi*r;
		System.out.println("Perimeter of Circle: "+perimeter);
	}
	
}
class Rectangle implements AP{
	int l =0,b=0;
	double area=0,perimeter=0;
	public void input() {
		Scanner r =new Scanner(System.in);
		l=r.nextInt();
		b=r.nextInt();
	}
	public void area() {
		area = l*b;
		System.out.println("Area of Rectangle: "+area);
	}
	public void perimeter() {
		perimeter =2*(l+b);
		System.out.println("Perimeter of Rectangle: "+perimeter);
	}
	
}
class Sqr implements AP{
	int  s=0;
	double area=0,perimeter=0;
	public void input() {
		Scanner sq =new Scanner(System.in);
		s= sq.nextInt();
		
	}
	public void area() {
		area = s*s;
		System.out.println("Area of Square: "+area);
	}
	public void perimeter() {
		perimeter =4*s;
		System.out.println("Perimeter of Square: "+perimeter);
	}
	
}

class tri implements AP{
	int  a=0,b=0,c=0;
	double area=0,perimeter=0;
	public void input() {
		Scanner tr =new Scanner(System.in);
		a= tr.nextInt();
		b= tr.nextInt();
		c= tr.nextInt();
	}
	public void area() {
		double s=(a+b+c)/2;
		area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area of Triangle: "+area);
	}
	public void perimeter() {
		perimeter =a+b+c;
		System.out.println("Perimeter of Triangle: "+perimeter);
	}
	
}


class IFaceDemo{
	public static void main(String[] args) {
		int ch;
		Circle c =new Circle();
		Rectangle r =new Rectangle();
		Sqr sq =new Sqr();
		tri t =new tri();
		Scanner sc = new Scanner(System.in);
		
		 while(true) {
			 System.out.println("\n1.Area of Circle \n2.Area of Rectangle \n3.Perimeter of Circle \n4.perimeter of Rectangle \n5.Area of Square\n6.perimeter of square\n7.Area of Triangle\n8.perimeter of Triangle \n9.Exit");
			System.out.print("Enter choice:");
			ch=sc.nextInt();
			switch(ch) {
				case 1:
					System.out.print("Enter radius to Calculate area:\n");
					c.input();
					c.area();
					break;
				case 2:
					System.out.print("Enter Length and breadth to Calculate area:\n");
					r.input();
					r.area();
					break;
				case 3:
					System.out.print("Enter radius to Calculate Circumference:\n");
					c.input();
					c.perimeter();
					break;
				case 4:
					System.out.print("Enter Length and breadth to Calculate perimeter:\n");
					r.input();
					r.perimeter();
					break;	
				case 5:
					System.out.print("Enter Side to Calculate Area of Square:\n");
					sq.input();
					sq.area();
					break;
				case 6:
					System.out.print("Enter Side to Calculate Perimeter of Square:\n");
					sq.input();
					sq.perimeter();
					break;	
				case 7:
					System.out.print("Enter base and height to Calculate Area of Triangle:\n");
					t.input();
					t.area();
					break;
				case 8:
					System.out.print("Enter Sides to Calculate perimeter of Triangle:\n");
					t.input();
					t.perimeter();
					break;		
				case 9:
					System.out.print("Bye!\n");
					System. exit(0);
					break;
				default:
					System.out.print("Invalid Choice\n");
			
			
			
			
			}
		}
		
		
	}
}
