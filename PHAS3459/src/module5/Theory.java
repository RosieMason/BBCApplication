package module5;

public class Theory {
	
	//initialize variables
	static double n;
	double y;
	
	//method to set n
	static void setN(double x) {
		n = x;
	}
	
	//method to calculate y=x^n
	public static double calculateY(double x) {
		double y = Math.pow(x, n);
		return y;
	}
	

}
