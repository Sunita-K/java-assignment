package firstProject;
import java.util.Scanner;

public class percentageCalculation {

	public static void main(String[] args) {
		
//		Question 1:
//			Take 5 subjects marks each subject 100 marks.
//			Calculate the percentage.
//			Based on the percentage print the grade and the percentage.
	
		Scanner sc = new Scanner(System.in);
		float m1, m2, m3, m4, m5;
		float percentage;
		char grade;
	
		System.out.println("Enter marks for 5 subjects (each out of 100) :");
		m1 = sc.nextInt();
		m2 = sc.nextInt();
		m3 = sc.nextInt();
		m4 = sc.nextInt();
		m5 = sc.nextInt();
	
		percentage = ((m1 + m2 + m3 + m4 + m5) / 500) * 100;
	
		if (percentage >= 75) {
			grade = 'A';
		}
		else if (percentage >= 50) {
			grade = 'B';
		}
		else if (percentage >= 35) {
			grade = 'C';
		}
		else {
			grade = 'D';
		}
	
		System.out.println("Perecentage : " + percentage);
		System.out.println("Grade : " + grade);

	}

}
