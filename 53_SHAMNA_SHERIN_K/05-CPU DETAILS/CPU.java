package project1;
import java.util.Scanner;
public class CPU {
	double price;
	Scanner m=new Scanner(System.in);
	class Processor{
		double cores;
		String manufactorer;
		double getcache() {
			System.out.println("Enter processor cache:");
			Double p=m.nextDouble();
			return p;
			
		}
	}
	static class RAM{
		Scanner m=new Scanner(System.in);
		double memory;
		String manufactorer;
		double getclockspeed() {
			System.out.println("Enter clock speed:");
			Double c=m.nextDouble();
			return c;
		}
	}

public class CPUDetails{
	public static void main(String[] args) {
		CPU cpu=new CPU();
		CPU.Processor processor=cpu.new Processor();
		CPU.RAM ram=new CPU.RAM();
		Double cache=processor.getcache();
		Double speed=ram.getclockspeed();
		System.out.println("Processor cache="+cache);
		System.out.println("RAM clock speed="+speed);
		
	}
		
	}
}


