package PastPaper2013MidTerm;

import java.util.*;

public class EventsData {
	
	int charge;
	double momentum;
	double theta;
	double phi;
	
	public EventsData(int charge, double momentum, double theta, double phi) {
		this.charge = charge;
		this.momentum = momentum;
		this.theta = theta;
		this.phi = phi;
	}
	
	public int getCharge() {
		return charge;
	}
	
	public double getMomentum() {
		return momentum;
	}
	
	public double getTheta() {
		return theta;
	}
	
	public double getPhi() {
		return phi;
	}
	
	public String toString() {
		String data = "Charge: "+charge+", momentum: "+momentum+" GeV/c, Theta: "+theta+" radians, Phi: "+phi+" radians.";
		return data;
	}
	
	public static EventsData FromString(String line) throws Exception {
		
		Scanner s = new Scanner(line);
		
		int charge = s.nextInt();
		double momentum = s.nextDouble();
		double theta = s.nextDouble();
		double phi = s.nextDouble();
		
		s.close();
		
		return new EventsData(charge, momentum, theta, phi);
	}


}
