package project15;

class publisher{
	String publisher;
	publisher ( String publi ) {
		this.publisher=publi; } }

class book {
	String name;
	publisher publisher;
	book() {}
	public book ( String name, publisher publisher ) {
		this.name =name;
		this.publisher= publisher; } }

class literature extends book {
	String lit_type = "literature";
	literature (String name,publisher publisher ){
		super(name,publisher); }
	void display() {
		System.out.println("name :"+super.name);
		System.out.println("type :"+this.lit_type);
		System.out.println("publisher :"+this.publisher.publisher); }}

class fiction extends book {
	String lit_type = "fiction";
	fiction(String name,publisher publisher){
		super(name,publisher); }
	void display() {
		System.out.println("name " + super .name);
		System.out.println("type :"+ this.lit_type);
		System.out.println("publisher :" +this.publisher.publisher); }}

public class inheritancebook {

	public static void main(String[] args) {
		publisher lp= new publisher("S.Chand");
		literature l = new literature("As you like it",lp);
		l.display();
		publisher fp=new publisher("Tata McGraw Hill");
		fiction f=new fiction("Tempest",fp);
		f.display(); }}
