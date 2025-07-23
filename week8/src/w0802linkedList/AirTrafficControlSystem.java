package w0802linkedList;

import java.util.LinkedList;

public class AirTrafficControlSystem {
	
	private LinkedList <Plane> theLandingQueue = new LinkedList <Plane> ();
	
	public void add(Plane plane) {
		this.theLandingQueue.addLast(plane);
	}
	
	public void sizeOfQueue() {
		System.out.println(this.theLandingQueue.size());
	}
	
	public void land() {
		this.theLandingQueue.removeFirst();
	}
	
	public void whoIsNextToLand() {
		System.out.println(this.theLandingQueue.peekFirst().getFlightNumber());
	}

}
