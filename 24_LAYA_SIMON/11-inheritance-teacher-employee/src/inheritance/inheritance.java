package inheritance;
import java.util.Scanner;
class inheritance {
	int empid;
	String name;
	float salary;
	String address;
	inheritance(){}
	inheritance(int empid,String name,float salary,String address){
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.address=address;  }}
class Teacher extends inheritance{
	String department,subject;
	Teacher(int empid,String name,float salary,String address, String department,String subject){
		super(empid,name,salary,address);
		this.department = department;
		this.subject = subject;}
	public void display() {
		System.out.println("Teachers id:" + empid);
		System.out.println("Teachers name :" + name);
		System.out.println("Teachers salary :" + salary);
		System.out.println("Teachers address :" + address);
		System.out.println("Teachers department: " + department);
		System.out.println("Teachers subject :" + subject);}}

class teacherarrobjects {
	
	public static void main(String[] args) {
		System.out.println("Enter number of teachers :");
		Scanner sc = new Scanner ( System .in );
		int n = sc.nextInt();
		System.out.println("Enter teachers details one by one");
		Teacher teacher [ ] = new Teacher [ n ];
		Scanner scT = new Scanner ( System . in);
		int tid; String name; float salary; String address; String department; String subject;
		for ( int i = 0 ; i<n; i++) {
			System.out.println( "Enter " + i + "teacher details..");
			System.out.println("Enter teachers id (integer) ; ");
			tid = scT.nextInt();
			System.out.println("Enter teachers name (string) : ");
			name = scT.next();
			System.out.println("Enter teachers salary (float) : ");
			salary = scT.nextFloat();
			System.out.println("Enter teachers address (string) : ");
			address = scT.next();
			System.out.println("Enter teachers department (string) : ");
			department = scT.next();
			System.out.println("Enter teachers subject (string) : ");
			subject = scT.next();
			Teacher t = new Teacher ( tid,name,salary,address,department,subject );
			teacher [ i ] = t ; }
		System.out.println("Teachers are :\n ");
		for (Teacher x : teacher ) {
			x.display();
			System.out.println("/n");}}}




			
		