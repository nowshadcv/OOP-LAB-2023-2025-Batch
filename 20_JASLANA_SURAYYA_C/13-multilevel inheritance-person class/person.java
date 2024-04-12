package project1;

import java.util.Scanner;

public class person {
	String name;
	String gender;
	String address;
	int age;
	person(){}
	person(String name,String gender,String address,int age) {
		this.name=name;
		this.gender=gender;
		this.address=address;
		this.age=age;
	}
}
class Employee extends person{
	String empid,company_name,qualification;
	float salary;
	Employee(){}
	Employee(String name,String gender,String address,int age,String empid,String company_name,String qualification,float salary){
		super(name,gender,address,age);
		this.empid=empid;
		this.company_name=company_name;
		this.qualification=qualification;
		this.salary=salary;
	}
	class Teacher extends Employee{
		String subject,department,teacherid;
		Teacher(String name,String gender,String address,int age,String empid,String company_name,String qualification,float salary,String subjects,String department,String teacherid){
			super(name,gender,address,age,empid,company_name,qualification,salary);
		}
	}
	public void display() {
		System.out.println("Teacher id:"+empid);
		System.out.println("Teacher name:"+name);
		System.out.println("Teacher gender:"+gender);
		System.out.println("Teacher address:"+address);
		System.out.println("Teacher age:"+age);
		System.out.println("Teacher company_name;"+company_name);
		System.out.println("Teacher qualification:"+qualification);
		System.out.println("Teacher salary:"+salary);
		System.out.println("Teacher teacher_id:"+teacherid);
		System.out.println("Teacher subject:"+subject);
		System.out.println("Teacher department:"+department);
	}
}
public class TeacherArrObjects{
	public static void main(String[]args) {
		System.out.println("Enter number of teachers:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter teacher details one by one..");
		Teacher teacher[]=new Teacher[n];
		Scanner sct=new Scanner(System.in);
		int tid,age,empid;
		String name,company_name,qualification,gender;
		float salary;
		String address;
		String department;
		String subject;
		for(int i=0;i<n;i++) {
			System.out.println("Enter details of teacher"+(i+1));
			System.out.println("Enter teacherid(integer):");
			tid=sct.nextInt();
			System.out.println("Enter employee id of teacher"+(i+1)+"(integer):");
			empid=sct.nextInt();
			System.out.println("Enter teacher name(String):");
			name=sct.next();
			System.out.println("Enter teacher gender(String):");
			gender=sct.next();
			System.out.println("Enter teacher address(String):");
			address=sct.next();
			System.out.println("Enter teacher age(integer):");
			age=sct.nextInt();
			System.out.println("Enter teacher company name(string):");
			company_name=sct.next();
			System.out.println("Enter teacher department(string):");
			department=sct.next();
			System.out.println("Enter teacher Qualification(string):");
			qualification=sct.next();
			System.out.println("Enter teacher subject(string):");
			subject=sct.next();
			System.out.println("Enter teacher salary(float):");
			salary=sct.nextFloat();
			Teacher t=new Teacher(name,gender,address,age,empid,company_name,qualification,salary,department,tid);
			teacher[i]=t;
		}
		System.out.println("Teacher are:\n");
		for(Teacher x:teacher) {
			x.display();
			System.out.println("\n");
		}
	}
}

