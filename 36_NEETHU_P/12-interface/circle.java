package project12;
import java.util.Scanner;
interface AP{
	void input();
	void area();
	void perimeter();}

class circle implements AP{
	 int r=0;
	 double pi=3.14,area=0,perimeter=0;
	 public void input() {
		 Scanner c=new Scanner (System.in);
		 r=c.nextInt();}
	 public void area() {
		 area=pi*r*r;
		 System.out.println("area of circle:" + area);}
	 public void perimeter() {
		 perimeter=2*pi*r;
		 System.out.println("perimeter of circle:" + perimeter);}}

class Rectangle implements AP{
	 int l=0,b=0;
	 double area,perimeter;
	 public void input() {
		 Scanner r=new Scanner (System.in);
		 l=r.nextInt();
		 b=r.nextInt();}
	 public void area() {
		 area=l*b;
		 System.out.println("area of Rectangle:" + area);}
	 public void perimeter() {
		 perimeter=2*(l+b);
		 System.out.println("perimeter of Rectangle:" + perimeter);}}

 class IFaceeDemo{
			public static void main(String[] args) {
				int ch;
				circle c = new circle();
				Rectangle r =new Rectangle();
				Scanner sc =new Scanner(System.in);
				
				 System.out.println("1.area of circle:");
				 System.out.println("2.area of Rectangle:");
				 System.out.println("3.perimeter of circle:");
				 System.out.println("4.perimeter of Rectangle:");
				 System.out.println("program termination:" );




			lp:while(true) {
				System.out.print("make your choice:");
				ch = sc.nextInt();
				switch (ch) {
				case 1:
					System.out.print("enter the radius of the circle:\n");
					c.input();
					c.area();
					break;
					case 2:
						System.out.print("enter the length and breadth of the rectangle:\n");
						r.input();
						r.area();
						break;
						case 3:
							System.out.print("enter the radius of the circle:\n");
							c.input();
							c.perimeter();
							break;
						case 4:
							System.out.print("enter the  length and breadth of the rectangle:\n");
							r.input();
							r.perimeter();
							break;
						case 5:
							break lp;
					default:
						System.out.println("invalid choice! please make a valid choice..");}}}}
					
					


	 
	 	 
	 

