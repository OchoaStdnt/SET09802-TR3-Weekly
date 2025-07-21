package demoConstructorWithParameters;

public class DemoConstructorWithParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("John", "Edinburgh", 21);
		Person p2 = new Person("Bob", 23);
		
		p1.printDetails();
		p2.printDetails();
	}

}
