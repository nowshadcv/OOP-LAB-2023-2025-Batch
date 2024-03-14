package ComplexAdd;

import java.util.Scanner;


public class ComplexAdd {
	
	double real,img;
	ComplexAdd(double r,double i){
		real=r;
		img=i;
	}
	public static ComplexAdd sum(ComplexAdd c1,ComplexAdd c2) {
		ComplexAdd temp=new ComplexAdd(0,0);
		temp.real=c1.real+c2.real;
		temp.img=c1.img+c2.img;
		return temp;
	}
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the real part of first complex number");
		int r = s.nextInt();
		System.out.println("enter the real part of second complex number");
		int p = s.nextInt();
		System.out.println("enter the img part of first complex number");
		int i = s.nextInt();
		System.out.println("enter the img part of second complex number");
		int q = s.nextInt();
		
		ComplexAdd c1=new ComplexAdd(r,i);
		ComplexAdd c2=new ComplexAdd(p,q);
		ComplexAdd temp=sum(c1,c2);
		System.out.printf("sum is:"+temp.real+ "+"+temp.img+"i");
	}



}
