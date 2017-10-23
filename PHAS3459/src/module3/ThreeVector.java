package module3;

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
	
	//calculate the magnitude : |v|^2 = X^2 + Y+2 + Z^2
	public double magnitude() {
		double m = Math.sqrt(x*x + y*y + z*z);
		return m;
	}
	
	//calulate the unit vector : U = 1/mag(x, y, z) 
	//throws exception if zero three vector
	public ThreeVector unitVector() throws Exception {
		//magnitude is zero in a zero vector - throw exception
		if (magnitude() == 0 ) {
			throw new Exception("Cannot have a unit Vector for a Zero Three Vector");
		}
		ThreeVector u=new ThreeVector(x/magnitude(), y/magnitude(), z/magnitude());
		return u;
	}
	
	//define how to return ThreeVectors
	public String toString() {
		return "(" +x+","+ y+","+ z+")";
		
	}
	
	//calculate the dot Product using a static : (x, y, z).(a, b, c) = xa + yb + zc
	public static double scalarProduct(ThreeVector a, ThreeVector b) {
		double scalar =  a.x * b.x + a.y * b.y + a.z * b.z;
		return scalar;		
	}
	
	//calculate the cross product using a static : (x, y, z)x(a, b, c) = (yc-zb, za-xc, xb-ya)
	public static ThreeVector vectorProduct(ThreeVector a, ThreeVector b) {
		ThreeVector v = new ThreeVector(a.y*b.z - a.z*b.y, a.z*b.x - a.x*b.z, a.x*b.y - a.y*b.x);
		return v;
	}
	
	//add 2 three vectors together using a static : (x, y, z)+(a, b, c) = (x+a, b+y, c+z)
	public static ThreeVector add(ThreeVector a, ThreeVector b) {
		ThreeVector ad = new ThreeVector(a.x+b.x, a.y+b.y, a.z+b.z);
		return ad;
	}
	
	//calculate the angle between 2 three vectors using a static : a.b = |a||b|cos(theta)
	//throws an exception if either three vector is a zero three vector
	public static double angle(ThreeVector a, ThreeVector b) throws Exception{
		//magnitude is zero in a zero vector - throw exception
		if (a.magnitude() == 0  || b.magnitude() == 0) {
			throw new Exception("Cannot calculate the angle with a zero three vector.");
		}
		double ang = Math.acos(scalarProduct(a, b) / (a.magnitude() * b.magnitude()));
		return ang;
	}
	
	
	//calculate the dot product using a non static method
	public double scalarProduct(ThreeVector a) {
		//call on the previous scalarProduct
		return scalarProduct(this, a);
	}
	
	//calculate the cross product using a non static method 
	public ThreeVector vectorProduct(ThreeVector a) {
		//call on the previous scalarProduct
		return vectorProduct(this, a);
	}
	
	//add 2 three vectors together  using a non static method
	public ThreeVector add(ThreeVector a) {
		//call on the previous scalarProduct
		return add(this, a);
	}
	
	//calculate the angle between 2 three vectors  using a non static method
	//throws an exception if a is a zero three vector
	public double angle(ThreeVector a) throws Exception {
		//magnitude is zero in a zero vector - throw exception
		//other vector checked in previous scalarProduct
		if(a.magnitude() == 0) {
			throw new Exception("Cannot divide by zero.");
		}
		//call on the previous scalarProduct
		return angle(this, a);
	}
	
	public static void main(String[] args) {
	}

}
