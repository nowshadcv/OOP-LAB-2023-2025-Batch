package complex1;

import java.util.Scanner ;

public class complex1 {

	public static void main (String args[]) {
		Scanner s= new Scanner (System.in); 
		System.out.print ("Enter real part of the first complex number:");
		double r1=s.nextDouble();
		System.out.print ("Enter imaginary part of the first complex number:");
		double i1=s.nextDouble();
		System.out.print ("Enter real part of the second complex number:");
		double r2=s.nextDouble();
		System.out.print ("Enter imaginary part of the second complex number:");
		double i2=s.nextDouble();
	    
		 
		 double realresult=r1+r2;
		 double imgresult=i1+i2;
		 System.out.println("The two complex number: " + realresult+ " + " +imgresult+ "i" ) ;
		 s.close();
		 
		 
		 
	}

}
