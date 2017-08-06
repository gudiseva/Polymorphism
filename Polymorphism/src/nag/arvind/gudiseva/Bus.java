package nag.arvind.gudiseva;

public class Bus extends TransportationSystem {
	private int cost;
    private int buses;
    private int workingHours;
    private double emissionRate;

	public Bus(int cost, int buses, int workingHours, double emissionRate) {
		this.cost = cost;
		this.buses = buses;
        this.workingHours = workingHours;
        this.emissionRate = emissionRate;
	}

    public double calcEnvironmentalHazard() {
        double Environmentalhazardscore = buses * workingHours * emissionRate;
        return Environmentalhazardscore;
    }

	@Override
	public int getCost() {
		return cost;
	}

}
