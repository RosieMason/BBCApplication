package module2;

public class ParticleMain {

	public static void main(String[] args) {
		
		FallingParticle f = new FallingParticle(5.2, 3.6);
		//f.setH(10); 
		
		
		f.drop(0.5);
		System.out.println(f.getT());
		
		f.drop(0.1);
		System.out.println(f.getT());

		f.drop(0.01);
		System.out.println(f.getT());
		
		f.drop(0.001);
		System.out.println(f.getT());
		
		f.drop(0.0001);
		System.out.println(f.getT());
	}

}
