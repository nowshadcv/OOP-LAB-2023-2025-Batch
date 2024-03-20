package product;

public class pro { 
	String pname, pcode; 
	int price;
	public pro() {}
	public pro(String pname, String pcode, int price) {
		this.pname = pname;
		this.pcode = pcode; 
		this.price = price; }
	public void setPname (String pname) {
		this.pname = pname; }
	public String getPcode() {
		return pcode;} 
	public String getPname() {
		return pname;}
	public void setPcode (String pcode ) {
		this.pcode = pcode ;}
	public int getPrice(){
		return price;}
	public void setPrice(int price) {
		this.price =price ;}
	public void display() {
		System.out.println("pcode:" + this.pcode);
		System.out.println("pname" + this.pname);
		System.out.println("price :"+this.price + "\n");}}

 class cars{
	public static void main(String[] args){
		pro p1 = new pro(); 
		p1.pcode = "Car123";
		p1.pname = "Benz";
		p1.price =10000;
		System.out.println("Displaying p1:");
		p1.display(); 
		
		pro p2 = new pro("Jaguar", "Car426", 25000 );
		System.out.println("Displaying p2: ");
		p2.display();
		
		pro p3 = new pro ("Maruthi", "Car800", 50000 ); 
		System.out.println("Displaying p3: ");
		p3.display();
		
		pro p =p3.getPrice()<(p1.price<p2.price?p1.price:p2.price)?p3 : (p1.price<p2.price?p1:p2);
		System.out.println("\nDisplaying product with lowest price:" );
		p.display();
		
	}
}