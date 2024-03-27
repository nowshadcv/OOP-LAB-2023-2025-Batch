package Matrix;
import java.util.Scanner;

public class Matrix 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of rows and columns for matrices:");
		int rows=sc.nextInt();
		int cols=sc.nextInt();
		
		//initialize matrices
		int[][] matrix1=new int[rows][cols];
		int[][] matrix2=new int[rows][cols];
		
		System.out.println("enter the elements to the first matrix:");
		for (int i=0;i<rows;i++) 
		{
			for (int j=0;j<cols;j++) 
			{
				matrix1[i][j]=sc.nextInt();
			}
		}
		
//		second matrix
		System.out.println("enter the elements to the second matrix:");
		for (int i=0;i<rows;i++)
		{
			for (int j=0;j<cols;j++) 
			{
				matrix2[i][j]=sc.nextInt();
			}
		}


		//matrix addition
		int[][] resultmatrix=new int[rows][cols];
		for (int i=0;i<rows;i++)
		{
			for (int j=0;j<cols;j++)
			{
				resultmatrix[i][j]=matrix1[i][j]+matrix2[i][j];
			}
	    }
	
		
		//display matrix
		System.out.println("result matrix:");
		for (int i=0;i<rows;i++) 
		{
			for (int j=0;j<cols;j++) 
			{
				System.out.print(resultmatrix[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
				
	}
}
