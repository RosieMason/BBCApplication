package module1;

public class DataTypes {

	public static void main(String[] args) {
		
		//assign the value 10 to different variables
		double doubVar = 10.0;
		System.out.println("The value of doubVar is "+doubVar);
		float floatVar = 10;
		System.out.println("The value of floatVar is "+floatVar);
		//when printed the float 10 becomes 10.0
		int intVar = 10;
		System.out.println("The value of inVar is "+intVar);
		long longVar = 10;
		System.out.println("The Value of longVar is "+longVar);
		byte byteVar = 10;
		System.out.println("The value of byteVar is "+byteVar);

		//multiply the variables by themselves
		System.out.println("The value of doubVar multiplied by itself is "+(doubVar*doubVar));
		System.out.println("The value of floatVar multiplied by itself is "+(floatVar*floatVar));
		System.out.println("The value of intVar multiplied by itself is "+(intVar*intVar));
		System.out.println("The value of longVar multiplied by itself is "+(longVar*longVar));
		System.out.println("The value of byteVar multiplied by itself is "+(byteVar*byteVar));

		//Investigating mixing types of variable'
		
		/*characters:*/ char charVar='c' + 10;
		System.out.println("The value of 'c' + 10 is "+charVar);
		System.out.println("This has an outcome of m as 'char' works by assigning different characters numbers.");
		System.out.println("This tells us that the character m is assigned a number 10 higher than the character c.");

		//CONTINUE INVESTIGATING
		//int by = intVar * 1000000000000000;
		//System.out.println("The value of a byte value of 10 - 200 is : "+by);

		//The line below will not work: all variables must have a value 
		// int j = 1; int i; j=i+1; 

		double d = 4.99;
		int in = (int) d;
		System.out.println("The outcome of converting the double 4.99 to an integer is: "+in+".");
		System.out.println("Note that the value 4.99 has not been rounded to the apprpriate value 5");


		  
		  
		  
		 

	}

}
