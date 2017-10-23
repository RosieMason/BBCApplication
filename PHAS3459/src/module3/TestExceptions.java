package module3;

public class TestExceptions {

	public static void main(String[] args) { 
		//define 2 complex numbers :  0 + 0 i and 1 + 2i
		Complex c1 = Complex.ZERO;
		Complex c2 = new Complex(1, 2);
		
		//try to normalise zero complex number
		try {
			 Complex c = c1.normalised();
			 System.out.println(c);
		}
		//catch the exception if thrown
		catch (Exception e) {
		System.out.println(e);
		}
		
		//try to divide be zero complex number 
		try {
			 Complex c = Complex.divide(c2, c1);
			 System.out.println(c);
		}
		//catch the exception if thrown
		catch (Exception e) {
			System.out.println(e);
		}
		
		//define two three vectors : (0, 0, 0) and (2, 4, 1)
		ThreeVector v1 = new ThreeVector(0, 0, 0);
		ThreeVector v2 = new ThreeVector(2, 4, 1);
		
		//try to calculate the unit vector of (0, 0, 0)
		try {
			ThreeVector t = v1.unitVector();
			System.out.println(t);
		}
		//catch the exception if thrown
		catch (Exception e) {
			System.out.println(e);
		}
		
		//try to calculate the angle between (0, 0, 0) and (2, 4, 1)
		try {
			double a = v2.angle(v1);
			System.out.println(a);
		}
		//catch the exception if thrown
		catch (Exception e) {
			System.out.println(e);
		}
		
		
		//try to set a negative mass for the falling particle
		try{
			FallingParticle f = new FallingParticle(-2.0, 3.6);
			System.out.println(f);
		}
		//catch the exception if thrown
		catch (Exception e) {
			System.out.println(e);
		}
		
		//try to set a negative drag coefficient for the falling particle 
		try{
			FallingParticle f = new FallingParticle(2.0, -3.6);
			System.out.println(f);
		}
		//catch the exception if thrown
		catch (Exception e) {
			System.out.println(e);
		}
		
		//try to set a negative initial height for the falling particle 
		try{
			FallingParticle f = new FallingParticle(5.2, 3.6);
			f.setH(-10); 
		}
		//catch the exception if thrown
		catch (Exception e) {			
		System.out.println(e);
		}
		
		//try to set a negative timestep for the falling particle method doTimeStep
		try {
			FallingParticle f = new FallingParticle(5.2, 3.6);
			f.doTimeStep(-2.0);
		}
		//catch the exception if thrown
		catch (Exception e) {			
			System.out.println(e);
		}
		
		//try to set a negative timestep for the falling particle method drop
		try {
			FallingParticle f = new FallingParticle(5.2, 3.6);
			f.drop(-2.0);
		}
		//catch the exception if thrown
		catch (Exception e) {			
			System.out.println(e);
		}
		
		

		

		
		
		
		
	}

}
