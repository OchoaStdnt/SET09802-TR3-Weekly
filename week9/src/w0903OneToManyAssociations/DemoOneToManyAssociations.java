package w0903OneToManyAssociations;

public class DemoOneToManyAssociations {
	public static void main(String[] args) {
		
		Person p1 = new Person("John", "Edinburgh", 21);
		
		Car c1 = new Car("Fiat", "500", "white");
		Car c2 = new Car("Rolls Royce", "Silver Shadow", "bright pink");

		p1.addCar(c1);
		p1.addCar(c2);
		
		p1.displayDetails();
	}

}
