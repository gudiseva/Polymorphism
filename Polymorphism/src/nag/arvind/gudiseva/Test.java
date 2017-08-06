package nag.arvind.gudiseva;

public class Test {

	public Test() {}

	public static void main(String[] args) {

		/*
		 * Abstract classes cannot be instantiated, but they can be subclassed.
		 * When an abstract class is subclassed, the subclass usually provides implementations for all of the abstract methods in its parent class.
		 * However, if it does not, then the subclass must also be declared abstract .
		 */
		//TransportationSystem transportationSystem = new TransportationSystem(10); // Not Allowed
		
		Metro metro = new Metro(1, 2, 3, 4, 5);
		System.out.println("Metro Env Hazard: " + metro.calcEnvironmentalHazard());
		TransportationSystem transportationSystem1 = new Metro(1, 2, 3, 4, 5);
		System.out.println("TransportationSystem Env Hazard: " + transportationSystem1.calcEnvironmentalHazard());
		System.out.println("TransportationSystem Cost: " + transportationSystem1.getCost());
		
		Bus bus = new Bus(7, 8, 6, 5);
		System.out.println("Bus Env Hazard: " + bus.calcEnvironmentalHazard());
		TransportationSystem transportationSystem2 = new Bus(7, 8, 6, 5);
		System.out.println("TransportationSystem Env Hazard: " + transportationSystem2.calcEnvironmentalHazard());
		
		Cab cab = new Cab(5, 4, 3, 2, 1);
		System.out.println("Cab Env Hazard: " + cab.calcEnvironmentalHazard());		
		TransportationSystem transportationSystem3 = new Cab(5, 4, 3, 2, 1);
		System.out.println("TransportationSystem Env Hazard: " + transportationSystem3.calcEnvironmentalHazard());
		
		OtherTransport otherTransport = new OtherTransport(10);
		System.out.println("OtherTransport Env Hazard: " + otherTransport.calcEnvironmentalHazard());
		TransportationSystem transportationSystem4 = new OtherTransport(10);
		System.out.println("TransportationSystem Env Hazard: " + transportationSystem4.calcEnvironmentalHazard());

		
	}

}
