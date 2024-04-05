package project1;
import java.util.Scanner;
interface AP{
	void input();
	void area();
	void perimeter();}
class Circle implements AP{
	int r=0;
	double pi=3.14,area=0,perimeter=0;
	public void input() {
		Scanner c=new Scanner(System.in);
		r=c.nextInt();}
	public void area() {
		area=pi*r*r;
		System.out.println("Area of circle:"+area);}
	public void perimeter() {
		perimeter=2*pi*r;
		System.out.println("Perimeter of circle:"+perimeter);}}
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
		System.out.println("Perimeter of Rectangle:"+perimeter);}}
class Triangle implements AP{
	int b=0,h=0,s1,s2;
	double area,perimeter;
	public void input() {
		Scanner a=new Scanner(System.in);
		b=a.nextInt();
		h=a.nextInt();
		s1=a.nextInt();
		s2=a.nextInt();}
	public void area() {
		area=0.5*b*h;
		System.out.println("Area of Triangle:"+area);}
	public void perimeter() {
		perimeter=b+s1+s2;
		System.out.println("Perimeter of Triangle:"+perimeter);}}
class Square implements AP{
	int a=0;
	double area,perimeter;
	public void input() {
		Scanner b=new Scanner(System.in);
		a=b.nextInt();}
	public void area() {
		area=a*a;
		System.out.println("Area of Square:"+area);}
	public void perimeter() {
		perimeter=4*a;
		System.out.println("Perimeter of Square:"+perimeter);}}
public class interface_rc{
	public static void main(String[] args) {
		int ch;
		Circle c=new Circle();
		Rectangle r=new Rectangle();
		Triangle b=new Triangle();
		Square a=new Square();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("1:Area of Circle");
		System.out.println("2:Area of Rectangle");
		System.out.println("3:Area of Triangle");
		System.out.println("4:Area of Square");
		System.out.println("5:Perimeter of Circle");
		System.out.println("6:Perimeter of Rectangle");
		System.out.println("7:Perimeter of Triangle");
		System.out.println("8:Perimeter of Square");
		System.out.println("9:Program termination");
		
		lp:while(true) {
			System.out.print("Make your choice:");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter the radius of the circle \n");
				c.input();
				c.area();
				break;
			case 2:
				System.out.print("Enter the length and breadth of rectangle \n");
				r.input();
				r.area();
				break;
			case 3:
				System.out.print("Enter the length of the Square \n");
				a.input();
				a.area();
				break;
			case 4:
				System.out.print("Enter the base height and other two sides \n");
				b.input();
				b.area();
				break;
			case 5:
				System.out.print("Enter the radius of the circle \n");
				c.input();
				c.perimeter();
			case 6:
				System.out.print("Enter the length and breadth of the Rectangle \n");
				r.input();
				r.perimeter();
				break;
			case 7:
				System.out.print("Enter the base height and other two sides \n");
				a.input();
				a.perimeter();
				break;
			case 8:
				System.out.print("Enter the base height and other two sides \n");
				b.input();
				b.perimeter();
				break;
			case 9:
				break lp;
	default:
		System.out.print("Invalid choice! Please make a valid choice..");
		    }
		}
	}
}
