package over;
class over{
	void area(float x) {
		System.out.println("the area of square is "+Math.pow(x,2)+" SQ units");}
	
	void area(float x,float y) {
		System.out.println("the area of square is "+x*y+" SQ units");}
	
	void area(double x) {
		double z=3.14*x*x;
		System.out.println("the area of square is "+z+" SQ units");}
	}

class overload{
	public static void main(String args[]){
		over ob=new over();
		ob.area(5);
		ob.area(11,12);
		ob.area(12.5);
	}
}