package ugam.solutions.doselect;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import nag.arvind.gudiseva.Metro;
import nag.arvind.gudiseva.TransportationSystem;

// Class name should be "Source",
// otherwise solution won't be accepted
public class Source {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        // Declare the variable
        int a;
        
        // Read the variable from STDIN
        a = in.nextInt();
        
        // Output the variable to STDOUT
        System.out.println(a);
           
		metro metro1 = new metro(1, 2, 3, 4, 5);
		System.out.println("Metro Env Hazard: " + metro1.calcEnvironmentalHazard());
		System.out.println("Metro Cost Hazard: " + metro1.getCost());
		
		transportationSystem transportationSystem1 = new metro(1, 2, 3, 4, 5);
		System.out.println("TransportationSystem Env Hazard: " + transportationSystem1.calcEnvironmentalHazard());
		System.out.println("TransportationSystem Cost: " + transportationSystem1.getCost());
		
   }
}


class transportationSystem {
    
    private int cost;
    
    public transportationSystem(int cost) {
    	this.cost = cost;
	}

	public int getCost(){
    	return cost;
    }
    
    public double calcEnvironmentalHazard() {
        return 0;
    }
    
}

class metro extends transportationSystem {
    private int length;
    private int trains;
    private int runs;
    private double emissionRate;
    
    public metro(int cost, int length, int trains, int runs, double emissionRate) {
        super(cost);
        this.length = length;
        this.trains = trains;
        this.runs = runs;
        this.emissionRate = emissionRate;
    }
    
    public double calcEnvironmentalHazard() {
        double Environmentalhazardscore = length * trains * runs * emissionRate;
        return Environmentalhazardscore;
    }
    
}

class bus extends transportationSystem {
    private int buses;
    private int workingHours;
    private double emissionRate;
    
    public bus(int cost, int buses, int workingHours, double emissionRate) {
        super(cost);
        this.buses = buses;
        this.workingHours = workingHours;
        this.emissionRate = emissionRate;
    }
    
    public double calcEnvironmentalHazard() {
        double Environmentalhazardscore = buses * workingHours * emissionRate;
        return Environmentalhazardscore;
    }
    
}

class cab extends transportationSystem {
    private double averageTrips;
    private int cabs;
    private double averageTripLength;
    private double emissionRate;
    
    public cab(int cost, double averageTrips, int cabs, double averageTripLength, double emissionRate) {
        super(cost);
        this.averageTrips = averageTrips;
        this.cabs = cabs;
        this.averageTripLength = averageTripLength;
        this.emissionRate = emissionRate;
    }
    
    public double calcEnvironmentalHazard() {
        double EnvironmentalScore = averageTrips * cabs * averageTripLength * emissionRate;
        return EnvironmentalScore;
    }
    
}
