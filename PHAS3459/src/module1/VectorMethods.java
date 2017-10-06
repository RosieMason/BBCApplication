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
		
		//Find the angles between vectors (2, 3, 4) and (1, 2, 3)
		double angle1 = Math.acos(vm.angle(2, 3, 4, 1, 2, 3));
		//Find the andles between vectors (2, 3, 4) and (0, 0, 0)
		double angle2 = Math.acos(vm.angle(2, 3, 4, 0, 0, 0));
		
		System.out.println("The value of the angle between vectors (2, 3, 4) and (1, 3, 2) is "+angle1+" radians"); 
		System.out.println("The value of the angle between vectors (2, 3, 4) and (0, 0, 0) is "+angle2+" radians");
		System.out.println("This second angle does not return a number because the modulus of the vector (0, 0, 0) is zero.");
		System.out.println("This results in everything being multiplied by 0 hence nothig is returned."); 
	}	
}


