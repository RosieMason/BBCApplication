package module2;

public class ThreeVector {
	
	//establish the 3 components of a vector 
	//private so they do not change in future calculations
	private double x; 
	private double y; 
	private double z;
	
	public ThreeVector(){}
	//define the components of a three vector
	public ThreeVector(double a, double b, double c) {
		x = a; y=b; z=c;
	}
	
	//calculate the magnitude 
	public double magnitude() {
		//|v|^2 = X^2 + Y+2 + Z^2
		double m = Math.sqrt(x*x + y*y + z*z);
		return m;
	}
	
	//calulate the unit vector 
	public ThreeVector unitVector() {
		//U = 1/mag(x, y, z)
		ThreeVector u=new ThreeVector(x/magnitude(), y/magnitude(), z/magnitude());
		return u;
	}
	
	//define how to return ThreeVectors
	public String toString() {
		return "(" +x+","+ y+","+ z+")";
		
	}
	
	//calculate the dot Product using a static
	public static double scalarProduct(ThreeVector a, ThreeVector b) {
		//(x, y, z).(a, b, c) = xa + yb + zc
		double scalar =  a.x * b.x + a.y * b.y + a.z * b.z;
		return scalar;		
	}
	
	//calculate the cross product using a static
	public static ThreeVector vectorProduct(ThreeVector a, ThreeVector b) {
		//(x, y, z)x(a, b, c) = (yc-zb, za-xc, xb-ya)
		ThreeVector v = new ThreeVector(a.y*b.z - a.z*b.y, a.z*b.x - a.x*b.z, a.x*b.y - a.y*b.x);
		return v;
	}
	
	//add 2 three vectors together using a static
	public static ThreeVector add(ThreeVector a, ThreeVector b) {
		//(x, y, z)+(a, b, c) = (x+a, b+y, c+z)
		ThreeVector ad = new ThreeVector(a.x+b.x, a.y+b.y, a.z+b.z);
		return ad;
	}
	
	//calculate the angle between 2 three vectors using a static
	public static double angle(ThreeVector a, ThreeVector b) {
		////a.b = |a||b|cos(theta)
		double ang = Math.acos(scalarProduct(a, b) / (a.magnitude() * b.magnitude()));
		return ang;
	}
	
	
	//calculate the dot product
	public double scalarProduct(ThreeVector a) {
		//call on the previous scalarProduct
		return scalarProduct(this, a);
	}
	
	//calculate the cross product  
	public ThreeVector vectorProduct(ThreeVector a) {
		//call on the previous scalarProduct
		return vectorProduct(this, a);
	}
	
	//add 2 three vectors together
	public ThreeVector add(ThreeVector a) {
		//call on the previous scalarProduct
		return add(this, a);
	}
	
	//calculate the angle between 2 three vectors 
	public double angle(ThreeVector a) {
		//call on the previous scalarProduct
		return angle(this, a);
	}
	
	public static void main(String[] args) {
	}

}
