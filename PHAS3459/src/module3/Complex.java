package module3;


public class Complex {
	//establish the 2 parts of an imaginary number
	double x; double y;
	
	public Complex() {}
	//seperating the components of an imaginary number
	public Complex(double a, double b) {
		x = a; y = b;
	}
	
	//return the real part 
	public double real() {
		return x;
	}
	
	//return the imaginary part
	public double imag() {
		return y;
	}
	
	//caluclate the modulus: |x+iy| = x^2 + y^2
	public double modulus() {
		double mod = Math.sqrt(x*x + y*y);
		return mod;
	}
	
	//caluclate the angle on a Argand diagram : tan(theta) = y/x
	public double angle() {
		double ang = Math.atan(y / x);
		return ang;
	}
	
	//calculate the complex conjugate of a complex number : x+iy = x-iy
	public Complex conjugate() {
		Complex c = new Complex(x, -y);
		return c;
	}
	
	//normalise a complex number : |x + iy| = 1
	//throw an exception if the number is zero.
	public Complex normalised() throws Exception{
		//use equals function to throw zero exception
		if (this.equals(ZERO)) {
			throw new Exception("Cannot normalise a zero complex number");
		}
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
	//x = |x + iy| Cos(theta)
	//y = |x + iy| sin(theta)
	public static Complex setFromModulusAngle(double mag, double ang) {
		Complex c = new Complex(mag * Math.cos(ang), mag*Math.sin(ang));
		return c;
	}
	
	//add two complex numbers together : (x+iy)+(a+ib) = (x+a + i(y+b))
	public static Complex add(Complex a , Complex b) {
		Complex c = new Complex(a.x + b.x, a.y + b.y);
		return c;
	}
	
	//subtract two complex numbers : (x+iy)-(a+ib) = (x-a + i(y-b))
	public static Complex subtract(Complex a, Complex b) {
		Complex c = new Complex(a.x - b.x , a.y - b.y);
		return c;
	}
	
	//multiply two complex numbers : (x+iy)(a+ib) = (xa - yb + i(ab + ya))
	public static Complex multiply(Complex a, Complex b) {
		Complex c = new Complex(a.x * b.x - a.y*b.y, a.x * b.y + a.y*b.x);
		return c;
	}
	
	//divide two complex numbers : (x+iy)/(a+ib) = (xa+yb + i(ya - xb)) / (a^2 + b^2)
	//throw an exception if either of the numbers is zero
	public static Complex divide(Complex a, Complex b) throws Exception {
		//use equals function to throw zero exception
		if (b.equals(ZERO) == true|| a.equals(ZERO)) {
			throw new Exception("Cannot divide a zero complex number");
		}
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
