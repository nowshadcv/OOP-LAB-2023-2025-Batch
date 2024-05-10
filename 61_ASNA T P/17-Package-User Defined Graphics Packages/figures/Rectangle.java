package figures;

public class Rectangle implements FigureRt {
	private int length;
	private int width;
	public Rectangle(int l,int w) {length=l;width=w;}
	
	public int perimeter() {return(length*width);}
	public int area() {return(2*(length+width));}
}
