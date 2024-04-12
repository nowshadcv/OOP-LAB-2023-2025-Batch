package PackB;

import java.util.Scanner;

class Person{
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
class Employee extends Person{
	int empid,salary;
	String companyname,qualification;
	Employee(){}
	Employee(String name,String gender,String address,int age,int empid,int salary,String companyname,String qualification){
		super(name,gender,address,age);
		this.empid=empid;
		this.salary=salary;
		this.companyname=companyname;
		this.qualification=qualification;
	}
}
class TeacherT extends Employee{
	int teacherid;
	String department,subject;
	TeacherT(){}
	TeacherT(String name,String gender,String address,int age,int empid,int salary,String companyname,String qualification,int teacherid,String department,String subject){
		super(name,gender,address,age,empid,salary,companyname,qualification);
		this.teacherid=teacherid;
		this.department=department;
		this.subject=subject;
		
	}
	public void display() {
		System.out.println("Teacher id:"+empid);
		System.out.println("Teacher name:"+name);
		System.out.println("Teacher gender:"+gender);
		System.out.println("Teacher age:"+age);
		System.out.println("Teacher salary:"+salary);
		System.out.println("Teacher companyname:"+companyname);
		System.out.println("Teacher qualification:"+qualification);
		System.out.println("Teacher id:"+teacherid);
		System.out.println("Teacher address:"+address);
		System.out.println("Teacher department:"+department);
		System.out.println("Teacher subject:"+subject);
	}
}

public class TeacherArrObjects {

	public static void main(String[] args) {
		System.out.println("Enter no of teachers");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter Teacher deatils onr by one..");
		TeacherT teacher[]=new TeacherT[n];
		Scanner scT=new Scanner(System.in);
		int empid;int age;String gender;String name;int salary;String address;String companyname;String qualification;
		int teacherid;String department;String subject;
		for(int i=0;i<n;i++) {
			System.out.println("Enter "+i+" teacher details...");
			System.out.println("Enter employee id(integer):");
			empid=scT.nextInt();
			System.out.println("Enter teacher name(String):");
			name=scT.next();
			System.out.println("Enter teacher age:");
			age=scT.nextInt();
			System.out.println("Enter teacher gender(String):");
			gender=scT.next();
			System.out.println("enter teacher salary(int):");
			salary=scT.nextInt();
			System.out.println("enter teacher address(string):");
			address=scT.next();
			System.out.println("Enter teacher company name(String):");
			companyname=scT.next();
			System.out.println("Enter teacher qualification(String):");
			qualification=scT.next();
			System.out.println("Enter teacher id:");
			teacherid=scT.nextInt();
			System.out.println("enter teacher department(string):");
			department=scT.next();
			System.out.println("enter teacher subject(string):");
			subject=scT.next();
			TeacherT t=new TeacherT(name,gender,address,age,empid,salary,companyname,qualification,teacherid,department,subject);
			teacher[i]=t;

	}
System.out.println("Teachers are:\n");
for(TeacherT x:teacher) {
	x.display();System.out.println("\n");
}
}
}
