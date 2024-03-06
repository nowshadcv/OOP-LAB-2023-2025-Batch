package programs;

public class productClass {
		String pname,pcode;
		int price;
		public productClass()
		{}
		public productClass(String pname,String pcode,int price) {
			this.pname=pname;
			this.pcode=pcode;
			this.price=price;
		}
		public void setpname(String pname) {
			this.pname=pname;
		}
		public String getpcode() {
			return pcode;
		}
		public String getpname() {
			return pname;
		}
		public void setpcode(String pcode) {
			this.pcode=pcode;
		
		}
		
		public void setprice(int price) {
			this.price=price;
		}
		public int getprice(){
			return price;
		}
		public void display() {
			System.out.println("pcode:"+this.pcode);
			System.out.println("pcode:"+ this.pname);
			System.out.println("pcode:"+ this.price);
		}

public class cars{
	
	public static void main(String[] args) {
		productClass p1=new productClass();
		p1.pcode="car123";
		p1.pname="Benz";
		p1.price=10000;
		System.out.println("Display p1:");
		p1.display();
		productClass p2=new productClass("Jaguar","car426",25000);
		System.out.println("Display p2:");
		p2.display();
		productClass p3=new productClass("Maruthi","car800",50000);
		System.out.println("Display p3:");
		p3.display();
		productClass p=p3.getprice()<(p1.price<p2.price?p1.price:p2.price)?p3:(p1.price<p2.price?p1:p2);
		System.out.println("Displaying product with lowest price:");
		p.display();
	}

}
}
