package module2;

public class Complex {
	double x; double y;
	
	public Complex() {}
	public Complex(double a, double b) {
		x = a; y = b;
	}
	
	public double real() {
		return x;
	}
	
	public double imag() {
		return y;
	}
	
	public double modulus() {
		double mod = Math.sqrt(x*x + y*y);
		return mod;
	}
	
	public double angle() {
		double ang = Math.atan(y / x);
		return ang;
	}
	
	public Complex conjugate() {
		Complex c = new Complex(x, -y);
		return c;
	}
	
	public Complex normalised() {
		Complex m = new Complex(x / modulus(), y / modulus());
		return m;
	}
	
	public boolean equals(Complex c) {
		boolean t = false;
		if (this.x == c.x && this.y == c.y);
			t = true;
		return t;
	}
	
	public String toString() {
		return x + " + " + y + "i";
	}
	
	public static Complex setFromModulusAngle(double mag, double ang) {
		Complex c = new Complex(mag * Math.cos(ang), mag*Math.sin(ang));
		return c;
	}
	
	public static Complex add(Complex a , Complex b) {
		Complex c = new Complex(a.x + b.x, a.y + b.y);
		return c;
	}
	
	public static Complex subtract(Complex a, Complex b) {
		Complex c = new Complex(a.x - b.x , a.y - b.y);
		return c;
	}
	
	public static Complex multiply(Complex a, Complex b) {
		Complex c = new Complex(a.x * b.x - a.y*b.y, a.x * b.y + a.y*b.x);
		return c;
	}
	
	public static Complex divide(Complex a, Complex b) {
		Complex c = new Complex((a.x*b.x + a.y*b.y) / (b.x*b.x + b.y*b.y), (a.y*b.x - a.x*b.y)/(b.x*b.x + b.y*b.y));
		return c;
	}
	
	private static double I = Math.sqrt(-1);
	private static double ONE = 1;
	private static double ZERO = 0;

	public static void main(String[] args) {
	}

}
