package module1;

public class DataTypes {

	public static void main(String[] args) {
		
		//assign the value 10 to different variables
		double doubVar = 10.0;
		System.out.println("The value of doubVar is "+doubVar);
		float floatVar = 10;
		System.out.println("The value of floatVar is "+floatVar);
		System.out.println("when printed the float 10 becomes 10.0");
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

		//Investigating mixing types of variable
		
		/*characters:*/ char charVar='c' + 10;
		System.out.println("The value of 'c' + 10 is "+charVar);
		System.out.println("This has an outcome of m as 'char' works by assigning different characters, different values.");
		System.out.println("This tells us that the character m is assigned a number 10 higher than the character c.");

		//Above the value 10 represents an addition of character numbers instead of an integer
		//But what happens if we set 10 to be an integer:
		int n = 10;
		//The following equation produces an error:
		//char charVar1 = 'c' + n;
		//character variables cannot be used in conjunction with any other type of variable.
		
		//Combining integers and doubles:
		int a = 3;
		double b = 4.5;
		double ab = a + b;
		System.out.println("When combining an integer, 3, and double, 4.5, we get "+ab);
		System.out.println("Note that when combining 3 and 4.5 the variable needs to be defined as a double.");
		//this is because integer values cannot be combined with double variables

		
		//The line below will not work: all variables must have a value 
		// int j = 1; int i; j=i+1; 

		double d = 4.99;
		int in = (int) d;
		System.out.println("The outcome of converting the double 4.99 to an integer is: "+in+".");
		System.out.println("Note that the value 4.99 has not been rounded to the apprpriate value 5.");
		System.out.println("It simply prints out the given value with no decimal places");

		 

	}

}
