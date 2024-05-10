
package project1;

public class person1 {
	    String name;
	    int age;

	    // Constructor without parameters
	    public person1() {
	        name = "John Doe";
	        age = 30;
	    }

	    // Constructor with parameters
	    public person1(String n, int a) {
	        name = n;
	        age = a;
	    }

	    public void display() {
	        System.out.println("Name: " + name + ", Age: " + age);
	    }

	    public static void main(String[] args) {
	        // Creating objects using different constructors
	        person1 person1 = new person1(); // Using default constructor
	        person1 person2 = new person1("Alice", 25); // Using parameterized constructor

	        // Displaying information
	        System.out.println("Person 1:");
	        person1.display();
	        System.out.println("Person 2:");
	        person2.display();
	    }
	}




