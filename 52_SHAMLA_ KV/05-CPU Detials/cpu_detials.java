package program;
import java.util.Scanner;
public class cpu_detials {
	static Scanner sc=new Scanner(System.in);
	double price;
	class Processor{
		double cores;
		String manufacturer;
		double getCache() {
			
			System.out.println("enter the Cache:");
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
		cpu_detials cpu = new cpu_detials();
		cpu_detials.Processor p = cpu.new Processor();
		cpu_detials.RAM ram = new cpu_detials.RAM();
		double z =p.getCache();
		double x = ram.getClockSpeed();
		System.out.println("Procesor cache = "+ z);
		System.out.println("Ram clock speed = "+ x);
	}
}