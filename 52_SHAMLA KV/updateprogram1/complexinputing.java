package program;

import java.util.Scanner;

public class complexinputing {
	double real, img;
	complexinputing(double r,double i ){
		real=r;
		img=i;
	}
	public static complexinputing sum(complexinputing c1,complexinputing c2){
		complexinputing temp=new complexinputing(0,0);
		temp.real=c1.real+c2.real;
		temp.img=c1.img+c2.img;
		return temp;}
	public static void main(String args[]) {
		Double r1,r2,i1,i2;
		Scanner s=new Scanner (System.in);
		System.out.print("enter numbers of first real part:");;
		r1=s.nextDouble();
		System.out.print("enter number of second real part:");
		r2=s.nextDouble();
		System.out.print("enter numbers of first imaginary number :");;
		i1=s.nextDouble();
		System.out.print("enter number of second imaginary number:");
		i2=s.nextDouble();
		complexinputing c1= new complexinputing(r1,i1);
		complexinputing c2=  new complexinputing(r2,i2);
		complexinputing temp=sum(c1,c2);
		System.out.printf("sum is:"+temp.real+"+"+temp.img+"i");}

}


