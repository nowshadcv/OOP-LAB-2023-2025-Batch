package complexnumber;

import java.util.Scanner;

public class complexnumberadd {
	double real, img;
	 complexnumberadd(double r,double i){
	 real=r; img=i;}
	public static  complexnumberadd sum(complexnumberadd c1, complexnumberadd c2) {
		 complexnumberadd temp=new  complexnumberadd(0,0);
		temp.real=c1.real+c2.real;
		temp.img=c1.img+c2.img;
		return temp ;}
	public static void  main(String args[]) {
		double r1,r2,m1,m2;
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the first real part:");
		 r1=sc.nextDouble();
		 System.out.println("Enter the second real part:");
		 r2=sc.nextDouble();
		 System.out.println("Enter the first imaginary part:");
		 m1=sc.nextDouble();
		 System.out.println("Enter the second imaginary part:");
		 m2=sc.nextDouble();
		 complexnumberadd c1=new  complexnumberadd(r1,m2);
		 complexnumberadd c2=new  complexnumberadd(r2,m2);
		 complexnumberadd temp=sum(c1,c2);
	    System.out.print("sum is :"+temp.real+"+"+temp.img+"i");
	}
}

