package circ_rect;
import java.util.Scanner;


public class Triangle implements AP{
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
