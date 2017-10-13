package module2;

public class ThreeVector {
	private double x; 
	private double y; 
	private double z;
	
	public ThreeVector(){}
	public ThreeVector(double a, double b, double c) {
		x = a; y=b; z=c;
	}
	
	public double magnitude() {
		double m = Math.sqrt(x*x + y*y + z*z);
		return m;
	}
	
	public ThreeVector unitVector() {
		ThreeVector u=new ThreeVector(x/magnitude(), y/magnitude(), z/magnitude());
		return u;
	}
	
	public String toString() {
		return "(" +x+","+ y+","+ z+")";
		
	}
	
	public static double scalarProduct(ThreeVector a, ThreeVector b) {
		double scalar =  a.x * b.x + a.y * b.y + a.z * b.z;
		return scalar;		
	}
	
	public static ThreeVector vectorProduct(ThreeVector a, ThreeVector b) {
		ThreeVector v = new ThreeVector(a.y*b.z - a.z*b.y, a.z*b.x - a.x*b.z, a.x*b.y - a.y*b.x);
		return v;
	}
	
	public static ThreeVector add(ThreeVector a, ThreeVector b) {
		ThreeVector ad = new ThreeVector(a.x+b.x, a.y+b.y, a.z+b.z);
		return ad;
	}
	
	public static double angle(ThreeVector a, ThreeVector b) {
		double ang = Math.acos(scalarProduct(a, b) / (a.magnitude() * b.magnitude()));
		return ang;
	}
	
	public double scalarProduct(ThreeVector a) {
		return scalarProduct(this, a);
	}
	
	public ThreeVector vectorProduct(ThreeVector a) {
		return vectorProduct(this, a);
	}
	
	public ThreeVector add(ThreeVector a) {
		return add(this, a);
	}
	
	public double angle(ThreeVector a) {
		return angle(this, a);
	}
	
	public static void main(String[] args) {
	}

}
