package complexaddition;
import java.util.Scanner;
public class ComplexAddition {

	double real,img;
	ComplexAddition(double r,double i){
		real=r;img=i;
	}
	public static ComplexAddition sum(ComplexAddition c1, ComplexAddition c2) {
		return new ComplexAddition(c1.real+c2.real,c1.img+c2.img);

	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the real part of first complex number:");
		double real1=sc.nextDouble();
		System.out.println("enter the imaginary part of first complex number:");
		double img1=sc.nextDouble();
		
		System.out.println("enter the real part of second complex number:");
		double real2=sc.nextDouble();
		System.out.println("enter the imaginary part of second complex number:");
		double img2=sc.nextDouble();
		
		
		ComplexAddition c1=new ComplexAddition(real1,img1);
		ComplexAddition c2=new ComplexAddition(real2,img2);
		ComplexAddition temp=sum(c1,c2);
		System.out.printf("sum is: %.2f + %.2fi",temp.real, temp.img);
		
		sc.close();
		}
	}
	
