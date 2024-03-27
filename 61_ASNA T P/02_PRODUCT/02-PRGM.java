
public class Cars {

	public static void main(String[] args) {
	     Product p1 = new Product();
	     p1.Pcode = "Car123";
	     p1.Pname = "Benz";
	     p1.Price = 10000;
	     System.out.println("Displaying p1:");
	     p1.display();
	     Product p2 = new Product("Jaguar","Cars426",25000);
	     System.out.println("Displaying p2:");
	     p2.display();
	     Product p3 = new Product("Maruthi","Cars800",50000);
	     System.out.println("Displaying p3:");
	     p3.display();
         Product p = p3.getPrice()<(p1.Price<p2.Price?p1.Price:p2.Price)?p3:(p1.Price<p2.Price?p1:p2);
         System.out.println("\nDisplaying product with lowest price:");
         p.display();
	}}
