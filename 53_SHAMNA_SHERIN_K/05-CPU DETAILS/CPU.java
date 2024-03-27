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
			int p=m.nextInt();
			return p;
			
		}
	}
	static class RAM{
		Scanner m=new Scanner(System.in);
		double memory;
		String manufactorer;
		double getclockspeed() {
			System.out.println("Enter clock speed:");
			int c=m.nextInt();
			return c;
		}
	}

public class CPUDetails{
	public static void main(String[] args) {
		CPU cpu=new CPU();
		CPU.Processor processor=cpu.new Processor();
		CPU.RAM ram=new CPU.RAM();
		System.out.println("Processor cache="+processor.getcache());
		System.out.println("RAM clock speed="+ram.getclockspeed());
		
	}
		
	}
}


