package project2;

public class product {
       String pname,pcode;
       int price;
       public product() {}
       public product(String pname,String pcode, int price) {
    	   this.pname = pname;
    	   this.pcode = pcode;
    	   this.price = price;}
       public void setPname(String pname) {
		   this.pname = pname; }
       public String getPcode() {
	       return pcode; }
       public String getPname() {
          return pname; }
       public void setPcode() {
          this.pcode= pcode; }
       public int getPrice() {
          return price; }
       public void setPrice(int price) {
    	   this.price = price;}
       public void display(){
    	   System.out.println("pcode :" + this.pcode);
    	   System.out.println("pname :" + this.pname);
    	   System.out.println("price :" + this.price + "\n") ;}}

class cars{
	   public static void main(String[] args){
		   product p1 = new product();
		   p1.pcode = "car123";
		   p1.pname = "benz";
		   p1.price = 10000;
		   System.out.println("Displaying p1:");
		   p1.display();
		   
		   product p2=new product("jagur","car426",25000);
		   System.out.println("Displaying p2:");
		   p2.display();
		   
		   product p3=new product("maruthi","car800",50000);
		   System.out.println("Displaying p3:");
		   p3.display();
		   
		   product p=p3.getPrice()<(p1.price<p2.price?p1.price:p2.price)?p3:(p1.price<p2.price?p1:p2);
		   System.out.println("\nDisplaying product with lowest price:");
		   p.display();
	   }
}