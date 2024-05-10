package Arithematic;

public class Addition implements ArithematicAd{
	private int number1,number2;
	public Addition(int n1,int n2) {
		number1=n1;number2=n2;}
	public int addition() {
		return number1+number2;
	}

}
