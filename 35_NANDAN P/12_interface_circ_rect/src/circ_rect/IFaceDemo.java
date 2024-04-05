package circ_rect;
import java.util.Scanner;

public class IFaceDemo {
	public static void main(String[] args) {
		 int ch;
		 Circle c=new Circle();
		 Rectangle r=new Rectangle();
		 Square q=new Square();
		 Triangle t=new Triangle();
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("1: Area Of Circle");
		 System.out.println("2: Area Of  Reactangle");
		 System.out.println("3: Perimeter Of Circle");
		 System.out.println("4: Perimeter Of Rectangle");
		 System.out.println("5: Area Of Square");
		 System.out.println("6: Area Of Triangle");
		 System.out.println("7: Perimeter Of Square");
		 System.out.println("8: Perimeter Of Triangle");
		 System.out.println("9: Program Termination");
	 

lp : while(true) {
	 System.out.println("Make Your Chouice!!!");
	 ch=sc.nextInt();
	 switch(ch) {
	 case 1:
		 System.out.println("Enter Radius Of Circle \n");
		 c.input();
		 c.area();
		 break;
		 
	 case 2:
		 System.out.println("Enter Length And Breadth Of Rectangle \n");
		 r.input();
		 r.area();
		 break;
		 
	 case 3:
		 System.out.println("Enter Radius Of Circle \n");
		 c.input();
		 c.perimeter();
		 break;
		 
	 case 4:
		 System.out.println("Enter Length And Breadth Of Rectangle \n");
		 r.input();
		 r.perimeter();
		 break;
		 
	 case 5:
		 System.out.println("Enter length of square \n");
		 c.input();
		 c.area();
		 break;
		 
	 case 6:
		 System.out.println("Enter length,Breadth,Height of Triangle \n");
		 t.input();
		 t.area();
		 break;
	 case 7:
		 System.out.println("Enter length of square \n");
		 c.input();
		 c.perimeter();
		 break;
		 
		 
	 case 8:
		 System.out.println("Enter length,Breadth,Height of Triangle \n");
		 t.input();
		 t.perimeter();
		 break;
	 case 9:
		 break lp;
	default:
		 System.out.println("Invalid Choice!!!!Make A Valid Choice!!!! \n");
	 }
}

	}}
