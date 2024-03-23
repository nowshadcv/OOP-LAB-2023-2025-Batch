package CPU;


public class CPU {
		double price;
		class processor{
		String manufacturer;
		double getCache( )
		{
			return 4.3;
		}}

static class RAM{
	double memory;
	String manufacturer;
	double getClockSpeed() {
		return 5.5;
	}
}
}
class CPUDetails {
		public static void main(String [] args)
		{
			CPU cpu = new CPU();
			CPU.processor processor =cpu.new processor();
			CPU.RAM ram = new CPU.RAM();
			System.out.println("Processor Cache =" +processor.getCache() );
			System.out.println("RAM Clock Speed = " + ram.getClockSpeed());
			
		}
}