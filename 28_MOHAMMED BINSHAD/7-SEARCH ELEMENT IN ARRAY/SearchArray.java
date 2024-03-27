package searcharray;

import java.util.Scanner;

importjava.util.Scanner ;

public class SearchArray {
	

	public static void main(String[] args) 
	
	{
		
		int c , n , search,array[] ;
		Scanner in = new Scanner ( System.in );
		System.out.println("enter number elemnts");
		n = in.nextInt();
		array = new int[ n ];
		System.out.println(" enter those"+"element");
		for ( c=0;c<n;c++)
			array [ c ] = in.nextInt();
		System.out.println("enter the value you want to add:");
		search = in.nextInt();
		for (  c=0;c<n;c++)
			if ( array [ c ] == search )
			{
				System.out.println(search+"is present in the location:"+(c+1));
				break;
			if ( c == n)
				System.out.println(search+" is not present in the location");
			
			}

	}

}
