package module2;

public class FallingParticle {
	//establish the components of the falling particle
	static double m; //mass 
	static double d; //drag coefficient
	double t = 0; //time
	double h = 1; //initial height (set to one unless otherwise specified)
	double v = 0; //velocity (measured upward)
	final double g = -9.8; //gravity
	double z; //vertical height (measured upward)
	
	public FallingParticle () {}
	//define the mass and drag factor
	public FallingParticle(double a, double b) {
		m = a;
		d = b; 
	}
	
	//allow h and v to be 'set' and z, v and t to be 'got'
	void setH(double val) {h = val;}
	double getZ() {return z;}
	void setV(double val) {v = val;}
	double getV() {return v;}
	double getT() {return t;}
	
	//set the timesteps and calculate new values for acceleration, v, and z
	public double  doTimeStep(double deltaT) {
		//calculate the acceleration
		double a = (d * v * v / m) - g;
		//recalculate the new v and z
		v = v - a * deltaT;
		z = z + v * deltaT;
		return z;
	}
	
	//simulate the drop of a particle 
	public double  drop(double deltaT) {
		boolean x = true;
		//while z > 0 continue the drop
		while (x) {
			doTimeStep(deltaT);
			x= z > 0 ;
			//caluclate the new t
			t = t + deltaT;
		}
		return t;
			
	}
	

	
	public static void main(String[] args) {

	}

}
