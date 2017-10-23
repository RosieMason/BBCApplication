package module3;

//import Random function
import java.util.Random;

public class Alphabet {
	
	//method to generate a random character
	public static char randomCharacter() {
		Random n = new Random();
		//generate a random integer between 0 and 127
		int i = n.nextInt(127)+0;
		//convert the integer to a character
		char c =(char) i;
		return c;
	}
	

	public static void main(String[] args) {
		//initialise variables
		int i;
		StringBuilder s = new StringBuilder();
		int total = 0;
		int exceptions = 0;
		//loop to run randomCharacter 250 times
		for (i = 0; i<250; i++) {
			char c = randomCharacter();
			//create a String Builder if c is a digit or letter
			if (Character.isLetter(c) || Character.isDigit(c)) {
				s.append(c);
				//try to sum up all the integers in the string
				//Integer.parseInt throws exception if c is a letter
				try{
					total = total + Integer.parseInt(Character.toString(c));
				}
				//catch exception - add 1 to the total number of exceptions			
				catch (Exception e) {
					exceptions++;
					
				}
			}

		}
		System.out.println("The StringBuilder array of Letter and digits is:");
		System.out.println( s);
		System.out.println("the length of this is " +s.length());
		System.out.println("The sum of all the numbers  is " + total + ", the total number of exceptions is "+exceptions);
	}
	
}
		
