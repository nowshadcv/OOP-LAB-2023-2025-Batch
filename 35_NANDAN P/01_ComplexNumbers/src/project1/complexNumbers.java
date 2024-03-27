package project1;

public class complexNumbers {
	double real ,img ;
	
	complexNumbers(double r,double i){
		real=r ; img= i ;
	}
	public static complexNumbers sum(complexNumbers c1,complexNumbers c2)
	{
		complexNumbers temp = new complexNumbers(0,0);
		temp.real=c1.real + c2.real;
		temp.img = c1.img+c2.img;
		return temp;
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		complexNumbers c1 =new complexNumbers(5.5,4);
		complexNumbers c2 =new complexNumbers(1.2,3.5);
		complexNumbers temp=sum(c1 , c2);
		System.out.printf("Sum ids :"+ temp.real+"+"+temp.img+"i");
	}

}
