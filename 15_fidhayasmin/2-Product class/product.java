
public class product {
	String pname,pcode;
	int price;
	public product() {}
	public product(String pname,String pcode,int price) {
		this.pname=pname;
		this.pcode=pcode;
		this.price=price;}
		public void setpname(String pname)
		{
			this.pname=pname;
			}
		public String getcode() {
			return pcode;}
		public String getPname(String pname) {
			return pname;}
		public void setPcode(String pcode) {
			this.pcode=pcode;}
		public int getPrice(int price) {
			this.price=price;}
		public void setPrice(int price) {
			this.price=price;}
		public void display() {
			System.out.println("pcode :" + this.pcode);
			System.out.println("pname :" + this.pname);
			System.out.println("price :" + this.price + "\n");
		}
			class Cars{
				public static void main(String[] args) {
					product p1=new product();
							p1.pcode="Car123";
							p1.pname="Benz";
							p1.price=10000;
							System.out.println("Displaying p1:");
							p1.display();
							product p2=new product("Jaguar","Car426",25000);
							System.out.println("Displaying p2:");
							p2.display();
							product p3=new product("AUDi","Car800",5000);
							System.out.println("Displaying p3:");
							p3.display();
							product p=p3.getPrice()<(p1.price<p2.price?p1.price:p2.price)?p3
						    :(p1.price<p2.price?p1:p2);
							System.out.println("\nDisplaying product with lowest price:");
							p.display();
		
							
				}
			}
}
	

