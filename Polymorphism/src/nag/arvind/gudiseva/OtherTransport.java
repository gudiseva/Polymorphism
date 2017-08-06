package nag.arvind.gudiseva;

public class OtherTransport extends TransportationSystem {

	private int cost;
	
	public OtherTransport(int cost) {
		this.cost = cost;
	}

	// calcEnvironmentalHazard() is not overridden in subclasss
	// How do I call abstract class method?
	// Since I can't create object from abstract class how do I call method in abstract class?
	/*
	 * Either you create a concrete class which doesn't override the method,
	 * or within a concrete class which does override the method,
	 * you can call super.method().
	 * 
	 * If you've only got an instance of an object which overrides a method,
	 * you cannot call the original method from "outside" the class,
	 * because that would break encapsulation ...
	 * The purpose of overriding is to replace the behaviour of the original method.
	 * 
	 */


	@Override
	public int getCost() {
		return cost;
	}

}
