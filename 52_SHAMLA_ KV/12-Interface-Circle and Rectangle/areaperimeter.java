package program;
import java.util.Scanner;

 interface AP{
	void input();
	void area();
	void perimeter();
	

}
class Circle implements AP{
	int r=0;
	double pi=3.14,area=0,perimeter=0;
	public void input() {
	Scanner c=new Scanner(System.in);
	r=c.nextInt();
		
	}
	public void area() {
		area=pi*r*r;
		System.out.println("Area of circle:"+area);
		
		
	}
	public void perimeter() {
		perimeter=2*pi*r;
		System.out.println("Perimeter of circle:"+perimeter);
		
	}
}
class Square implements AP{
	int a=0;
	
	public void input() {
	Scanner aa=new Scanner(System.in);
	a=aa.nextInt();
		
	}
	public void area() {
		int area = a*a;
		System.out.println("Area of square:"+area);
		
		
	}
	public void perimeter() {
		int perimeter = 4*a;
		System.out.println("Perimeter of square:"+perimeter);
		
	}
}
class Rectangle implements AP{
	int l=0,b=0;
	double area,perimeter;
	public void input() {
	Scanner r=new Scanner(System.in);
	l=r.nextInt();
	b=r.nextInt();
		
	
}
	public void area() {
		area=l*b;
		System.out.println("Area of circle:"+area);
		
		
	}
	public void perimeter() {
		perimeter=2*(l+b);
		System.out.println("Perimeter of circle:"+perimeter);
		
	}
}
class Triangle implements AP{
	int b=0,h=0;
	double pi=3.14,area=0,perimeter=0;
	public void input() {
	Scanner tr=new Scanner(System.in);
	b=tr.nextInt();
	h=tr.nextInt();
	int l = tr.nextInt();
		
	}
	public void area() {
		area=pi*b*h;
		System.out.println("Area of triangle:"+area);
		
		
	}
	public void perimeter() {
		perimeter=l*b*h;
		System.out.println("Perimeter of triangle:"+perimeter);
		
	}



public class areaperimeter{
	public static void main(String [] args) {
		int ch;
		Circle c=new Circle();
		Rectangle r=new Rectangle ();
		Square aa=new Square();
		Triangle t=new Triangle();
		Scanner sc=new  Scanner(System.in);
		System.out.println("1:Area of cirlce");
		System.out.println("2:Area of reactangle");
		System.out.println("3:perimeter of circle");
		System.out.println("4:perimeter of reactangle");
		
		System.out.println("5:Area of sqaure");
		System.out.println("6:perimeter of square");
		System.out.println("7:Area of Triangle");
		System.out.println("8:perimeter of Traingle");
		System.out.println("9:Program termination");
		
		lp:while(true) {
			System.out.print("Make your choice:");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.print("Enter the radius of the cirlce\n");
				c.input();
				c.area();
				break;
			case 2:
				System.out.print("Enter the length and breadth of the rectangle\n");
				r.input();
				r.area();
				break;
			case 3:
				System.out.print("Enter the radius of the cirlce\n");
				c.input();
				c.perimeter();
				break;
			case 4:
				System.out.print("Enter the length and breadth of the rectangle\n");
				r.input();
				r.perimeter();
				break;
			case 5:
				System.out.print("Enter the side length of the square\n");
				aa.input();
				aa.area();
				break;
			case 6:
				System.out.print("Enter the side length of the square\n");
				aa.input();
				aa.perimeter();
				break;
			case 7:
				System.out.print("Enter the base and height of the triangle\n");
				t.input();
				t.area();
				break;
			case 8:
				System.out.print("Enter the base length and height of the triangle\n");
				t.input();
				t.perimeter();
				break;
			case 9:
				break lp;
			default:
				System.out.print("Invalid choic!please make a valid choice....");
				
			}
		}
		
		
	}
}
}
