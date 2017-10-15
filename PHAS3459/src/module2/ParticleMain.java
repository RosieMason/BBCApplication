package module2;

public class ParticleMain {

	public static void main(String[] args) {
		
		//define a particle 
		FallingParticle f = new FallingParticle(5.2, 3.6);
		//set the height to 10
		f.setH(10); 
		
		//print out the values of t for varying timesteps
		f.drop(0.5);
		System.out.println("The time it takes for the particle to reach the floor with timesteps of 0.5 s is " +f.getT());
		f.drop(0.1);
		System.out.println("The time it takes for the particle to reach the floor with timesteps of 0.1 s is " +f.getT());
		f.drop(0.01);
		System.out.println("The time it takes for the particle to reach the floor with timesteps of 0.01 s is " +f.getT());
		f.drop(0.001);
		System.out.println("The time it takes for the particle to reach the floor with timesteps of 0.001 s is " +f.getT());
		f.drop(0.0001);
		System.out.println("The time it takes for the particle to reach the floor with timesteps of 0.0001 s is " +f.getT());
		System.out.println("These numbers vary depending on the timestep.");
		System.out.println("For 0.5s, by the time it has reached 1.5s it will be 'below the floor hence the counter stops at 0.5s");
		System.out.println("For the rest of the steps the same principle applies giving us the time to the closest interval specified");
	}

}
