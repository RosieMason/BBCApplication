package module2;

public class TestComplex {

	public static void main(String[] args) {
		Complex c1 = new Complex(1, 2);
		Complex c2 = new Complex(-2, -1);
		
		System.out.println("The product of c1 and c2 is"+Complex.multiply(c1,  c2));
		System.out.println("The ratio of c1 / c2 is "+Complex.divide(c1,  c2));
		System.out.println("The product of c1 and I is" + Complex.multiply(c1, Complex.I));
		System.out.println("This return Nan, although Complex is coded in order to treat complex nmbers in the correct way, ");
		System.out.println("it still doesnt know how to consider the square root of minus one.");
		System.out.println("The ratio of c1/0 is " + Complex.divide(c1, Complex.ZERO));
		System.out.println("This returns Nan, this is because Java cannot divide by zero.");
		System.out.println("The product of c1 with the conugate of c1 is "+ Complex.multiply(c1,  c1.conjugate()));
		System.out.println("The product of c2 with the conjugate of c2 is "+Complex.multiply(c2, c2.conjugate()));
		
		

	}

}
