package farooq;

public class product {
	String pname,pcode;
	int price;
	public product(){}
	public product(String pname,String pcode,int price){
		this.pname=pname;
		this.pcode=pcode;
		this.price=price;
	}
	public void setPname(String pname){
		this.pname=pname;
		
	}
	public String getPname(){
		return pname;
		
	}
	public void setPcode(String pcode){
		this.pcode=pcode;
		
	}
	public String getPcode(){
		return pcode;
		
	}
	public void setPrice(int price){
		this.price=price;
		
	}
	public int getPrice(){
		return price;
		
	}
	public void display(){
		System.out.println("Pname="+pname);
		System.out.println("Pcode="+pcode);
		System.out.println("Price="+price);
	}

}
public class cars {

	public static void main(String[] args) {
		product p1=new product();
		p1.pname="benz";
		p1.pcode="car1";
		p1.price=8000000;
		
		System.out.println("Displaying p1:");
		p1.display();
		
		product p2=new product("BMW","car2",8900000);
		
		System.out.println("\nDisplaying p2:");
		p2.display();
		
		product p3=new product("Audi","car3",6900000);
		
		System.out.println("\nDisplaying p2:");
		p3.display();
		
		product p=p3.getPrice()<(p1.price<p2.price?p1.price:p2.price)?p3:(p1.price<p2.price?p1:p2);
		
		System.out.println("\nDisplaying product with lowest:");
		p.display();
		
	}

}
