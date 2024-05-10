package Arithmatic;


public  class Arithmatic implements ArithmeticOperations{
	
	    public double add(double a, double b)
	    {
	        return a + b;
	    }
	
	

	    public double subtract(double a, double b)
	    {
	        return a - b;
	    }


	// MultiplicationImpl class implementing Multiplication interface
	
	    @Override
	    public double multiply(double a, double b) {
	        return a * b;
	    }
	


	// DivisionImpl class implementing Division interface
	
	    public double divide(double a, double b) {
	        if (b != 0) {
	        	return a / b; 
	        }
	        else {
	        	throw new ArithmeticException("Cannot divide by zero");
	    }
	   }
}