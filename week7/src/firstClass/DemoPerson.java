package firstClass;

public class DemoPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		
		p1.setName("John");
		p1.setAddress("Edinburgh");
		p1.setAge(21);
		
		p1.printDetails();
		
		p1.setAge(22);
		p1.printDetails();
		
	}

}
