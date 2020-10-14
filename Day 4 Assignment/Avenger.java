package firstProject;
import java.util.Scanner;

public class Avenger {
	
	String name, power, weapon, planet;
	int age;
	
	Scanner sc = new Scanner(System.in);
	
	public void getDetails() {
		System.out.println("Enter avenger's name : ");
		name = sc.nextLine();
		System.out.println("Enter avenger's age : ");
		age = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter avenger's power : ");
		power = sc.nextLine();
		System.out.println("Enter avenger's weapon : ");
		weapon = sc.nextLine();
		System.out.println("Enter avenger's planet : ");
		planet = sc.nextLine();
	}
	
	public void displayDetails() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Power : " + power);
		System.out.println("Weapon : " + weapon);
		System.out.println("Planet : " + planet);
	}
	
}
