package module1;

public class AlgorithmControl {
	
	//print integers between 1 and 10 in steps of 1
	public void loop() {
		int i;
		int imax = 10;
		for (i = 1; i <= imax ; i++) {
			System.out.println(i);
		}
	}
	
	//print integers between 5 and -12 in steps of -1
	public void decrement() {
		 boolean y; //while loop requires a boolean
		 float x = 6;
		 y = true;
		 //runs while y statement is true
		 while (y) {
			 x--;
			 y = x>-12 ;
			 System.out.print(x);
		 }
	}
	
	//print integers between 2.4 and 8.8 in steps of 0.2
	public void increment() {
		double i;
		for (i = 2.4 ; i <= 8.8 ;  i = i + 0.2)  {
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
		
		
		//total loops for 8 seconds in steps of 40000
		int totalloop1 = ac.timer(8000, 40000);
		//total loops for 8 seconds in steps of 1000
		int totalloop2 = ac.timer(8000, 1000);
		
		System.out.println("The total number of loops for steps of 40 000 and 1000 is "+ totalloop1 + " and " + totalloop2 +" respectively." );
		System.out.println("The value of the 40 000 steps is greater, this is because it needs to print the number of steps much less regularly than for 100 steps.");
		System.out.println("Having less steps to print allows it to spend more of the 8 seconds completing loops.");

	}

}

