package complexnumber;
import java.util.Scanner;
public class ComplexNumber{
	
	double real,img;
	ComplexNumber(double r,double i){
        real = r; img = i;
    }
	
		public static ComplexNumber sum(ComplexNumber c1,ComplexNumber c2)
		{
            ComplexNumber temp = new ComplexNumber (0,0);
			temp.real = c1.real + c2.real;
			temp.img =c1.img + c2.img;
			return temp;
		}
		public static void main(String args[])
		{
			Scanner s = new Scanner(System.in);
			
			System.out.print("enter the real part of first complex number: ");
			double r = s.nextInt();
			System.out.print("enter the real part of seccond complex number: ");
			double p = s.nextInt();
			System.out.print("enter the image part of first complex number: ");
			double i = s.nextInt();
			System.out.print("enter the image part of seccond complex number: ");
			double q = s.nextInt();

			
			ComplexNumber c1= new ComplexNumber(r,i);
			ComplexNumber c2 = new ComplexNumber(p,q);
			ComplexNumber temp = sum(c1,c2);
			System.out.printf("Sum is :"+temp.real + "+" + temp.img  + "i");
		}
	}