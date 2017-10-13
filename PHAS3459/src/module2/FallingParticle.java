package module2;

public class FallingParticle {
	static double m; 
	static double d;
	double t = 0;
	static double h;
	double v;
	final double g = 9.8; 
	double z = h - v * t;
	

	
	
	public FallingParticle () {}
	public FallingParticle(double a, double b) {
		m = a;
		d = b; 
	}
	
	void setH(double val) {h = val;}
	double getZ() {return z;}
	void setV(double val) {v = val;}
	double getV() {return v;}
	double getT() {return t;}
	
	public void doTimeStep(double deltaT) {
		double a = (d * v * v / m) - g;
		v = a * deltaT;
		z = v * deltaT;
	}
	
	public void drop(double deltaT) {
		boolean x = true;
		while (x) {
			doTimeStep(deltaT);
			x= z > 0 ;
			t = t +deltaT;
		}
			
	}
	

	
	public static void main(String[] args) {

	}

}
