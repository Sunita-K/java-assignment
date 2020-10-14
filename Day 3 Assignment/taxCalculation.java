package firstProject;
import java.util.Scanner;

public class taxCalculation {

	public static void main(String[] args) {
		
//		Question 2:
//			Take employee name, date of birth, month of birth, birth year, monthly salary.
//				5l - 20%
//				4l - 15%
//				3l - 10%
//				2l - 5%
//			Display the name, age, annual salary and the tax amount.
		
		Scanner sc = new Scanner(System.in);
		Employee e = new Employee();
		System.out.println("Enter employee name : ");
		e.name = sc.nextLine();
		System.out.println("Enter the date of birth : ");
		e.dateOfBirth = sc.nextInt();
		System.out.println("Enter the month of birth : ");
		e.monthOfBirth = sc.nextInt();
		System.out.println("Enter the birth year : ");
		e.yearOfBirth = sc.nextInt();
		
		e.age = 2020 - e.yearOfBirth;
		
		System.out.println("Enter the monthly salary : ");
		e.monthlySal = sc.nextInt();
		
		e.annualSal = e.monthlySal * 12;
		
		if (e.annualSal >= 500000) {
			e.tax = 0.2f * e.annualSal;
		}
		else if (e.annualSal >= 400000) {
			e.tax = 0.15f * e.annualSal;
		}
		else if (e.annualSal >= 300000) {
			e.tax = 0.1f * e.annualSal;
		}
		else if (e.annualSal >= 200000) {
			e.tax = 0.05f * e.annualSal;
		}
		else {
			e.tax = 0f;
		}
		
		e.display();
	}

}
