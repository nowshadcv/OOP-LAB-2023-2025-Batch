package shape;
import java.util.Scanner;

interface Shape{
	double area();
	double perimeter();
}

class Circle implements Shape {
	private double radius;

public Circle(double radius) {
	this.radius=radius;
}

public double area() {
	return Math.PI*radius*radius;
}

public double perimeter() {
	return 2*Math.PI*radius;
}
}
class Rectangle implements Shape{
	private double length;
	private double breadth;
	
	public Rectangle(double length,double breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	
	public double area() {
		return length*breadth;
	}

    public double perimeter(){
        return 2*(length+breadth);
    }

}

class Triangle implements Shape{
	private double s1;
	private double s2;
	private double s3;
	
	public Triangle (double s1,double s2,double s3){
        this.s1=s1;
        this.s2=s2;
        this.s3=s3;
    }
    public double area(){
        double s=(s1+s2+s3)/2;
        return Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
    }
    public double perimeter(){
        return s1+s2+s3;
    }
}

class Square implements Shape{
    private double side;

    public Square(double side){
        this.side=side;
    }

    public double area(){
        return side*side;
    }
    public double perimeter(){
        return 4*side;
    }
}
	

public class Shapes{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        while (true)
        {
            System.out.println("choose shapes:");
            System.out.println("1.CIRCLE");
            System.out.println("2.RECTANGLE");
            System.out.println("3.TRIANGLE");
            System.out.println("4.SQUARE");
            System.out.println("5.EXIT\n");
            System.out.println("ENTER YOUR CHOICE:");
            int choice=sc.nextInt();

            switch (choice)
            {
                case 1:
                System.out.println("enter the radius of the circle:");
                double radius=sc.nextDouble();
                Circle circle=new Circle(radius);
                System.out.println("Area:"+circle.area());
                System.out.println("Perimeter:"+circle.perimeter());
                break;

                case 2:
                System.out.println("Enter the length of the rectangle:");
                double length=sc.nextDouble();
                System.out.println("Enter the breadth of the rectangle:");
                double breadth=sc.nextDouble();
                Rectangle rectangle=new Rectangle(length,breadth);
                System.out.println("Area:"+rectangle.area());
                System.out.println("Perimeter:"+rectangle.perimeter());
                break;

                case 3:
                System.of.println("enter side1 of triangle:");
                double s1=sc.nextDouble();
                System.of.println("enter side2 of triangle:");
                double s2=sc.nextDouble();
                System.of.println("enter side3 of triangle:");
                double s3=sc.nextDouble();
                Triangle triangle=new Triangle(s1,s2,s3);
                System.out.println("AREA:"+triangle.area());
                System.out.println("Perimter:"+triangle.perimeter());
                break;

                case 4:
                System.of.println("enter side of square:");
                double side=sc.nextDouble();
                Square square=new Square(side);
                System.out.println("AREA:"+square.area());
                System.out.println("Perimter:"+square.perimeter());
                break;

                case 5:
                System.out.println("exiting...");
                return;
                default:
                System.out.println("INVALID CHOICE!!!");
            }
        }
    }
}



