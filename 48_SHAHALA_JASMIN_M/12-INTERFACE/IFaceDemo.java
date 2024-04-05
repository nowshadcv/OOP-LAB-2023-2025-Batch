package IFaceDemo;
import java.util.Scanner;
import java.lang.Math;
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
class Rectangle implements AP{
	int l=0,b=0;
	double area,perimeter;
	public void input() {
		Scanner r=new Scanner(System.in);
		l=r.nextInt();
		b=r.nextInt();}
		public void area() {
			area=l*b;
			System.out.println("Area of rectangle:"+area);}
			public void perimeter() {
				perimeter=2*(l+b);
				System.out.println("Perimeter of Rectangle:"+perimeter);
			}
		
	}
class square implements AP{
	int l=0,b=0;
	double area,perimeter;
	public void input() {
		Scanner sq=new Scanner(System.in);
		l=sq.nextInt();
	}
	public void area() {
		area=l*l;
		System.out.println("Area of square:"+area);
		}
	public void perimeter() {
		int l = 0;
		perimeter=4*l;
		System.out.println("perimeter of square:"+perimeter);
	}
}

class Triangle implements AP{
	int a=0,b=0,c=0;
	double area,perimeter;
	public void input() {
		Scanner t=new Scanner(System.in);
		a=t.nextInt();
		b=t.nextInt();
		c=t.nextInt();
	}
	public void area() {
		double ar=(a+b+c)/2;
		area=Math.sqrt(ar*(ar-a)+(ar-b)*(ar-c))
		System.out.println("Area of triangle:"+area);
		}
	public void perimeter() {
		
		perimeter=a+b+c;
		System.out.println("perimeter of square:"+perimeter);
	}
}



public class IFaceDemo {
	public static void main(String[] args) {
		int ch;
		Circle c=new Circle();
		Rectangle r=new Rectangle();
		Scanner sc=new Scanner(System.in);
		System.out.println("1:Area of Circle");
		System.out.println("2:Area of Rectangle");
		System.out.println("3:Area of Square");
		System.out.println("4:Area of Triangle");
		System.out.println("5:Perimeter o Circle");
		System.out.println("9:Perimeter of Rectangle");
		System.out.println("7:Perimeter of Square");
		System.out.println("8:Perimeter of Triangle");
		
		
		System.out.println("9:Program termination");
lp:while(true) {
	System.out.println("Make your choice:");
	ch=sc.nextInt();
	switch(ch) {
	case 1:
		System.out.println("Enter the radius of the Circle:\n");
		c.input();
		c.area();
		break;
	case 2:
		System.out.println("Enter the length and breadth of rectangle:\n\n");
		c.input();
		c.area();
		break;
	case 3:
		System.out.println("Enter the radius of Circle:\n\n");
		r.input();
		r.perimeter();
		break;
	case 4:
		System.out.println("Enter the length and breadth of rectangle:\n\n");
		r.input();
		r.perimeter();
		break;
	case 5:
		System.out.println("Enter the radius of Circle:\n\n");
		r.input();
		r.perimeter();
		break;
	case 6:
		System.out.println("Enter the length and breadth of rectangle:\n\n");
		r.input();
		r.perimeter();
		break;
	case 9:
		break lp;
default :
		System.out.println("invalid choice!please mahe a valid choice....");
		
		
		
		
		
		
		
		
	}
	
}
		
	}

}
