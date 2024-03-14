package programs;
import java.util.Scanner;
public class MatrixAdd {

	public static void main(String[] args) {
		int p,q,m,n,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows of Matrix A:");
		p=sc.nextInt();
		System.out.println("Enter the number of columns of Matrix A:");
		q=sc.nextInt();
		System.out.println("Enter the number of rows of Matrix B:");
		m=sc.nextInt();
		System.out.println("Enter the number of columns of Matrix B:");
		n=sc.nextInt();
		if(p==m&&q==n) {
			int a[][]=new int[p][q];
			int b[][]=new int[m][n];
			System.out.println("Enter the elements of Matrix A:");
			for(i=0;i<p;i++)
				for(j=0;j<q;j++)
					a[i][j]=sc.nextInt();
			System.out.println("Enter the number of columns of Matrix B:");	
			for(i=0;i<m;i++)
				for(j=0;j<n;j++)
					b[i][j]=sc.nextInt();
			System.out.println("Matrix A:");
			for(i=0;i<p;i++)
				for(j=0;j<q;j++) {
					System.out.println(a[i][j]+" ");
			        System.out.println();
				}
			System.out.println("Matrix B:");
			for(i=0;i<m;i++)
				for(j=0;j<n;j++) {
					System.out.println(b[i][j]+" ");
			        System.out.println();
				}
			System.out.println("The Sum Matrix: ");
			for(i=0;i<m;i++)
			{
				for(j=0;j<n;j++)
				{
					System.out.println(a[i][j]+b[i][j]+" ");
					System.out.println();
				
				}
			}
		}
			
			else {
				System.out.println("These Matrices cannot be Added....");
			}
			
		}
}
		
		
			
		




