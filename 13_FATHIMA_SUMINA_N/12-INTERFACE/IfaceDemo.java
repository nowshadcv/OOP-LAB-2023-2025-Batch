package sort;
import java.util.Scanner;
interface AP{
		void input(); 
		void area();
		void perimeter();}
class Circle implements AP{
		int r=0;
		double pi =3.14;
		double area= 0;
		double perimeter=0;
		public void input(){
			Scanner c= new Scanner(System.in);
			r=c.nextInt();}
		public void area(){
			area= pi*r*r;
			System.out.println("Area of circle:"+ area);}
		public void perimeter(){
			perimeter =2*pi*r;
			System.out.println("Perimeter of circle:" + perimeter); }}
class Rectangle implements AP{
		int l=0,b=0; 
		double area, perimeter;
		public void input(){
			Scanner r=new Scanner(System.in);
			l=r.nextInt(); 
			b=r.nextInt();}
		public void area(){
			area= l* b; 
			System.out.println("Area of rectangle:" +area);}
		public void perimeter(){
			perimeter= 2*(l+b);
			System.out.println("Perimeter of Rectangle:" + perimeter);}}
class Square implements AP{
		int l=0;
		double area, perimeter;
		public void input(){
			Scanner s=new Scanner(System.in);
			l=s.nextInt();  }
		public void area(){
			area= l* l; 
			System.out.println("Area of Square:" +area);}
		public void perimeter(){
			perimeter= 2*(l+l);
			System.out.println("Perimeter of Square:" + perimeter);}}
class Triangle implements AP{
		int b=0,h=0;
		double p=.5;
		double area= 0;
		double perimeter=0;
		public void input(){
			Scanner c= new Scanner(System.in);
			b=c.nextInt();
			h=c.nextInt();}
		public void area(){
			area= p*b*h;
			System.out.println("Area of Triangle:"+ area);}
		public void perimeter(){
			int b=0,a=0,c=0;
			Scanner t= new Scanner(System.in);
			a=t.nextInt();
			b=t.nextInt();
			c=t.nextInt();
			perimeter =a+b+c;
			System.out.println("Perimeter of triangle:" + perimeter); }}
public class IfaceDemo {
	public static void main(String[] args) {
		int ch;
		Circle c =new Circle();
		Rectangle r= new Rectangle();
		Square s= new Square();
		Triangle t= new Triangle();
		Scanner sC =new Scanner(System.in);
		System.out.println("1: Area of Circle");
		System.out.println("2: Area of Rectangle");
		System.out.println("3: Area of Square");
		System.out.println("4: Area of Triangle");
		System.out.println("5: Perimeter of Circle");
		System.out.println("6: Perimeter of Rectangle");
		System.out.println("7: Perimeter of Square");
		System.out.println("8: Perimeter of triangle");
		System.out.println("9: Program termination");
		Ip :while(true) {
		System.out.print("Make your choice: ");
		ch =sC.nextInt();
		switch (ch) {
			case 1:
				System.out.print("Enter the radius of the Circle \n");
				c.input();
				c.area();
				break;
			case 2:
				System.out.print("Enter the length and breadth of the Rectangle \n");
				r.input();
				r.area();
				break;
			case 3:
				System.out.print("Enter the length square \n");
				s.input();
				s.area();
				break;
			case 4:
				System.out.print("Enter the base and height \n");
				t.input();
				t.area();
				break;
			case 5:
				System.out.print("Enter the radius of the Circle \n");
				c.input();
				c.perimeter();
				break;
			case 6:
				System.out.print("Enter the length and breadth of the Rectangle \n");
				r.input();
				r.perimeter();
				break;
			case 7:
				System.out.print("Enter the length square \n");
				s.input();
				s.perimeter();
				break;
			case 8:
				System.out.print("Enter the 3 side of triangle \n");
				t.perimeter();
				break;
			case 9:
				break Ip;
			default:
				System.out.println("Invalid choice! Please make a valid choice..");}}}}