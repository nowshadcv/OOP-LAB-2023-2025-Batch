package MultilevelInheritance;

import java.util.Scanner;
class EmployeeT {
	int empid;
	String name, address;
	float salary;
	//EmployeeT(){}
	EmployeeT(int empid,
	String name,String address,
	float salary){
		this.empid=empid;
		this.name=name;
		this.address=address;
		this.salary=salary;
	}
}

class Teacher extends EmployeeT{
	 String department,subject;
	 Teacher(int empid,
				String name,String address,
				float salary,String department,String subject){
		 	super(empid,
	name,address,
	salary);
		 	this.department=department;
		 	this.subject=subject;
	 }
public void display() {
	 System.out.println("Teacher details \n id: "+empid+"\n name: "+name+"\nsalary: "+salary +"\naddress: "+address+"\ndepatrment: "+department+"\nsubject: "+subject);
	 
}


}

public class TeacherArrObjects{
	 public static void main (String[] args) {
		 System.out.println("Enter the number of teachers: ");
		 Scanner sc = new Scanner (System.in);
		 int n =sc.nextInt();
		 System.out.println("Enter the teachers details one by one :");
		 Teacher teacher [] =new Teacher[n];
		 Scanner sct = new Scanner (System.in);
		 int tid; String name;float salary;String address;
		 String department;String subject;
		 int j=1;
		 for(int i =0;i<n;i++) 
		 {
			 System.out.println("Enter " + j +" teacher details....");
			 System.out.println("Enter teacher id: ");
			 tid = sct.nextInt();
			 System.out.println("Enter teacher name: ");
			 name=sct.next();
			 System.out.println("Enter teacher salary: ");
			 salary=sct.nextFloat();
			 System.out.println("Enter teacher address: ");
			 address=sct.next();
			 System.out.println("Enter teacher department: ");
			 department=sct.next();
			 System.out.println("Enter teacher subject: ");
			 subject=sct.next();
			 Teacher t = new Teacher (tid,name,address,salary,department,subject);
			 teacher [i]=t;
			 j++;
		 }
		 System.out.println("Teachers are: \n");
		 for (Teacher x :teacher) {
			 x.display();System.out.println("\n");
		 }
	 }
}
