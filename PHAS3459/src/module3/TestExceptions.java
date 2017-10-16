package module3;

public class TestExceptions {

	public static void main(String[] args) { 
//		Complex c1 = Complex.ZERO;
//		Complex c2 = new Complex(1, 2);
//		try {
//			 Complex c = c1.normalised();
//			 System.out.println(c);
//		}
//		catch (Exception e) {
//		System.out.println(e);
//		}
//		try {
//			 Complex c = Complex.divide(c2, c1);
//			 System.out.println(c);
//		}
//		catch (Exception e) {
//			System.out.println(e);
//		}
//		
//		ThreeVector v1 = new ThreeVector(0, 0, 0);
//		ThreeVector v2 = new ThreeVector(2, 4, 1);
//		try {
//			ThreeVector t = v1.unitVector();
//			System.out.println(t);
//		}
//		catch (Exception e) {
//			System.out.println(e);
//		}
//		
//		try {
//			double a = v2.angle(v1);
//			System.out.println(a);
//		}
//		catch (Exception e) {
//			System.out.println(e);
//		}
//		
//		try{
//			FallingParticle f = new FallingParticle(-2.0, 3.6);
//			System.out.println(f);
//		}
//		catch (Exception e) {
//			System.out.println(e);
//		}
//		
//		try{
//			FallingParticle f = new FallingParticle(2.0, -3.6);
//			System.out.println(f);
//		}
//		catch (Exception e) {
//			System.out.println(e);
//		}
		
		try{
			FallingParticle f = new FallingParticle(5.2, 3.6);
			f.setH(-10); 
		}
		
		catch (Exception e) {			
			System.out.println(e);
		}

		
		
		
		
	}

}
