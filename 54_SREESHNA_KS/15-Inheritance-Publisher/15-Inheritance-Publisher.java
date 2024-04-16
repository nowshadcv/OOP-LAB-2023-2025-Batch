package prgms;

class publisher {
	String publisher;
	publisher(String publi){
		this.publisher=publi;
	}

}
class book {
	String name;
	publisher publisher;
	book(){}
	public book(String name,publisher publisher) {
		this.name=name;
		this.publisher=publisher;
	}
}
class literature extends book{
	String list_type="literature";
	literature (String name,publisher publisher){
		super(name,publisher);}
	void display() {
		System.out.println("name" +super.name);
		System.out.println("type" +this.list_type);
		System.out.println("publisher" +this.publisher.publisher);
	}
}
class fiction extends book {
	String list_type="fiction";
	fiction (String name,publisher publisher){
		super(name,publisher);}
	void display() {
		System.out.println("name" +super.name);
		System.out.println("type" +this.list_type);
		System.out.println("publisher" +this.publisher.publisher);
}
}
public class inheritancebook {
	public static void main(String[]args) {
		publisher lp=new publisher("s.chand");
		literature l=new literature("as you like it ",lp);
		l.display();
		publisher fp=new publisher("tata mcgraw hill");
		fiction f=new fiction("tempest",fp);
		f.display();
		
	}
}
