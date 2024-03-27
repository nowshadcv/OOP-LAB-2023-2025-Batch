package product;

public class Products {
	String pname,pcode;
	int price;
	public Products() {}
	public Products(String pname, String pcode, int price){
		this.pname = pname;
		this.pcode=pcode;
		this.price=price;
	}
	public void setPname(String pname){
		this.pname=pname;
	}
	public String getPcode(){
		return pcode;
	}
	public String getPname(){
		return pname;
	}
	public void setPcode(String pcode){
		this.pcode=pcode;
	}
	public int getPrice(){
		return price;
	}
	public void setPrice(int price){
		this.price=price;
	}
	public void display(){
		System.out.println("pcode :"+this.pcode);
		System.out.println("pname :"+this.pname);
		System.out.println("price :"+this.price + "\n");
	}
	}
class Cars{
	public static void main(String[] args){
		Products p1 = new Products();
		p1.pcode="car1";
		p1.pname = "Benz";
		p1.price = 10000;
		System.out.println("Displaying product 1.......\n");
		p1.display();
			
		Products p2 = new Products("car2","Jaguar",25000);
		System.out.println("Displaying product 2.......\n");
		p2.display();
			
		Products p3 = new Products("car3","Maruthi",300);
		System.out.println("Displaying product 3.......\n");
		p3.display();
			
		Products p = p3.getPrice()<(p1.price<p2.price?p1.price:p2.price)?p3:(p1.price<p2.price?p1:p2);
		System.out.println("\nDisplaying product with lowest price.......\n");
		p.display();
		
		}
	}


