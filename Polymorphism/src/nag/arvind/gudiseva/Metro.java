package nag.arvind.gudiseva;

public class Metro extends TransportationSystem {
	private int cost;
    private int length;
    private int trains;
    private int runs;
    private double emissionRate;
    
	public Metro(int cost, int length, int trains, int runs, double emissionRate) {
		this.cost = cost;
        this.length = length;
        this.trains = trains;
        this.runs = runs;
        this.emissionRate = emissionRate;
        
	}

    public double calcEnvironmentalHazard() {
        double Environmentalhazardscore = length * trains * runs * emissionRate;
        return Environmentalhazardscore;
    }
    
	@Override
	public int getCost() {
		return cost;
	}

}
