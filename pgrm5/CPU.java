import java.util.Scanner;

public class CPU{
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
			double clock = sc.nextDouble();
			return clock;
		}
		
	}
	
}

class  CPUDetails{
	public static void main(String[] args) {
		CPU c = new CPU();
		CPU.Processor p = c.new Processor();
		CPU.RAM ram = new CPU.RAM();
		double cache=p.getCache();
		double clock= ram.getClockSpeed();
		System.out.println("Procesor cache = "+ cache);
		System.out.println("Ram clock speed = "+clock);
	}
}