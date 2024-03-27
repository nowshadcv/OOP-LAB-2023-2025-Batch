package product;

public class CPU {
		double price;
		class Processor{
			double cores;
			String manufacture;
			double getCache() {
		            return 4.3;}}
		static class RAM{
			double memory;
			String manufacture;
			double getCachespeed() {
				return 5.5;}
		}
public class CPUDetails{
	public static void main(String[] args) {
		CPU cpu=new CPU();
		CPU.Processor processor=cpu.new Processor();
		CPU. RAM ram=new CPU.RAM();
		System.out.println("Processor cache= " +processor.getCache());
		System.out.println("RAM Clock speed= "+ram.getCachespeed());
	}
}
}