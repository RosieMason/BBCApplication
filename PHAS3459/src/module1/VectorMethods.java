package module1;

public class VectorMethods {
	
	//Calculate the modulus of a vector
	public double magnitude(double x, double y, double z) {
		double m;
		// |(x, y, z)|^2 = x^2 + y^2 + z^2
		m = Math.sqrt(x*x + y*y + z*z);
		return m;
	}
	
	//Calculate the dot product of 2 vectors
	public double dotProduct(double a, double b, double c, double d, double e, double f) {
		double dot;
		//(x, y, z).(a, b, c) = xa + yb + zc
		dot= a*d + b*e + c*f;
		return dot;
	}
		
	//Calculate the angle between two vectors using the previously coded magnitude and dot product
	public double angle(double a, double b, double c, double d, double e, double f) {
		double t;
		//a.b = |a||b|cos(theta)
		t= dotProduct(a, b, c, d, e, f) / ( magnitude(a, b, c) * magnitude (d, e, f));
		return t;
	}
		
	public static void main(String[] args) {
		VectorMethods vm = new VectorMethods();
		
		//define variables for 1st set of vectors
		double a1 = 2;
		double b1 = 3;
		double c1 = 4;
		double d1 = 1;
		double e1 = 3;
		double f1 = 2;
		
		//define variables for 2nd set of vectors 
		double d2 = 0;
		double e2 = 0;
		double f2 = 0;
		
		//Find the angles between vectors
		double angle1 = Math.acos(vm.angle(a1, b1, c1, d1, e1, f1));
		double angle2 = Math.acos(vm.angle(a1, b1, c1, d2, e2, f2));
		
		System.out.println("The value of the angle between vectors (2, 3, 4) and (1, 3, 2) is "+angle1+" radians"); 
		System.out.println("The value of the angle between vectors (2, 3, 4) and (0, 0, 0) is "+angle2+" radians");
		//This second angle does not return a number because the modulus of the vector (0, 0, 0) is zero.
		//This results in everything being multiplied by 0 hence nothig is returned. 
	}	
}


