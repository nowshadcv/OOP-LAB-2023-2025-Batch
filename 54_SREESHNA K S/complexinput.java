package project1;
import java.util.Scanner;
public class complexinput {
	double real,img;
	complexinput(double r,double i){
		real=r; img=i;
		}
	public static complexinput sum(complexinput c1,complexinput c2) {
		complexinput temp=new complexinput(0,0);
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
		System.out.print("Enter the imaginary part of number 2  ");
		n=s.nextDouble();
		complexinput c1=new complexinput(p,q);
		complexinput c2=new complexinput(m,n);
		complexinput temp=sum(c1,c2);
		System.out.printf("sum is:"+temp.real+"+"+temp.img+"i");
	

}
}