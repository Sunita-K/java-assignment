package firstProject;

public class Main {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		e1.name = "Ash Ketchum";
		e1.age = 19;
		e1.city = "Kanto";
		
		e2.name = "Gary Oak";
		e2.age = 21;
		e2.city = "Sinnoh";
		
		e1.display();
		e2.display();

	}

}
