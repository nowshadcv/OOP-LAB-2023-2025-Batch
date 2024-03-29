
package programs;
import java.util.Scanner;
class OverLoadDemo{
	public static float area(float x) {
		return x*x;
		}
	public static float area(float x,float y) {
		return x*y;
	}
	public static double area(double x) {
		return 3.14*x*x;
	}
}
public class Overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 OverLoadDemo ob=new  OverLoadDemo();
		System.out.println("Enter the side length");
		float len=sc.nextFloat();
		float area1=ob.area(len);
		System.out.println("Area of Square:"+area1);
		
		System.out.println("Enter the length of rectangle");
		float len1=sc.nextFloat();
		System.out.println("Enter the breadth of rectangle");
		float b1=sc.nextFloat();
		float area2=ob.area(len1,b1);
		System.out.println("Area of Rectangle:"+area2);
		
		System.out.println("Enter the radius of circle");
		double radius=sc.nextDouble();
		double area3=ob.area(radius);
		System.out.println("Area of Circle:"+area3);

		
		
	}

}
