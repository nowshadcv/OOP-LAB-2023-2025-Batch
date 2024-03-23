package searchelemntinArray;

import java.util.Scanner;

public class ArraySearch {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter the size of the array:");
		int size=sc.nextInt();
		int[] array=new int[size];
		
		System.out.println("enter the elements of array:");
		for(int i =0;i<size;i++) {
			System.out.println("element "+(i+1)+":");
			array[i]=sc.nextInt();
		}
		System.out.println("enter the element to search for:");
		int target=sc.nextInt();
		boolean found= false;
		for(int i=0;i<size;i++) {
			if(array[i]==target) {
				found=true;
				break;
			}
		}
		if(found) {
			System.out.println("element "+ target+ " found in the array.");
		}
		else {
			System.out.println("element "+ target+ " not found in the array.");
		}
		sc.close();
	}
}
			
