package packA;
import java.util.Scanner;

public class Matrixadd {

	public static void main(String[] args) {
		int p,q,m,n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of rows in Matrix A:");
		p=s.nextInt();
		System.out.println("Enter the number of columns in Matrix A:");
		q=s.nextInt();
		System.out.println("Enter the number of rows in Matrix B:");
		m=s.nextInt();
		System.out.println("Enter the number of columns in Matrix B:");
		n=s.nextInt();
		if(p==m&&q==n) {
			int a[][]=new int[p][q];
			int b[][]=new int[m][n];
		System.out.println("Enter the elements in Matrix A:");
		for (int i=0;i<p;i++)
			for (int j=0;j<q;j++)
				a[i][j]=s.nextInt();
		System.out.println("Enter the elements in Matrix B:");
		for (int i=0;i<m;i++)
			for (int j=0;j<n;j++)
				b[i][j]=s.nextInt();
		System.out.println("Matrix A:");
		for (int i=0;i<p;i++) {
			for (int j=0;j<q;j++)
				System.out.println(a[i][j]+"");
			System.out.println();		
		}
		System.out.println("Matrix B:");
		for (int i=0;i<m;i++) {
			for (int j=0;j<n;j++)
				System.out.println(b[i][j]+"");
			System.out.println();		
		}
		System.out.println("The sum matrix");
		for (int i=0;i<m;i++) {
			for (int j=0;j<n;j++)
				System.out.println(a[i][j]+b[i][j]);
			System.out.println();		
		}}
		else
		{
			System.out.println("These matrices cannot be added");		
		}
		// TODO Auto-generated method stub

	}

}
