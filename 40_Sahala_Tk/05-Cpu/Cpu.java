
public class Cpu {
	double price;
	class Processor{
		double cores;
		String manufacturer;
		static double getcache() {
			return 4.3;
		}
	}
	static class RAM{
		double memory;
		String manufacturer;
		double getClockspeed() {
			return 5.5;
		}
	}

}
class CpuDetails{
	public static void main(String[]args) {
		Cpu cpu=new Cpu();
	Cpu.Processor processor=cpu.new Processor();
		Cpu.RAM ram=new Cpu.RAM();
		System.out.println("processor cache="+ Cpu.Processor.getcache());
		Sytem.out.println(Ram clock speed
}