package project2;

public class cpu {
	double price;
	class processor{
		double cores;
		String manufacturer;
		double getCache() {
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
public class CpuDetails{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cpu c1=new cpu();
		cpu.processor p1=c1.new processor();
		cpu.RAM ram=new cpu.RAM();
		System.out.println("processor cache="+p1.getCache());
		System.out.println("RAM Clock speed="+ram.getClockSpeed());
	}
}}
