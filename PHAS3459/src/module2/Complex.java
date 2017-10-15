package module2;

public class Complex {
	//establish the 2 parts of an imaginary number
	double x; double y;
	
	public Complex() {}
	//defing the components of an imaginary number
	public Complex(double a, double b) {
		x = a; y = b;
	}
	
	//take the real part 
	public double real() {
		return x;
	}
	
	//take the imaginary part
	public double imag() {
		return y;
	}
	
	//caluclate the modulus
	public double modulus() {
		//|x+iy| = x^2 + y^2
		double mod = Math.sqrt(x*x + y*y);
		return mod;
	}
	
	//caluclate the angle on a Argand diagram 
	public double angle() {
		//tan(theta) = y/x
		double ang = Math.atan(y / x);
		return ang;
	}
	
	//calculate the complex conjugate of a complex number
	public Complex conjugate() {
		//x+iy = x-iy
		Complex c = new Complex(x, -y);
		return c;
	}
	
	//normalise a complex number
	public Complex normalised() {
		// |x + iy| = 1
		Complex m = new Complex(x / modulus(), y / modulus());
		return m;
	}
	
	//check if 2 complex numbers are the same 
	public boolean equals(Complex c) {
		boolean t = false;
		//returns true if 2 complex numbers are the same 
		if (this.x == c.x && this.y == c.y);
			t = true;
		return t;
	}
	
	//define how to return complex numbers 
	public String toString() {
		return x + " + " + y + "i";
	}
	
	//calculate a complex number from the magnitude and angle
	public static Complex setFromModulusAngle(double mag, double ang) {
		//x = |x + iy| Cos(theta)
		//y = |x + iy| sin(theta)
		Complex c = new Complex(mag * Math.cos(ang), mag*Math.sin(ang));
		return c;
	}
	
	//add two complex numbers together
	public static Complex add(Complex a , Complex b) {
		//(x+iy)+(a+ib) = (x+a + i(y+b))
		Complex c = new Complex(a.x + b.x, a.y + b.y);
		return c;
	}
	
	//subtract two complex numbers
	public static Complex subtract(Complex a, Complex b) {
		
	//(x+iy)-(a+ib) = (x-a + i(y-b))
		Complex c = new Complex(a.x - b.x , a.y - b.y);
		return c;
	}
	
	//multiply two complex numbers 
	public static Complex multiply(Complex a, Complex b) {
		//(x+iy)(a+ib) = (xa - yb + i(ab + ya))
		Complex c = new Complex(a.x * b.x - a.y*b.y, a.x * b.y + a.y*b.x);
		return c;
	}
	
	//divide two complex numbers
	public static Complex divide(Complex a, Complex b) {
		//(x+iy)/(a+ib) = (xa+yb + i(ya - xb)) / (a^2 + b^2)
		Complex c = new Complex((a.x*b.x + a.y*b.y) / (b.x*b.x + b.y*b.y), (a.y*b.x - a.x*b.y)/(b.x*b.x + b.y*b.y));
		return c;
	}
	
	//define variables that cannot be changed
	public static final Complex I = new Complex(0, Math.sqrt(-1));
	public static final Complex ONE = new Complex(1, 0);
	public static final Complex ZERO = new Complex(0, 0);

	public static void main(String[] args) {
	}

}
