

public class Complexx {
	double real,img;
	Complexx(double r,double i){
		real=r;img=i;
	}
	public static Complexx sum(Complexx c1, Complexx c2) {
		Complexx temp= new Complexx(0,0);
		temp.real=c1.real+c2.real;
		temp.img=c1.img+c2.img;
	return temp;
	}
	public static void main(String[] args) {
		Complexx c1=new Complexx(5.5,4);
		Complexx c2=new Complexx(1.2,3.5);
		Complexx temp=sum (c1,c2);
		System.out.printf("sum is:"+temp.real+"+" + temp.img+"i");}
	}
	
