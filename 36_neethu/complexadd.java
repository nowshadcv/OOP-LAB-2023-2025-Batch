package complex;

import java.util.Scanner;

public class complexadd {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.print ("enter real part of the first  complex number: ");
		double real1 =s.nextDouble();
		System.out.print ("enter img part of the first  complex number: ");
		double img1 =s.nextDouble();
		System.out.print ("enter real part of the second  complex number: ");
		double real2 =s.nextDouble();
		System.out.print ("enter img part of the second  complex number: ");
		double img2 =s.nextDouble();
		double realResult=real1+real2;
		double imgResult=img1+img2;
		System.out.println("the sum of the complex numbers is:" + realResult + " + " + imgResult+"i");
		s.close();
		

	}

}
