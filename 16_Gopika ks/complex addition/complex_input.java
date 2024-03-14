package project1;
	import java.util.Scanner;
	public class complex_input {
		double real,img;
		complex_input(double r,double i){
			real=r; img=i;
			}
		public static complex_input sum(complex_input c1,complex_input c2) {
			complex_input temp=new complex_input(0,0);
			temp.real=c1.real+c2.real;
			temp.img=c1.img+c2.img;
			return temp;
		}
		public static void main(String[] args) {
			Double p,q,m,n;
			Scanner s=new Scanner(System.in);
			System.out.print("Enter the real part of number 1:");
			p=s.nextDouble();
			System.out.print("Enter the imaginary part of number 1:");
			q=s.nextDouble();
			System.out.print("Enter the real part of number 2:");
			m=s.nextDouble();
			System.out.print("Enter the imaginary part of number 2: ");
			n=s.nextDouble();
			complex_input c1=new complex_input(p,q);
			complex_input c2=new complex_input(m,n);
			complex_input temp=sum(c1,c2);
			System.out.printf("sum is:"+temp.real+"+"+temp.img+"i");
		

	}
	}

