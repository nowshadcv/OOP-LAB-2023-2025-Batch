package circ_rect;
import java.util.Scanner;

public class Square implements AP{
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
