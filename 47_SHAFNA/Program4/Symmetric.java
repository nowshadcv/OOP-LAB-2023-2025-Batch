package Symmetric;

import java.util.Scanner ;
public class Symmetric {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the rows");
		int rows = sc.nextInt();
		System.out.println("ENTER THE NUMBER OF COLUMNS");
		int cols=sc.nextInt();
		int matrix[][] = new int[rows][cols];
		System.out.println("enter the elements of matrix");
		for ( int i = 0;i < rows; i++)
			for ( int j = 0; j < cols; j++)
				matrix[i][j] = sc.nextInt();
		sc.close();
		System.out.println("given matrix");
		for (int i = 0; i < rows; i++)
			for(int j = 0; j < cols; j++)
				System.out.print(matrix[i][j] + "\t" );
		System.out.println();
		if (rows != cols)
			System.out.println("matrix is not square");
		else {
		boolean symmetric = true ;
		for (int i = 0; i < rows; i++)
				for(int j = 0; j < cols; j++)
		if (matrix[i][j] != matrix[j][i])
		{
			symmetric = false;break;
		}
		if(symmetric)
			System.out.println("matrix is symmetric");
		else
			System.out.println("materix not symmetric");
				
		}
		
	}
}