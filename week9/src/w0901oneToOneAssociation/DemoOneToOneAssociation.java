package w0901oneToOneAssociation;

public class DemoOneToOneAssociation {
	public static void main(String[] args) {
		
		Person p1 = new Person("John", "Edinburgh", 22);
		Car c1 = new Car("Fiat", "500", "Capuccino");
		
		p1.setCar(c1);
		
		p1.displayDetails();
		//c1.displayDetails();
		

	
	}
} //end class
