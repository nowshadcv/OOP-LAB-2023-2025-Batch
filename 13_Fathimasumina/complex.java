package pack1;



import java.util.Scanner;

public class complex {
	double real, img;
	 complex(double r,double i){
	 real=r; img=i;}
	public static  complex sum(complex c1, complex c2) {
		 complex temp=new  complex(0,0);
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
		 complex c1=new  complex(r1,m2);
		 complex c2=new  complex(r2,m2);
		 complex temp=sum(c1,c2);
	    System.out.print("sum is :"+temp.real+"+"+temp.img+"i");
	}
}
