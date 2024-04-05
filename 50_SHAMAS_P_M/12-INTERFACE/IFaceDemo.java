package IFaceDemo;
import java.util.Scanner;
import java.lang.Math;


interface AP{
	void input();
	void area();
	void perimeter();
}

class circle implements AP{
	int r=0;
	double pi=3.14, area = 0, perimeter = 0;
	public void input() {
		Scanner c= new Scanner(System.in);
		r=c.nextInt();
	}
	public void area() {
		area = pi*r*r;
		System.out.println("area of circle:"+area);
	}
	public void perimeter() {
		perimeter = 2*pi*r;
		System.out.println("perimeter of circle:" + perimeter);
	}
}

class Rectangle implements AP{
	int l=0, b=0;
	double area, perimeter;
	public void input() {
		Scanner r= new Scanner(System.in);
		l= r.nextInt();
		b= r.nextInt();
	}
	public void area() {
		area = l*b;
		System.out.println("area of rectangle:"+area);
	}
	public void perimeter() {
		perimeter = 2*(l+b);
		System.out.println("perimeter of rectangle: "+ perimeter);
	}
}

class sqaure implements AP{
	int l=0; b=0;
	double area,perimeter;
	public void input() {
		Scanner sq = new Scanner(System.in);
		l= sq.nextInt();
	}
	public void area() {
		area = l*l;
		System.out.println("area of the square:" +area);
		
	}
	public void perimeter() {
		int l;
		perimeter = 4*l;
		System.out.println("perimeter of sqaure:" +perimeter);
	}
}

class Triangle implements AP{
	int a=0, b=0, c=0;
	double area,perimeter;
	public void input() {
		Scanner t = new Scanner(System.in);
		a = t.nextInt();
		b = t.nextInt();
		c = t.nextInt();
		
	}
	public void area() {
		double ar = (a+b+c)/2;
		area= Math.sqrt(ar*(ar-a)*(ar-b)*(ar-c));
		System.out.println("area of triangle:"+area);
	}
	public void perimeter() {
		perimeter = a+b+c;
		System.out.println("perimeter of triangle: "+ perimeter);
	}
	
	
}
public class IFaceDemo {
	public static void main(String[] args) {
		int ch;
		circle c= new circle();
		Rectangle r = new Rectangle();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. area of cirlce");
		System.out.println("2. Area of Rectangle");
		System.out.println("3. Area of sqaure");
		System.out.println("4. Area of triangle");
		System.out.println("5. perimeter of circle");
		System.out.println("6. perimeter of Rectangle");
		System.out.println("7. perimeter of square");
		System.out.println("8. perimeter of triangle");
		System.out.println("9. program termination");
		
		
lp:while(true) {
	System.out.println("make your choice:");
	ch= sc.nextInt();
	switch(ch) {
	case 1:
		System.out.println("enter the radius of the circle\n");
		c.input();
		c.area();
		break;
	case 2:
		System.out.println("enter the length and breadth of the Rectangle\n");
		r.input();
		r.area();
		break;
	case 3:
		System.out.println("enter the radius of the circle\n");
		c.input();
		c.perimeter();
		break;
	case 4:
		System.out.print("enter the length and breadth of the rectangle \n");
		r.input();
		r.perimeter();
		break;
	case 4:
		System.out.print("enter the length and breadth of the rectangle \n");
		r.input();
		r.perimeter();
		break;
	case 5:
		break lp;
default:
	System.out.println("invalid choice! please make a valid choice");
	}
	
}
}
}