package figures;

public class figures {

}
interface FiguresSq {
	int perimeter();
	int area();}
class Square implements FiguresSq{
	private int side;
	public Square(int s) {side=s;}
	public int perimeter() {return(4*side);}
	public int area() {return(side*side);}}
interface FiguresCi {
	double perimeter();
	double area();}
class Circle implements FiguresCi{
	private double radius;
	public Circle(double r) {radius=r;}
	public double perimeter() { return (2*3.14*radius);}
	public double area() {return(3.14*radius*radius);}}
interface FiguresTr {
	int perimeter();
	double area();}
class Triangle implements FiguresTr{
	private int side1,side2,side3;
	public Triangle(int s1,int s2,int s3) {
		side1=s1;side2=s2;side3=s3;}
	public int perimeter() {return side1+side2+side3;}
	public double area() {
		double s=(side1+side2+side3)/2;
		double a=Math.sqrt((s-side1)+(s-side2)+(s-side3));
		return a;
	}
}
