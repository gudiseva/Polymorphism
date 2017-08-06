package nag.arvind.gudiseva;

public class Cab extends TransportationSystem {
	private int cost;
    private double averageTrips;
    private int cabs;
    private double averageTripLength;
    private double emissionRate;

	public Cab(int cost, double averageTrips, int cabs, double averageTripLength, double emissionRate) {
		this.cost = cost;
        this.averageTrips = averageTrips;
        this.cabs = cabs;
        this.averageTripLength = averageTripLength;
        this.emissionRate = emissionRate;
	}

    public double calcEnvironmentalHazard() {
        double EnvironmentalScore = averageTrips * cabs * averageTripLength * emissionRate;
        return EnvironmentalScore;
    }

	@Override
	public int getCost() {
		return cost;
	}

}
