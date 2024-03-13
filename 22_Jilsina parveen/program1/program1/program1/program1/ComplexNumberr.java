package complexnumber;

public class ComplexNumberr {
	double real , img ;
	ComplexNumberr(double r, double i){
		real = r ; img = i ;
	}
	public static ComplexNumberr sum(ComplexNumberr c1, ComplexNumberr c2) {
		ComplexNumberr temp = new ComplexNumberr(0,0);
		temp.real = c1.real + c2.real;
		temp.img = c1.img + c2.img;
		return temp;}
	

	public static void main(String[] args) {
		ComplexNumberr c1 = new ComplexNumberr(5.5,4);
		ComplexNumberr c2 = new ComplexNumberr(1.2,3.5);
		ComplexNumberr temp = sum (c1,c2);
		System.out.printf("sum is : "+ temp.real + "+" + temp.img + "i");
		

	}

}
