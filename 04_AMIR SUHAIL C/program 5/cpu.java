
package project1;

public class cpu {
	double price;
	class processor{
		double cores;
		String manufacturer;
		double getcache() {
			return 4.3;
			
		}
	}
	static class RAM
	{
		double memory;
		String manufacturer;
		double getClockSpeed() {
			return 5.5;
		}
	}

public class CpuDetails
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cpu c1=new cpu();
		cpu.processor p1=c1.new processor();
		cpu.RAM ram=new cpu.RAM();
		System.out.println("Processor cache= "+p1.getcache());
		System.out.println("RAM clock speed="+ram.getClockSpeed());
	}
}
	
}

