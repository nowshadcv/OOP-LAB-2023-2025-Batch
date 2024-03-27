package project1;

import java.util.Scanner;

public class cpu_details {
	static Scanner sc=new Scanner(System.in);
	double price;
	class Processor{
		double cores;
		String manufacturer;
		double getCache() {
			
			System.out.println("enter the Cache");
			double cache = sc.nextDouble();
			return cache;
			
		}
	}
	static class RAM{
		double memory ;
		String manufacturer;
		double getClockSpeed() {
			System.out.println("enter the Clock speed");
			double clk = sc.nextDouble();
			return clk;
		}
		
	}
	
}

class CPU {
	public static void main(String[] args) {
		cpu_details c = new cpu_details();
		cpu_details.Processor p = c.new Processor();
		cpu_details.RAM ram = new cpu_details.RAM();
		double z =p.getCache();
		double x = ram.getClockSpeed();
		System.out.println("Procesor cache = "+ z);
		System.out.println("Ram clock speed = "+ x);
	}

}
