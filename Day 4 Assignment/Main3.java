package firstProject;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		
//		Question 3:
//			Create an int array of size 5.
//			Take all the values from the user, add all the values and print the sum.
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int sum = 0;
		
		System.out.println("Enter five numbers ");
		for(int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
			sum = sum + arr[i];
		}
		
		System.out.println("Sum of all five numbers is : " + sum);
	}

}
