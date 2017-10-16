package module3;

public class TestExceptions {

	public static void main(String[] args) { 
		Complex c1 = Complex.ZERO;
		Complex c2 = new Complex(1, 2);
		try {
			 Complex c = c1.normalised();
			 System.out.println(c);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		try {
			 Complex c = Complex.divide(c2, c1);
			 System.out.println(c);
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

}
