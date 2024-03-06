package project1;

public class product_class
{
	String pname,pcode;
	int price;
	public product_class() {}
	public product_class(String pname,String pcode,int price) {
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
class Cars
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		product_class p1=new product_class();
		p1.pcode="Car123";
		p1.pname="Benz";
		p1.price=10000;
		System.out.println("Displaying p1: ");
		p1.display();
		product_class p2=new product_class("Jaguar","Car426",25000);
		System.out.println("Displaying p2: ");
		p2.display();
		product_class p3=new product_class("Maruthi","Car800",50000);
		System.out.println("Displaying p3: ");
		p3.display();
		product_class  p=p3.getprice()<(p1.price<p2.price?p1.price:p2.price)?p3:(p1.price<p2.price?p1:p2);
		 System.out.println("Displaying product with lowest price: ");
		 p.display();
	}

}

