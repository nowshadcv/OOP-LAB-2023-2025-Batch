package cpu;
public class cpu{
	double price ;
	class processor {
		double cores;
		String manufacturer;
		double getCache ( ) {
			return 4.3 ;}}
	static class RAM{
		double memory ;
		String manufacturer;
		double getClockSpeed() {
			return 5.5 ; }}}

class cpudetails{
	public static void main(String[] args) {
		cpu cpu = new cpu();
		cpu.processor processor = cpu.new processor() ;
		cpu.RAM ram = new cpu.RAM() ;
		System.out.println("processor cache = " + processor.getCache()) ;
		System.out.println("RAM clock speed = " + ram.getClockSpeed()) ;}}
