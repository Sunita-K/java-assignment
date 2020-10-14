package firstProject;

public class Employee {

	String name;
	int dateOfBirth;
	int monthOfBirth;
	int yearOfBirth;
	int monthlySalary;
	int age;
	int monthlySal;
	float annualSal;
	float tax;
	
	public void display() {
		System.out.println("Employee Details");
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Annual Salary : Rs." + annualSal);
		System.out.println("Tax Amount : Rs." + tax);
	}

}
