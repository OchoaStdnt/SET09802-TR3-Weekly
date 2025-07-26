package w0902twoWayAssociations;

public class DemoTwoWayAssociations {
	public static void main(String[] args) {
		
		Person p1 = new Person("John", "Edinburgh", 21);
		Car c1 = new Car("Fiat", "500", "white");
		
		p1.setCar(c1);
		//c1.setOwner(p1);
	
		
		p1.displayDetails();
		c1.displayDetails();
		
		

	}

}
