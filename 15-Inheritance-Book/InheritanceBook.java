package packA;
class Publisher{
	String publisher;
	Publisher(String publi){
		this.publisher=publi;}}
class Book{
	String name;
	Publisher publisher;
	Book(){}
	public Book(String name, Publisher publisher) {
		this.name=name;
		this.publisher=publisher;}}
		
class Literature extends Book{
	String Lit_type="Literature";
	Literature(String name, Publisher publisher) {
		super(name,publisher);}
	void display() {
		System.out.println("name:"+super.name);
		System.out.println("type:"+this.Lit_type);
		System.out.println("publisher:"+this.publisher.publisher);}}
class Fiction extends Book{
	String Lit_type="Fiction";
	Fiction(String name, Publisher publisher) {
		super(name,publisher);}
	void display() {
		System.out.println("name:"+super.name);
		System.out.println("type:"+this.Lit_type);
		System.out.println("publisher:"+this.publisher.publisher);}}


public class InheritanceBook {

	public static void main(String[] args) {
		Publisher lp=new Publisher ("S.Chand");
		Literature l=new Literature("as you like it ",lp);
		 l.display();
		Publisher fp=new Publisher("tata McGraw Hill");
		Fiction f=new Fiction ("Tempest",fp);
		f.display();}}
		
		
		
	