package project1;

public class productClass
{
	String pname,pcode;
	int price;
	public productClass() {}
	public productClass(String pname,String pcode,int price) {
		this.pname=pname;
		this.pcode=pcode;
		this.price=price;
	}
	public void setPname(String pname) {
		this.pname=pname;
	}
	public String getPname() {
		return pname;
	}
	public String getPcode()
	{
		return pcode;
	}
	public void setpcode(String pcode)
	{
		this.pcode=pcode;
	}
	public int getprice()
	{
		return price;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public void display()
	{
		System.out.println("Pcode: "+this.pcode);
		System.out.println("Pname: "+this.pname);
		System.out.println("Price: "+this.price+"\n");
	}
}
public class Cars
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		productClass p1=new productClass();
		p1.pcode="Car123";
		p1.pname="Benz";
		p1.price=10000;
		System.out.println("Displaying p1: ");
		p1.display();
		productClass p2=new productClass("Jaguar","Car426",25000);
		System.out.println("Displaying p2: ");
		p2.display();
		productClass p3=new productClass("Maruthi","Car800",50000);
		System.out.println("Displaying p3: ");
		p3.display();
		productClass  p=p3.getprice()<(p1.price<p2.price?p1.price:p2.price)?p3:(p1.price<p2.price?p1:p2);
		 System.out.println("Displaying product with lowest price: ");
		 p.display();
	}

}
