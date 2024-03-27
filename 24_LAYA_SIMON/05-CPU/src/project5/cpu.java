package project5;

import java.util.Scanner;

public class cpu{
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

	class CPD {
		public static void main(String[] args) {
			cpu c = new cpu();
			cpu.Processor p = c.new Processor();
			cpu.RAM ram = new cpu.RAM();
			double z =p.getCache();
			double x = ram.getClockSpeed();
			System.out.println("Procesor cache = "+ z);
			System.out.println("Ram clock speed = "+ x);
		}
	}