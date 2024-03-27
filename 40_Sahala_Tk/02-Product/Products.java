package product;
public class Products {
	String pname,pcode;
	int price;
	public Products() {}
	public Products(String pname,String pcode,int price) {
		this.pname=pname;
		this.pcode=pcode;
		this.price=price;
		
	}
	public void setpname(String pname)
	{
		this.pname=pname;
	}
	public String getpcode()
	{
		return pcode;
	}
	public String getpname() {
		return pname;
	}
	public void setpcode(String pcode) {
		this.pcode=pcode;
	}
	public int getprice() {
		return price;
	}
	public void setprice(int price)
	{
		this.price=price;
		
	}
	public void display()
	{
		System.out.println("pcode:"+this.pcode);
		System.out.println("pname:"+this.pname);
		System.out.println("price:"+this.price);
		
	}
	
}
class Cars{
	public static void main(String[] args)
	{
		Products p1=new Products();
		p1.pcode="car123";
		p1.pname="Benz";
		p1.price=10000;
		System.out.println("Displaying p1:");
		p1.display();
		Products p2=new Products("jaguar","car426",25000);
		System.out.println("Displaying p2");
		p2.display();
		Products p3=new Products("maruthi","car800",50000);
		System.out.println("Displaying p3:");
		p3.display();
		Products p = p3.getprice()<(p1.price<p2.price?p1.price:p2.price)?p3:(p1.price<p2.price?p1:p2);
		System.out.println("\nDisplaying product with lowest price:");
		p.display();
		
		
		
		}
}
