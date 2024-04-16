package LABCYCLE;

import java.util.Scanner;

public class Person {
	String name;
	String gender;
	String address;
	int age;
	Person(){}
	Person(String name,String gender,String address,int age){
		this.name=name;
		this.gender=gender;
		this.address=address;
		this.age=age;
	}
}
class Employees extends Person{
	String empid,company_name,qualification;
	float salary;
	Employees(){}
	Employees(String name,String gender,String address,int age,String empid,String company_name,String qualification,float salary){
		super(name,gender,address,age);
		this.empid=empid;
		this.company_name=company_name;
		this.qualification=qualification;
		this.salary=salary;
	}
}
class Teachers extends Employees{
	String subject,department,teacherid;
	Teachers(String name,String gender,String address,int age,String empid,String company_name,String qualification,float salary,String subject,String department,String teacherid){
		super(name,gender,address,age, empid,company_name,qualification,salary);
		this.subject=subject;
		this.department=department;
		this.teacherid=teacherid;
}
public void display() {
	System.out.println("Teacher id:"+empid);
	System.out.println("Teacher name:"+name);
	System.out.println("Teacher Gender:"+gender);
	System.out.println("Teacher Address:"+address);
	System.out.println("Teacher Age:"+age);
	System.out.println("Teacher Company_name:"+company_name);
	System.out.println("Teacher Qualification:"+qualification);
	System.out.println("Teacher salary:"+salary);
	System.out.println("Teacher teacher_id:"+teacherid);
	System.out.println("Teacher subject:"+subject);
	System.out.println("Teacher department:"+department);
}
public class TeacherArrObject{
	public static void main(String[] args) {
		System.out.println("Enter the number of Teachers:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter Teachers details one by one....");
		Teachers teacher[]=new Teachers[n];
		Scanner sct=new Scanner(System.in);
		int age;
		String name,company_name,qualification,gender,empid,teacherid;
		float salary;
		String address;
		String department;
		String subject;
		for(int i=0;i<n;i++) {
			System.out.println("Enter deatails of teacher"+(i+1));
			System.out.println("Enter Teachers id(integer):");
			teacherid=sct.next();
			System.out.println("Enter employee id(integer):");
			empid=sct.next();
			System.out.println("Enter Teachers name(string):");
			name=sct.next ();
			System.out.println("Enter Teachers gender(string):");
			gender=sct.next ();
			System.out.println("Enter Teachers address(string):");
			address=sct.next ();
			System.out.println("Enter Teachers age(integer):");
			age=sct.nextInt();
			System.out.println("Enter Teachers company_name(string):");
			company_name=sct.next ();
			System.out.println("Enter Teachers department(string):");
			department=sct.next ();
			System.out.println("Enter Teachers qualification(string):");
			qualification=sct.next ();
			System.out.println("Enter Teachers subject(string):");
			subject=sct.next ();
			System.out.println("Enter Teachers salary(float):");
			salary=sct.nextFloat();
			Teachers t=new Teachers(name,gender,address,age,empid,company_name,qualification,salary,subject,department,teacherid);
			teacher[i]=t;
		}
		for(Teachers x:teacher) {
			x.display();
			System.out.println("\n");
		}
	}
}}
