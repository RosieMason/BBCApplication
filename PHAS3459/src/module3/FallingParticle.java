package module3;

public class FallingParticle {
	//establish the components of the falling particle
	double m; //mass 
	double d; //drag coefficient
	double t = 0; //time
	double h = 1; //initial height (set to one unless otherwise specified)
	double v = 0; //velocity (measured upward)
	static final double g = 9.8; //gravity
	double z; //vertical height (measured upward)
	
	public FallingParticle () {}
	//define the mass and drag factor
	public FallingParticle(double a, double b) throws Exception{
		if (a < 0) {
			throw new Exception("m cannot be less than zero");
		}
		if(b < 0) {
			throw new Exception("d cannot be less than zero");
		}
		m = a;
		d = b; 
	}
	
	//allow h and v to be 'set' and z, v and t to be 'got'
	void setH(double val) throws Exception{
		if (val < 0) {
			throw new Exception("h cannot be less than zero.");
		}
		h = val;
	}
	
	double getZ() {
		return z;
		}
	
	void setV(double val) {
		v = val;
		}
	
	double getV() {
		return v;
		}
	
	double getT() {
		return t;
		}
	
	//set the timesteps and calculate new values for acceleration, v, and z
	public double  doTimeStep(double deltaT) throws Exception {
		if (deltaT <= 0) {
			throw new Exception("the time step must be bigger than zero");
		}
		//calculate the acceleration
		double a = (d * v * v / m) - g ;
		//recalculate the new v and z
		v = v + a * deltaT;
		z = z + v * deltaT;
		t = t + deltaT;
		return z;
	}
	
	//simulate the drop of a particle 
	public double  drop(double deltaT) throws Exception {
		this.z = this.h;
		if (z<0) {
			throw new Exception ("z cannot be less than zero.");
		}
		boolean x = true;
		//while z > 0 continue the drop
		while (x) {
			doTimeStep(deltaT);
			x= z > 0 ;
		}
		return t;
			
	}
	

	
	public static void main(String[] args) {


	}
}
