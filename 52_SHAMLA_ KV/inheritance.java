package program;
package program;

import java.util.Scanner;

public class person{
	String name;
	String gender;
	String address;
	int age;
	person() {}
	person(String name,String gender,String address,int age){
		this.name=name;
		this.gender=gender;
		this.address=address;
		this.age=age;
	}
}
class employee extends person{
	String empid,company_name,qualification;
	float salary;
	employee(){}
	employee(String name,String gender,String address,int age,String empid,String company_name,String qualification,float salary){
	  super(name,gender,address,age);
	  this.empid=empid;
	  this.company_name=company_name;
	  this.qualification=qualification;
	  this.salary=salary;
	}
	class teacher extends employee{
		String subject,department,teacherid;
		teacher(String name,String gender,String address,int age,String empid,String company_name,String qualification,float salary,String subject,String department,String teacherid){
		  super(name,gender,address,age,empid,company_name,qualification,salary);
		}
	}
	public void display() {
		System.out.println("Teacher id:"+empid);
		System.out.println("Teacher name:"+name);
		System.out.println("Teacher gender:"+gender);
		System.out.println("Teacher address:"+address);
		System.out.println("Teacher age:"+age);
		System.out.println("Teacher company_name:"+company_name);
		System.out.println("Teacher qualification:"+qualification);
		System.out.println("Teacher salary:"+salary);
		System.out.println("Teacher teacherid:"+teacherid);
		System.out.println("Teacher subject:"+subject);
		System.out.println("Teacher department:"+department);
	}	

public class inheritance {
	public static void main(String[] args) {
		System.out.println("enter number of teachers:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("enter teacher details one by one..:");
		teacher teacher[]=new teacher[n];
		Scanner sct=new Scanner(System.in);
		int tid,age,empid;
		String name,company_name,qualification,gender;
		float salary;String address;String department;String subject;
		for(int i=0;i<n;i++)
		{
			System.out.println("enter details of teacher"+(i+1));
			System.out.println("enter teacher id(integer):");
			tid=sct.nextInt();
			System.out.println("enter employee id of teacher"+(i+1)+"(integer):");
			empid=sct.nextInt();
			System.out.println("enter teacher name(String):");
			name=sct.next();
			System.out.println("enter teacher gender(String):");
			gender=sct.next();
			System.out.println("enter teacher age(integer):");
	    	age=sct.nextInt();
			System.out.println("enter teacher department(String):");
			department=sct.next();
			System.out.println("enter teacher qualification(String):");
		    qualification=sct.next();
			System.out.println("enter teacher subject(String):");
			subject=sct.next();
			System.out.println("enter teacher salary(integer):");
			salary=sct.nextFloat();
			teacher t=new teacher(name,gender,address,age,empid,company_name,qualification,salary,subject,department,tid);
			 teacher[i]=t;
			 
		}
			 System.out.println("Teacher are:\n");
			 for(teacher x:teacher) {
				 x.display();
					 System.out.println("\n");
			 }
				 
			 }
	 }
}

			
			
			
			
	package program;

import java.util.Scanner;

public class person{
	String name;
	String gender;
	String address;
	int age;
	person() {}
	person(String name,String gender,String address,int age){
		this.name=name;
		this.gender=gender;
		this.address=address;
		this.age=age;
	}
}
class employee extends person{
	String empid,company_name,qualification;
	float salary;
	employee(){}
	employee(String name,String gender,String address,int age,String empid,String company_name,String qualification,float salary){
	  super(name,gender,address,age);
	  this.empid=empid;
	  this.company_name=company_name;
	  this.qualification=qualification;
	  this.salary=salary;
	}
	class teacher extends employee{
		String subject,department,teacherid;
		teacher(String name,String gender,String address,int age,String empid,String company_name,String qualification,float salary,String subject,String department,String teacherid){
		  super(name,gender,address,age,empid,company_name,qualification,salary);
		}
	}
	public void display() {
		System.out.println("Teacher id:"+empid);
		System.out.println("Teacher name:"+name);
		System.out.println("Teacher gender:"+gender);
		System.out.println("Teacher address:"+address);
		System.out.println("Teacher age:"+age);
		System.out.println("Teacher company_name:"+company_name);
		System.out.println("Teacher qualification:"+qualification);
		System.out.println("Teacher salary:"+salary);
		System.out.println("Teacher teacherid:"+teacherid);
		System.out.println("Teacher subject:"+subject);
		System.out.println("Teacher department:"+department);
	}	

public class inheritance {
	public static void main(String[] args) {
		System.out.println("enter number of teachers:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("enter teacher details one by one..:");
		teacher teacher[]=new teacher[n];
		Scanner sct=new Scanner(System.in);
		int tid,age,empid;
		String name,company_name,qualification,gender;
		float salary;String address;String department;String subject;
		for(int i=0;i<n;i++)
		{
			System.out.println("enter details of teacher"+(i+1));
			System.out.println("enter teacher id(integer):");
			tid=sct.nextInt();
			System.out.println("enter employee id of teacher"+(i+1)+"(integer):");
			empid=sct.nextInt();
			System.out.println("enter teacher name(String):");
			name=sct.next();
			System.out.println("enter teacher gender(String):");
			gender=sct.next();
			System.out.println("enter teacher age(integer):");
	    	age=sct.nextInt();
			System.out.println("enter teacher department(String):");
			department=sct.next();
			System.out.println("enter teacher qualification(String):");
		    qualification=sct.next();
			System.out.println("enter teacher subject(String):");
			subject=sct.next();
			System.out.println("enter teacher salary(integer):");
			salary=sct.nextFloat();
			teacher t=new teacher(name,gender,address,age,empid,company_name,qualification,salary,subject,department,tid);
			 teacher[i]=t;
			 
		}
			 System.out.println("Teacher are:\n");
			 for(teacher x:teacher) {
				 x.display();
					 System.out.println("\n");
			 }
				 
			 }
	 }
}

			
			
			
			
	package program;

import java.util.Scanner;

public class person{
	String name;
	String gender;
	String address;
	int age;
	person() {}
	person(String name,String gender,String address,int age){
		this.name=name;
		this.gender=gender;
		this.address=address;
		this.age=age;
	}
}
class employee extends person{
	String empid,company_name,qualification;
	float salary;
	employee(){}
	employee(String name,String gender,String address,int age,String empid,String company_name,String qualification,float salary){
	  super(name,gender,address,age);
	  this.empid=empid;
	  this.company_name=company_name;
	  this.qualification=qualification;
	  this.salary=salary;
	}
	class teacher extends employee{
		String subject,department,teacherid;
		teacher(String name,String gender,String address,int age,String empid,String company_name,String qualification,float salary,String subject,String department,String teacherid){
		  super(name,gender,address,age,empid,company_name,qualification,salary);
		}
	}
	public void display() {
		System.out.println("Teacher id:"+empid);
		System.out.println("Teacher name:"+name);
		System.out.println("Teacher gender:"+gender);
		System.out.println("Teacher address:"+address);
		System.out.println("Teacher age:"+age);
		System.out.println("Teacher company_name:"+company_name);
		System.out.println("Teacher qualification:"+qualification);
		System.out.println("Teacher salary:"+salary);
		System.out.println("Teacher teacherid:"+teacherid);
		System.out.println("Teacher subject:"+subject);
		System.out.println("Teacher department:"+department);
	}	

public class inheritance {
	public static void main(String[] args) {
		System.out.println("enter number of teachers:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("enter teacher details one by one..:");
		teacher teacher[]=new teacher[n];
		Scanner sct=new Scanner(System.in);
		int tid,age,empid;
		String name,company_name,qualification,gender;
		float salary;String address;String department;String subject;
		for(int i=0;i<n;i++)
		{
			System.out.println("enter details of teacher"+(i+1));
			System.out.println("enter teacher id(integer):");
			tid=sct.nextInt();
			System.out.println("enter employee id of teacher"+(i+1)+"(integer):");
			empid=sct.nextInt();
			System.out.println("enter teacher name(String):");
			name=sct.next();
			System.out.println("enter teacher gender(String):");
			gender=sct.next();
			System.out.println("enter teacher age(integer):");
	    	age=sct.nextInt();
			System.out.println("enter teacher department(String):");
			department=sct.next();
			System.out.println("enter teacher qualification(String):");
		    qualification=sct.next();
			System.out.println("enter teacher subject(String):");
			subject=sct.next();
			System.out.println("enter teacher salary(integer):");
			salary=sct.nextFloat();
			teacher t=new teacher(name,gender,address,age,empid,company_name,qualification,salary,subject,department,tid);
			 teacher[i]=t;
			 
		}
			 System.out.println("Teacher are:\n");
			 for(teacher x:teacher) {
				 x.display();
					 System.out.println("\n");
			 }
				 
			 }
	 }
}

			
			
			
			
	

public class inheritance {

}
