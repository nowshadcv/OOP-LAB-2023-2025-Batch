package multileveljava.java;
class Person1 {
    String name;
    String gender;
    String address;
    int age;

    public Person1(String name, String gender, String address, int age) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }
}

// Employee class inheriting from Person
class Employee extends Person1 {
    int empId;
    String companyName;
    String qualification;
    double salary;

    public Employee(String name, String gender, String address, int age, int empId, String companyName, String qualification, double salary) {
        super(name, gender, address, age);
        this.empId = empId;
        this.companyName = companyName;
        this.qualification = qualification;
        this.salary = salary;
    }
}

// Teacher class inheriting from Employee
class Teacher extends Employee {
    String subject;
    String department;
    int teacherId;

    public Teacher(String name, String gender, String address, int age, int empId, String companyName, String qualification, double salary, String subject, String department, int teacherId) {
        super(name, gender, address, age, empId, companyName, qualification, salary);
        this.subject = subject;
        this.department = department;
        this.teacherId = teacherId;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + empId);
        System.out.println("Company Name: " + companyName);
        System.out.println("Qualification: " + qualification);
        System.out.println("Salary: " + salary);
        System.out.println("Subject: " + subject);
        System.out.println("Department: " + department);
        System.out.println("Teacher ID: " + teacherId);
    }
}

public class Person {
    public static void main(String[] args) {
        // Creating an array of Teacher objects
        Teacher[] teachers = new Teacher[2];

        // Initializing Teacher objects
        teachers[0] = new Teacher("John Doe", "Male", "123 Main St", 35, 1001, "ABC School", "Ph.D.", 50000, "Mathematics", "Science", 101);
        teachers[1] = new Teacher("Jane Smith", "Female", "456 Oak St", 40, 1002, "XYZ School", "M.A.", 45000, "English", "Arts", 102);

        // Displaying details of teachers
        System.out.println("Details of Teachers:");
        for (Teacher teacher : teachers) {
            teacher.displayDetails();
            System.out.println();
        }
    }
}
