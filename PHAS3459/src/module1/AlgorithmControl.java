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
	
	public void timer(double a) {
		long timeNow = System.currentTimeMillis();
		boolean y;
		boolean x;
		x = true;
		y=true;
		while(x&&y) {
			long time = System.currentTimeMillis();
			if (x=time % timeNow != 10000) {
				a++;
			}
			else {
				System.out.println(time);
				a++;
			}
			
			
			
		}
	}

	public static void main(String[] args) {
		AlgorithmControl ac = new AlgorithmControl();
		
		//ac.loop(1, 10);
		//ac.increment(2.4, 8.8 , 0.20);
		//ac.decrement(2,  -12);
		ac.timer(1);
		

	}

}

