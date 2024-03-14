package shabana;
import java.util.Scanner;
public class complexNumber {
	double real , img ;
	complexNumber(double r,double i){
		real = r ; img = i ;}
	public static complexNumber sum(complexNumber c1,complexNumber c2) {
		complexNumber temp = new complexNumber(0,0);
		temp.real = c1.real + c2.real;
		temp.img = c1.img + c2.img;
		return temp ;}
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
		complexNumber c1=new complexNumber(p,q);
		complexNumber c2=new complexNumber(m,n);
		complexNumber temp=sum(c1,c2);
		System.out.printf("sum is:"+temp.real+"+"+temp.img+"i");
	

}
}
