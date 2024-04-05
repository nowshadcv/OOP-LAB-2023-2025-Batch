package Employee;

class Employe {
	int empid;
	String name;
	double salary;
	String address;
	
	
public Employe(int empid,String name,double salary,String address) {
	this.empid=empid;
	this.name=name;
	this.salary=salary;
	this.address=address;
}

}

class Teacher extends Employe{
	String dept;
	String[] subjectsTaught;
	
	public Teacher(int empid,String name,double salary,String address,String dept,String[]
			subjectsTaught) {
		super(empid,name,salary,address);
		this.dept=dept;
		this.subjectsTaught=subjectsTaught;
	}
	
	public void display() {
		System.out.println("Employee ID:" +empid);
		System.out.println("Name:" +name);
		System.out.println("Salary:" +salary);
		System.out.println("Address:" +address);
		System.out.println("Department:" +dept);
		System.out.println("Subjects Taught:");
		for (String subject:subjectsTaught) {
			System.out.println(subject);
		}
		System.out.println("-------------------------");


		}

	}

public class Employee{
	public static void main(String[] args) {
		int n=3;
		Teacher[] teachers=new Teacher[n];
		
		teachers[0]=new Teacher(1,"John",50000,"123 street","Mathematics",new String[] {"Math","Physics"});
		teachers[1]=new Teacher(2,"Jane",40000,"456 street","Science",new String[] {"Biology","Chemistry"});
		teachers[2]=new Teacher(3,"jojo",45000,"567 street","engineering",new String[] {"Electric","Mechanical"});
		
		System.out.println("Details of Teachers:\n");
		for(Teacher teacher:teachers) {
			teacher.display();
		}
	}
}
