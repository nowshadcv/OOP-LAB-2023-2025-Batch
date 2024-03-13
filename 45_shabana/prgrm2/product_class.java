package shabana;

public class product_class {
String pname , pcode;
int price;
public product_class() {}
public product_class(String pname,String pcode,int price) {
	this.pname=pname;
	this.pcode=pcode;
	this.price=price;}
public void setpname(String pname) {
	this.pname=pname;}
public String getpcode() {
	return pcode;}
public String getname() {
	return pname;}
public void setpcode(String pcode) {
	this.pcode=pcode;}
public int getprice() {
	return price;}
public void setprice(int price) {
	this.price=price;}
public void display() {
	System.out.println("pcode:"+this.pcode);
	System.out.println("pname:"+this.pname);
	System.out.println("price:"+this.price+"\n");}
public class cars{
	public static void main(String[]args) {
		product_class p1=new product_class();
		p1.pcode="car123";
		p1.pname="benz";
		p1.price=10000;
		System.out.println("displaying p1:");
		p1.display();
		product_class p2=new product_class("jagur","car426",25000);
		System.out.println("displaying p2:");
		p2.display();
		product_class p3=new product_class("maruthi","car800",50000);
		System.out.println("displaying p3:");
		p3.display();
		product_class p =p3.getprice()<(p1.price<p2.price?p1.price:p2.price)?p3:(p1.price<p2.price?p1:p2);
		System.out.println("\ndisplaying product with lowest price:");
		p.display();
}}
	
	
	
	
}
	

