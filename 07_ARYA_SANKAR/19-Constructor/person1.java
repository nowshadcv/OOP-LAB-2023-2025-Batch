package product;

public class person1 {
	    String name;
	    int age;
	    public person1() {
	        name = "John Doe";
	        age = 30;
	    }

	    public person1(String n, int a) {
	        name = n;
	        age = a;
	    }

	    public void display() {
	        System.out.println("Name: " + name + ", Age: " + age);
	    }

	    public static void main(String[] args) {
	        person1 person1 = new person1(); 
	        person1 person2 = new person1("Alice", 25);
	        System.out.println("Person 1:");
	        person1.display();
	        System.out.println("Person 2:");
	        person2.display();
	    }
	}


