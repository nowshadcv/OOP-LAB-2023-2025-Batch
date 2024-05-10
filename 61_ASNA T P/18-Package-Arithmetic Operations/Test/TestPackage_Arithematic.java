package Test;
import Arithematic.*;
import java.util.Scanner;
public class TestPackage_Arithematic {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number:");
		int n1=sc.nextInt();
		System.out.println("enter second number:");
		int n2=sc.nextInt();
		Addition ad=new Addition(n1,n2);
		System.out.println("sum:"+ad.addition());
		
		Subtraction sb=new Subtraction(n1,n2);
		System.out.println("difference:"+sb.subtraction());
		
		Multiplication Mul=new Multiplication(n1,n2);
		System.out.println("product:"+Mul.multiplication());
		
		Division div=new Division(n1,n2);
		System.out.println("quotient:"+div.Division());
		
		
		
		
		
		

	}

}
