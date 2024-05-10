package Arithmetic;
public class Main {

	    public static void main(String[] args) {
	    	Arithmetic calculator = new Arithmetic();
	        double num1 = 10.5;
	        double num2 = 5.5;

	        System.out.println("Addition: " + calculator.add(num1, num2));
	        System.out.println("Subtraction: " + calculator.subtract(num1, num2));
	        System.out.println("Multiplication: " + calculator.multiply(num1, num2));
	        
	        try {
	            System.out.println("Division: " + calculator.divide(num1, num2));
	        } catch (ArithmeticException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	}

