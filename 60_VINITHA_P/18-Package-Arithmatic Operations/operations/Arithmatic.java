package operations;
public class Arithmatic implements ArithmaticOperations{

	@Override
	public double add(double a, double b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	@Override
	public double subtract(double a, double b) {
		// TODO Auto-generated method stub
		return a - b;
	}

	@Override
	public double multiply(double a, double b) {
		// TODO Auto-generated method stub
		return a * b;
	}

	@Override
	public double division(double a, double b) {
		// TODO Auto-generated method stub
		
		if (b != 0) {
        	return a / b; }
		else {
        	throw new ArithmeticException("Cannot divide by zero");}
	} 
	
}



