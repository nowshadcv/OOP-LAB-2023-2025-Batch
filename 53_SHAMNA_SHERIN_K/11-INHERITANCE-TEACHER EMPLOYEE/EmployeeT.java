package project1;
import java.util.Scanner;
public class EmployeeT {
	int empid;
	String name;
	float salary;
	String address;
	EmployeeT(){}
	EmployeeT(int empid,String name,float salary,String address){
		this.empid=empid;
		this.name=name;
		this.salary=salary;
		this.address=address;	
	}
}
class Teacher extends EmployeeT{
	String department,subject;
	Teacher(int empid,String name,float salary,String address,String department,String subject){
		super(empid,name,salary,address);
		this.department=department;
		this.subject=subject;
	}
	public void display() {
		System.out.println("Teacher id:"+empid);
		System.out.println("Teacher name:"+name);
		System.out.println("Teacher salary:"+salary);
		System.out.println("Teacher Address:"+address);
		System.out.println("Teacher department:"+department);
		System.out.println("Teacher subject:"+subject);
	}
public class TeacherArrObjects{
	public static void main(String[] args) {
		System.out.println("Enter the number of Teeachers:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter Teachers details one by one....");
		Teacher teacher[]=new Teacher[n];
		Scanner sct=new Scanner(System.in);
		int tid;
		String name;
		float salary;
		String address;
		String department;
		String subject;
		for(int i=0;i<n;i++) {
			System.out.println("Enter"+i+"teacher details...");
			System.out.println("Enter Teachers id(integer):");
			tid=sct.nextInt();
			System.out.println("Enter Teachers name(string):");
			name=sct.next ();
			System.out.println("Enter Teachers salary(float):");
			salary=sct.nextFloat();
			System.out.println("Enter Teachers address(string):");
			address=sct.next ();
			System.out.println("Enter Teachers department(string):");
			department=sct.next ();
			System.out.println("Enter Teachers subject(string):");
			subject=sct.next ();
			Teacher t=new Teacher(tid,name,salary,address,department,subject);
			teacher[i]=t;
		}
		System.out.println("Teachers are:\n");
		for(Teacher x:teacher) {
			x.display();
			System.out.println("\n");
		}
	}
}}