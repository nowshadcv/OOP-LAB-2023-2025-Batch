package project1;
import java.util.Scanner;
public interface AP {
	void input();
	void area();
	void perimeter();
}
class Circle implements AP{
	int r=0;
	double pi=3.14,area=0,perimeter=0;

	@Override
	public void input() {
		// TODO Auto-generated method stub
		Scanner c=new Scanner(System.in);
		r=c.nextInt();
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		area=pi*r*r;
		System.out.println("Area of Circle"+area);
	}

	@Override
	public void perimeter() {
		// TODO Auto-generated method stub
		perimeter=2*pi*r;
		System.out.println("Perimeter of Circle: "+perimeter);
	}
	
}
class Rectangle implements AP{

	int l=0,b=0;
	double area,perimeter;
	@Override
	public void input() {
		// TODO Auto-generated method stub
		Scanner r=new Scanner(System.in);
		l=r.nextInt();
		b=r.nextInt();
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		area=l*b;
		System.out.println("Area of rectangle: "+area);
	}

	@Override
	public void perimeter() {
		// TODO Auto-generated method stub
		perimeter=2*(l+b);
		System.out.println("Perimeter of Rectangle: "+perimeter);
	}
}
class Square implements AP{
	int sl=0;
	double area,perimeter;
	@Override
	public void input() {
		// TODO Auto-generated method stub
		Scanner b=new Scanner(System.in);
		sl=b.nextInt();
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		area=sl*sl;
		System.out.println("Area of Square: "+area);
	}

	@Override
	public void perimeter() {
		// TODO Auto-generated method stub
		perimeter=4*sl;
		System.out.println("Perimeter of Square: "+perimeter);
	}
	
}
class Triangle implements AP{
	int l=0,b=0,h=0;
	double area,perimeter;
	@Override
	public void input() {
		// TODO Auto-generated method stub
		Scanner t=new Scanner(System.in);
		l=t.nextInt();
		b=t.nextInt();
		h=t.nextInt();
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		area=0.5*b*h;
		System.out.println("Area of Triangle: "+area);
	}

	@Override
	public void perimeter() {
		// TODO Auto-generated method stub
		perimeter=l+b+h;
		System.out.println("Perimeter of Triangle: "+perimeter);
	}
	


public class IFaceDemo{
	public static void main(String[] args) {
		int ch;
		Circle c=new Circle();
		Rectangle r=new Rectangle();
		Square s=new Square();
		Triangle t=new Triangle();
		Scanner sc=new Scanner(System.in);
		System.out.println("1:Area of Circle");
		System.out.println("2:Area of Rectangle");
		System.out.println("3:Perimeter of Circle");
		System.out.println("4:Perimeter of Perimeter");
		System.out.println("5:Area of Square");
		System.out.println("6:Perimeter of Square");
		System.out.println("7:Area of Triangle");
		System.out.println("8:Perimeter of Triangle");
		System.out.println("9:Program termination");
		lp:while(true) {
			System.out.println("Make your choice:");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter the radius of the circle\n");
				c.input();
				c.area();
				break;
			case 2:
				System.out.println("Enter the length and breadth of the rectangle\n");
				r.input();
				r.area();
				break;
			case 3:
				System.out.println("Enter the radius of the circle\n");
				c.input();
				c.perimeter();
				break;
			case 4:
				System.out.println("Enter the length and breadth of the rectangle\n");
				r.input();
				r.perimeter();
				break;
			case 5:
				System.out.println("Enter the side length of square\n");
				s.input();
				s.area();
				break;
			case 6:
				System.out.println("Enter the side length of square\n");
				s.input();
				s.perimeter();
				break;
			case 7:
				System.out.println("Enter the length,breadth and height of triangle\n");
				t.input();
				t.area();
				break;
			case 8:
				System.out.println("Enter the length,breadth and height of triangle\n");
				t.input();
				t.perimeter();
				break;	
			case 9:
				break lp;
			default:
				System.out.println("Invalid choice! Please make a valid choice...");
			}
		}
		
	}
}
}
