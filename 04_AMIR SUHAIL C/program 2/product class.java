package project1;

public class productclass {
	String pname,pcode ;
	int price;
	public productclass(String pname, String pcode, int price)
	{
		this.pname=pname;
		this.pcode=pcode;
		this.price=price;
	}
	public void setPname(String pname)
	{
		this.pname=pname;
	}
	public String getPcode()
	{
		return pcode;
	}
	public String getPname()
	{
		return pname;
	}
	public void setPcode ( String pcode)
	{
		this.pcode=pcode;
	}
	public int getPrice()
	{
		return price;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public void display()
	{
		System.out.println("pcode :"+this.pcode);
		System.out.println("pname :"+this.pname);
		System.out.println("price :"+this.price+ "\n");
	}
class Cars
{
	public static void main(String[] args)
	{
		productclass p1=new productclass("Car123","Benz",1000);
		System.out.println("Displaying p1:");
		p1.display();
		
		productclass p2=new productclass("Jaguar","Car426",25000);
		System.out.println("Displaying p2: ");
		p2.display();
		
		productclass p3=new productclass("Maruthi","Car800",50000);
		System.out.println("Displaying p3: ");
		p3.display();
		
		productclass p=p3.getPrice()<(p1.price<p2.price?p1.price:p2.price)?p3:(p1.price<p2.price?p1:p2);
		System.out.println("\nDisplaying product with lowest price:");
		p.display();
	}
}
}
