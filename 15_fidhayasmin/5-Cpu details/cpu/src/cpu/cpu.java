package cpu;
public class cpu {
	double price;
	class processor{
		double cores;
		String manufactures;
		double getCache() {
		return 4.3;}}
	static class RAM{
		double memory;
		String manufactures;
		double getClockspeed()
		{
			return 5.5;}}
	public class cpuDetails{
		public static void main(String[]args) {
		cpu cpu=new cpu();
		cpu.processor processor=cpu.new processor();
		cpu.RAM ram = new cpu.RAM();
		System.out.println("processor cache="+processor.getCache());
		System.out.println("RAM clock speed"+ram.getClockspeed());
		}
	}
}
	
			
