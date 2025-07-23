package w0802linkedList;

public class ATCDemo {
	public static void main(String[] args) {
		AirTrafficControlSystem atc = new AirTrafficControlSystem();
		
		Plane p1 = new Plane(1234);
		Plane p2 = new Plane(2345);
		Plane p3 = new Plane(3456);
		Plane p4 = new Plane(4567);
		
		atc.add(p1);
		atc.add(p2);
		atc.add(p3);
		atc.add(p4);
		
		atc.sizeOfQueue();
		atc.whoIsNextToLand();
		atc.land();
		atc.whoIsNextToLand();
		atc.sizeOfQueue();
		atc.whoIsNextToLand();
		atc.land();
		atc.whoIsNextToLand();
		atc.sizeOfQueue();

	}

}
