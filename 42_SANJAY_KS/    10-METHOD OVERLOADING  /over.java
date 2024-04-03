package over;
import java.util.Scanner;
class over{
	void area(float x) {
		System.out.println("the area of square is "+Math.pow(x,2)+" SQ units");}
	
	void area(float x,float y) {
		System.out.println("the area of rectangle is "+x*y+" SQ units");}
	
	void area(double x) {
		double z=3.14*x*x;
		System.out.println("the area of circle is "+z+" SQ units");}
	}

class overload1{
	public static void main(String args[]){
		Scanner scan = new Scanner (System.in);
		
		overin ob=new overin();
		while(true) {
		System.out.println("enter your choice:");
		System.out.println("1-SQUARE:");
		System.out.println("2-RECTANGLE:");
		System.out.println("3-CIRCLE:");
		int choice;
		choice=scan.nextInt();
		switch (choice) {
		case 1 :
			System.out.println("the area of square");
			System.out.println("Enter length");
					int x;
					x=scan.nextInt();
					ob.area(x);
					break;
					
					
		case 2 :
			System.out.println("the area of rectangle");
			System.out.println("Enter length");
					int y;
					y=scan.nextInt();
					int z;
					z=scan.nextInt();
					ob.area(y,z);
					break;
					
		case 3 :
			System.out.println("the area of circle");
			System.out.println("Enter Radius");
					double r;
					r=scan.nextDouble();
					ob.area(r);
					break;
				
		default:
			System.out.println("invalid");
			break;
		
		}
		}
		
		
		
	}
		
	
	
}
