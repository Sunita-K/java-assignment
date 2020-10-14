package firstProject;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		
//		Question 2:
//			Create an int array with 5 values and print only odd values.
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		System.out.println("Enter five numbers ");
		for(int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Odd numbers  are :");
		for(int i = 0; i < 5; i++) {
			if (arr[i] % 2 != 0) {
				System.out.println(arr[i]);
			}
		}
	}

}
