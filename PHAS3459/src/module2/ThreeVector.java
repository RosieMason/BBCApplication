package module2;

public class ThreeVector {
	private double x; 
	private double y; 
	private double z;
	
	public ThreeVector(){}
	public ThreeVector(double a, double b, double c) {
		x = a; y=b; z=c;
	}
	
	//public void setVector(double a, double b, double c) {
	//	x = a;
	//y = b;
	//	z = c;	
	//}
	
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
	
	//public static double scalarProduct() {
		
		//scalar = 
		
	//}
	
	

		

	//public ThreeVector(double a, double b, double c) {x = a; y = b; z = c;}
	
	
	

	public static void main(String[] args) {
		ThreeVector vec1 = new ThreeVector(1, 2, 3);
		System.out.println(vec1.magnitude());


	}

}
