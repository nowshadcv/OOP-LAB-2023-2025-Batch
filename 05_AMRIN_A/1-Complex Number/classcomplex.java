package complexp;

public class classcomplex {
	double real, img;
	classcomplex(double r,double i){
		real = r; img =i ;}
	public static classcomplex sum(classcomplex c1,classcomplex c2) {
		classcomplex temp=new classcomplex(0,0);
		temp.real=c1.real+c2.real;
		return temp;}
	public static void main(String args[]) {
		classcomplex c1 = new classcomplex(5.5,4);
		classcomplex c2 = new classcomplex(1.2,3);
		classcomplex temp=sum(c1,c2);
		System.out.printf("Sum is :"+ temp.real + "+" + temp.img + "i");
			
	}
	

}
