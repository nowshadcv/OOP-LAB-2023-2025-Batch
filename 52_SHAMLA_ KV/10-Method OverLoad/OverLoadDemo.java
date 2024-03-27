package program;
import java.util.Scanner;
public class OverLoadDemo {
	
		void area(float x) {
			System.out.println("The area of the square is "+Math.pow(x, 2)+"sq units");
		}
		void area(float x,float y) {
			System.out.println("The area of the rectangle is "+x*y+"sq units");
		}
		void area(double x) {
			double z=3.14*x*x;
			System.out.println("The area of the circle is "+z+"sq units");
		}
		

	}
	class overload{
		public static void main(String args[]) {
			 OverLoadDemo ob=new  OverLoadDemo();
			Scanner scan=new Scanner (System.in);
			System.out.println("CHOOSE 1,2 OR 3 FROM THE GIVEN MENU");
			System.out.println("1.AREA OF SQUARE");
			System.out.println("2.AREA OF RECTANGLE");
			System.out.println("3.AREA OF CIRCLE");
			int choice;
			choice=scan.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the length of sides:");
				float s=scan.nextFloat();
				ob.area(s);
				break;
			case 2:
				System.out.println("Enter the length of rectangle:");
				float l=scan.nextFloat();
				System.out.println("Enter the breadth of rectangle:");
				float b=scan.nextFloat();
				ob.area(l,b);
				break;
			case 3:
				System.out.println("Enter the radius:");
				double r=scan.nextDouble();
				ob.area(r);
				break;
							
			}
			
		}
	}