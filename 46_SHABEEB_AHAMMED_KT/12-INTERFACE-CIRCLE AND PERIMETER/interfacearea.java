package interfacearea;

import java.util.Scanner;

interface AP{
	void input();
	void area();
	void perimeter();
}

class Circle implements AP{
	int r= 0;
	double pi=3.14,area=0,perimeter=0;
	public void input() {
		Scanner c=new Scanner(System.in);
		r=c.nextInt();}
	public void area() {
			area=pi*r*r;
			System.out.println("Area of Circle:" + area);
	}
	public void perimeter() {
		perimeter=2*pi*r;
		System.out.println("Perimeter of Circle:" + perimeter);
}
		
		
 }


class Square implements AP{
	int r= 0;
	double area=0,perimeter=0;
	public void input() {
		Scanner q=new Scanner(System.in);
		r=q.nextInt();}
	public void area() {
			area=r*r;
			System.out.println("Area of Square:" + area);
	}
	public void perimeter() {
		perimeter=4*r;
		System.out.println("Perimeter of Square:" + perimeter);
}
		
		
 }
 
class Triangle implements AP{
	int b=0,h=0,e=0;
	double area=0,perimeter=0;
	public void input() {
		Scanner t=new Scanner(System.in);
		b=t.nextInt();
		e=t.nextInt();
		h=t.nextInt();}
	public void area() {
			area=(b*h*e)/2;
			System.out.println("Area of Triangle:" + area);
	}
	public void perimeter() {
		perimeter=b*h*e;
		System.out.println("Perimeter of Triangle:" + perimeter);
}
		
		
 }
 
class Rectangle implements AP{
		int l= 0,b=0;
		double area=0,perimeter=0;
		public void input() {
			Scanner r=new Scanner(System.in);
			l=r.nextInt();
			b=r.nextInt();}
		public void area() {
				area=l*b;
				System.out.println("Area of Circle:" + area);
		}
		public void perimeter() {
			perimeter=2*(l*b);
			System.out.println("Perimeter of Circle:" + perimeter);
	}
		
		}
			
			
	 
 
 public class interfacearea{
	 public static void main(String[] args) {
		 int ch;
		 Circle c=new Circle();
		 Rectangle r=new Rectangle();
		 Square q=new Square();
		 Triangle t=new Triangle();
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("1: Area Of Circle");
		 System.out.println("2: Area Of  Reactangle");
		 System.out.println("3: Perimeter Of Circle");
		 System.out.println("4: Perimeter Of Rectangle");
		 System.out.println("5: Area Of Square");
		 System.out.println("6: Area Of Triangle");
		 System.out.println("7: Perimeter Of Square");
		 System.out.println("8: Perimeter Of Triangle");
		 System.out.println("9: Program Termination");
	 
 
 lp : while(true) {
	 System.out.println("Make Your Chouice!!!");
	 ch=sc.nextInt();
	 switch(ch) {
	 case 1:
		 System.out.println("Enter Radius Of Circle \n");
		 c.input();
		 c.area();
		 break;
		 
	 case 2:
		 System.out.println("Enter Length And Breadth Of Rectangle \n");
		 r.input();
		 r.area();
		 break;
		 
	 case 3:
		 System.out.println("Enter Radius Of Circle \n");
		 c.input();
		 c.perimeter();
		 break;
		 
	 case 4:
		 System.out.println("Enter Length And Breadth Of Rectangle \n");
		 r.input();
		 r.perimeter();
		 break;
		 
	 case 5:
		 System.out.println("Enter length of square \n");
		 c.input();
		 c.area();
		 break;
		 
	 case 6:
		 System.out.println("Enter length,Breadth,Height of Triangle \n");
		 t.input();
		 t.area();
		 break;
	 case 7:
		 System.out.println("Enter length of square \n");
		 c.input();
		 c.perimeter();
		 break;
		 
		 
	 case 8:
		 System.out.println("Enter length,Breadth,Height of Triangle \n");
		 t.input();
		 t.perimeter();
		 break;
	 case 9:
		 break lp;
	default:
		 System.out.println("Invalid Choice!!!!Make A Valid Choice!!!! \n");
	 }
 }
 
	 }
	 }
