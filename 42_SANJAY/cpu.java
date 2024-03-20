package Cpu;

public class CPU {
	double price;
	class Processor{
		double cores;
		String manufacturer;
		double getcache() {
			return 4.3;
		}
	}
	static class ram{
		double memory;
		String manufacturer;
		double getclockspeed() {
			return 5.5;
		}
		}
	
	class cpudetails{
		
	
	public static void main(String[] args) {
	CPU cpu=new CPU();
	CPU.Processor processor=cpu.new Processor();
	CPU.ram Ram=new CPU.ram();
	System.out.println("Processor cache ="+ processor.getcache());
	System.out.println("RAM Clock Speed ="+ Ram.getclockspeed());
	
	}
	}

}
