package module1;

public class AlgorithmControl {
	
	public void loop(int a, int b) {
		int i;
		int imax = b;
		for (i = a; i <= imax ; i++) {
			System.out.println(i);
		}
	}
	
	public void decrement(int a, int b) {
		 boolean y;
		 float x = a;
		 y = true;
		 
		 while (y) {
			 x--;
			 y = x>b ;
			 System.out.print(x);
		 }
	}
	
	public void increment(double a, double b, double c) {
		double i;
		for (i = a ; i <= b ;  i = i + c)  {
			System.out.println(i);
		}
		
	}
	
	public void timer() {
		long timeNow = System.currentTimeMillis();
		//int a =1;
		boolean x;
		long time = 0;
		x = true;
		while(x) {
			time = System.currentTimeMillis();
			x=time % timeNow != 10000;
				//a++;
		}
		System.out.println(time);
			
			

	}

	public static void main(String[] args) {
		AlgorithmControl ac = new AlgorithmControl();
		
		//ac.loop(1, 10);
		//ac.increment(2.4, 8.8 , 0.20);
		//ac.decrement(2,  -12);
		ac.timer();
		

	}

}

