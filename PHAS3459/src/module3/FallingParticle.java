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
	//throws an exception if mass isn't positive and drag is negative. 
	public FallingParticle(double a, double b) throws Exception{
		//throw exception if mass is not positive
		if (a <= 0) {
			throw new Exception("mass must be positive");
		}
		//throw exception if drag is negative
		if(b < 0) {
			throw new Exception("drag cannot be less than zero");
		}
		m = a;
		d = b; 
	}
	
	//set h - throws exception if h is negative
	void setH(double val) throws Exception{
		//throw exception for h < 0
		if (val < 0) {
			throw new Exception("initial height cannot be negative.");
		}
		h = val;
	}
	
	//method to 'get' the z value 
	double getZ() {
		return z;
		}
	
	//method to 'set' the v value 
	void setV(double val) {
		v = val;
		}
	
	//method to 'get' the v value 
	double getV() {
		return v;
		}
	
	//method to 'get' the t value 
	double getT() {
		return t;
		}
	
	//set the timesteps and calculate new values for acceleration, v, z and  t
	//throws exception if the timestep is not positive
	public double  doTimeStep(double deltaT) throws Exception {
		//throw exception if timestep is not positive
		if (deltaT <= 0) {
			throw new Exception("the time step must be positive");
		}
		//calculate the acceleration
		double a = (d * v * v / m) - g ;
		//recalculate the new v, z and t
		v = v + a * deltaT;
		z = z + v * deltaT;
		t = t + deltaT;
		return z;
	}
	
	//simulate the drop of a particle 
	//throws exception if the timestep is not positive - this is called on in soTimeStep Method
	public double  drop(double deltaT) throws Exception {
		this.z = this.h;
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
