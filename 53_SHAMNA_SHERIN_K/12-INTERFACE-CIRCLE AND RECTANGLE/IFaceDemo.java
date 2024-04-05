package project1;
import java.util.Scanner;
interface AP{
	void input();
	void area();
	void perimeter();
}
class Circle implements AP{
	int r=0;
	double pi=3.14,area=0,perimeter=0;
	public void input(){
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
class Rectangle implements AP{
	int l=0,b=0;
	double area,perimeter;
	public void input(){
		Scanner r=new Scanner(System.in);
		l=r.nextInt();
		b=r.nextInt();
	}
	public void area() {
		area=l*b;
		System.out.println("Area of rectangle:"+area);
	}
	public void perimeter() {
		perimeter=2*(l+b);
		System.out.println("Perimeter of rectangle:"+perimeter);
	}	
}
class Square implements AP{
	int s;
	double area,perimeter;
	public void input(){
		Scanner x=new Scanner(System.in);
		s=x.nextInt();
	}
	public void area() {
		area=s*s;
		System.out.println("Area of Square:"+area);
	}
	public void perimeter() {
		perimeter=4*s;
		System.out.println("Perimeter of Square:"+perimeter);
	}
}
class Triangle implements AP{
	int b=0,h=0,s1,s2;
	double area,perimeter;
	public void input(){
		Scanner y=new Scanner(System.in);
		b=y.nextInt();
		h=y.nextInt();
		s1=y.nextInt();
		s2=y.nextInt();
	}
	public void area() {
		area=0.5*b*h;
		System.out.println("Area of Triangle:"+area);
	}
	public void perimeter() {
		perimeter=b+s1+s2;
		System.out.println("Perimeter of Triangle:"+perimeter);
	}
public class IFaceDemo {
	public static void main(String[] args) {
		int ch;
		Circle c=new Circle();
		Square s=new Square();
		Rectangle r=new Rectangle();
		Triangle t=new Triangle();
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Area of circle");
		System.out.println("2.Area of Rectangle");
		System.out.println("3.Area of Square");
		System.out.println("4.Area of Triangle");
		System.out.println("5.perimeter of circle");
		System.out.println("6.perimeter of rectangle");
		System.out.println("7.perimeter of Square");
		System.out.println("8.perimeter of Triangle");
		System.out.println("9.Program termination");
		lp:while(true) {
			System.out.print("Enter your choice:");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.print("Enter the radius of the circle\n");
				c.input();
				c.area();
				break;
			case 2:
				System.out.print("Enter the length and breadth of the rectangle\n");
				r.input();
				r.area();
				break;
			case 3:
				System.out.print("Enter the length of the square\n");
				s.input();
				s.area();
				break;
			case 4:
				System.out.print("Enter the base,heightand other two sides of triangle:");
				t.input();
				t.area();
				break;
			case 5:
				System.out.print("Enter the radius of the circle\\n");
				c.input();
				c.perimeter();
				break;
			case 6:
				System.out.print("Enter the length and breadth of the rectangle\n");
				r.input();
				r.perimeter();
				break;
			case 7:
				System.out.print("Enter the length of the square\n");
				s.input();
				s.perimeter();
				break;
			case 8:
				System.out.print("Enter the base,heightand other two sides of triangle:e\n");
				t.input();
				t.perimeter();
				break;
			case 9:
				System.out.println("Exiting.....");
				break lp;
			default:System.out.println("Invalid choice! please make a valid choice.....");
					
			}
		}
	}

}}
