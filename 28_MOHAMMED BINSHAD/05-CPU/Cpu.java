package cpu;

public class Cpu {
	double price;
	class Processor {
		double cores;
		String manufacturer;
		double getCache () {
			return 4.3;
		}
	}
	
	
	static class RAM {
		double memory;
		String manufacturer;
		double getClockSpeed() {
			return 5.5;
		}
	}
}
	class CpuDetails{
	public static void main(String[] args) {
		Cpu cpu = new Cpu();
		Cpu.Processor processor = cpu.new Processor() ;
		Cpu.RAM ram = new Cpu.RAM() ;
		System.out.println("Processor cache = " + processor.getCache() );
		System.out.println("RAM Clock speed =" + ram.getClockSpeed() );
	}

}
