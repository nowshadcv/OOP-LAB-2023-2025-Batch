package product;

import java.util.Scanner;

public class Employee1{
	int eNo,eSalary;
	String eName;
	public Employee1(){}
	public Employee1(int no,int sal,String name){
		eNo=no;
		eSalary=sal;
		eName=name;}
	public void showData(){
        System.out.print("Empid="+eNo+""+"Name="+eName+""+"Salary="+eSalary);
        System.out.println();}
public class EmpArrObjects{
	public static void main(String[] args) {
		System.out.println("enter number of employees:");
        Scanner sc=new Scanner (System.in);
        int n =sc.nextInt();
        System.out.println("Enter Employee details one by one");
        Employee1 employees[]=new Employee1[n];
        Scanner scemp=new Scanner (System.in);
        int eid,esal;
        String enam;
        for(int i=0;i<n;i++){
            System.out.println("ENTER "+i+"EMPLOYEE DETAILS...");
            System.out.println("enter employee id (integer):");
            eid=scemp.nextInt();
            System.out.println("enter employee name(String):");
            String nam=scemp.next();
            enam=new String(nam);
            System.out.println("enter employee salary(integer):");
            esal=scemp.nextInt();
            Employee1 emp=new Employee1(eid,esal,enam);
            employees[i]=emp;
        }
        System.out.println("Employee are:\n");
        for(Employee1 y:employees)
        y.showData();
        System.out.println("enter employee number to search:");
        int semp=sc.nextInt();
        boolean found=false;
        for(Employee1 e:employees){
            if(semp==e.eNo){
                found=true;
                System.out.println("employee found");
                e.showData();
                break;
                }
        }
        if(! found)
        System.out.println("Employee not found...");
}
}
}