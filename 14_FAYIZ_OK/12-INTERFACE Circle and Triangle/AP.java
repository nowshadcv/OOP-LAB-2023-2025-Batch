package PackA;

import java.util.Scanner;

interface AP {
	void input();
	void area();
	void perimeter();
	void Square();
class Circle implements AP{
    int r = 0;
    double pi = 3.14, area = 0, perimeter = 0;
    public void input() {
    	Scanner c = new Scanner(System.in);
    	r = c.nextInt();}
    public void area() {
    	area = pi* r* r;
    	System.out.println("Area of circle: " + area);}
    public void perimeter() {
    	perimeter = 2 *pi * r;
    	System.out.println("Perimeter of circle: " + perimeter);}}}
class Rectangle implements AP{
	int 1 = 0, b = 0;
	double area,perimeter;
	public void input() {
		Scanner r = new Scanner(System.in)
		  1 = r.nextInt();
		  b = r.nextInt();
    public void area() {
    	  area = 1 * b;
    	  System.out.println("Area retangle: "+ area);}
    public void perimeter() {
    	  perimeter = 2 * (1+b);
    	  System.out.println("Perimeter of Rectangle: " + perimeter);}}
	class Square implements AP{
		int a=0
		double area,perimeter;
		public void input() {
			Scanner r = new Scanner(System.in)
					a=s.nextInt();}
	    public void area() {
	    	  area = a*a
	    	  System.out.println("Area retangle: "+ area);}
	    public void perimeter() {
	    	  perimeter = 4*a;
	    	  System.out.println("Perimeter of the square:"+perimeter);}}}


    }
				;
   
    
    }
}
