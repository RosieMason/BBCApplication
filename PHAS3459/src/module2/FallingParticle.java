package module2;

public class FallingParticle {
	static double m; 
	static double d;
	double t = 0;
	double z;
	static double h;
	double v;
	final double g = 9.8;
	
	public FallingParticle () {}
	public FallingParticle(double a, double b) {
		m = a;
		d = b; 
	}
	
	void setH(double val) {h = val;}
	double getH() {return h;}
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
		}
			
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
