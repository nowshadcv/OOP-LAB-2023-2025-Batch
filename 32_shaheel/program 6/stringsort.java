package gt;

import java.util.Arrays;
import java.util.Scanner;

public class graes{
public static void main(String[] args )
{
	int count =0;
	String tmp;
	Scanner scan = new Scanner (System.in);
	System.out.println("enter the no of Strings");
	count = scan.nextInt();
	String strlist[] = new String [count];
	Scanner scan1 =new Scanner (System.in);
	System.out.println("enter the  Strings");
	for( int i =0;i<count;i++)
		strlist[i]=scan1.nextLine();
	System.out.println("choose 1 or 2");
	System.out.println("1.in built sort");
	System.out.println("2.user defined sort");
	int choice;
	choice =scan.nextInt();
	switch (choice)
	{
	case 1: Arrays.sort(strlist);
			System.out.println(Arrays.toString(strlist) );
			break;
	case 2: for (int i=0;i<count-1;i++)
			for (int j=i+1;j<strlist.length;j++)
				if( strlist[i].compareTo(strlist[j] ) >0)
					{tmp =strlist[i];
					strlist[i]=strlist[j];
					strlist[j]=tmp;}
			System.out.println(Arrays.toString(strlist) );
			break;
				}
		

		}
}
