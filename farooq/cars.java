package farooq;

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
