package firstProject;

public class Main1 {

	public static void main(String[] args) {
		
//		Question 1:
//			Create a class Avenger with
//			properties - name, age, power, weapon, planet and with
//			functions - getDetails() and displayDetails().
//			Create 5 objects as an array in the main method and call.
		
		Avenger[] a = new Avenger[5];
		
		for(int i = 0; i < 5; i++) {
			a[i] = new Avenger();
			a[i].getDetails();
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Details of Avenger #" + (i+1));
			a[i].displayDetails();
			System.out.println();
		}
		
	}

}
