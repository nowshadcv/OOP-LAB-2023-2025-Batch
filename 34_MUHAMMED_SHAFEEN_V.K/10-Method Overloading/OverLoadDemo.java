package cpu_details;
import java.util.Scanner;
public class OverLoadDemo {
	void area(float x) {
		System.out.println("Area of the square is "+Math.pow(x, 2)+" sq units");
	}
	void area(float x, float y) {
		System.out.println("The area of the rectangle is "+x*y+" sq units");
	}
	void area(double x) {
		double z =3.14 * x*x;
		System.out.println("the are a of the circle is "+z+" sq units");
	}
}
class OverLoad{
	public static void main(String args[]) {
		OverLoadDemo ob = new OverLoadDemo();
		Scanner sc = new Scanner(System.in);
		Scanner fl = new Scanner(System.in);
	while(true) {
		System.out.println("Enter your choice: ");
		System.out.println("1.Area of Square");
		System.out.println("2.Area of Rectangle");
		System.out.println("3.Area of Circle");
		System.out.println("4.Exit");
		int choice;
		float a,b;
		double c;
		choice = sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter the length of the square: ");
			a=fl.nextFloat();
			ob.area(a);
			break;
		case 2:
			System.out.println("enter the length of the rectangle: ");
			a=fl.nextFloat();
			System.out.println("Enter the breadth if the rectangle: ");
			b=fl.nextFloat();
			ob.area(a,b);
		case 3:
			System.out.println("Enter the radius of the circle: ");
			c=fl.nextDouble();
			ob.area(c);
			break;
		case 4:
			System.out.println("Exiting......");
			System.exit(0);
			break;
		default:
			System.out.println("invalid choice");
			break;
		}
	}
}
}