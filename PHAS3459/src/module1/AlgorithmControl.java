package module1;

public class AlgorithmControl {
	
	//print integers between a and b in steps of 1
	public void loop(int a, int b) {
		int i;
		int imax = b;
		for (i = a; i <= imax ; i++) {
			System.out.println(i);
		}
	}
	
	//print integers between a and b in steps of -1
	public void decrement(int a, int b) {
		 boolean y; //while loop requires a boolean
		 float x = a;
		 y = true;
		 //runs while y statement is true
		 while (y) {
			 x--;
			 y = x>b ;
			 System.out.print(x);
		 }
	}
	
	//print integers between a and b in steps of c
	public void increment(double a, double b, double c) {
		double i;
		for (i = a ; i <= b ;  i = i + c)  {
			System.out.println(i);
		}
		
	}
	
	//timer to record for c milliseconds in d intervals
	public int timer(int c, int d) {
		long timeNow = System.currentTimeMillis(); //time at start of loop
		int a = 0;
		boolean x;
		long time = 0;//initialise time
		x = true;
		while(x) {
			time = System.currentTimeMillis();//updated time
			x=time % timeNow < c; //runs until the remainder is the total time 
			//prints every 'd' steps
			if (a % d == 0) { //when remainder is zero - print & increase a
				System.out.println(a);
				a=a+1;
			}
			else { //when remainder isnt zero - increase a
				a=a+1;
			}
		}
		return (a);//statement returns the total number of steps
	}

	public static void main(String[] args) {
		AlgorithmControl ac = new AlgorithmControl();
		
		ac.loop(1, 10);//integers 1 to 10
		ac.increment(2.4, 8.8 , 0.20); //numbers 2.4 to 8.8 in steps of 0.2
		ac.decrement(2,  -12);//integers 2 to -12
		
		//total loops for 8 seconds in steps of 40000
		int totalloop1 = ac.timer(8000, 40000);
		//total loops for 8 seconds in steps of 1000
		int totalloop2 = ac.timer(8000, 1000);
		
		System.out.println("the total number of loops for steps of 40 000 and 1000 9s "+ totalloop1 + " and " + totalloop2 +"respectively" );
		

	}

}

