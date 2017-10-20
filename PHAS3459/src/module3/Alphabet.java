package module3;

import java.util.Random;

public class Alphabet {
	
	public static char randomCharacter(){
		Random n = new Random();
		int i = n.nextInt(127)+0;
		char c =(char) i;
		return c;
	}
	

	public static void main(String[] args) {
		int i;
		StringBuilder s = new StringBuilder();
		int total = 0;
		int exceptions = 0;
		for (i = 0; i<250; i++) {
			char c = randomCharacter();
			if (Character.isLetter(c) || Character.isDigit(c)) {
				s.append(c);
				try{
					total = total + Integer.parseInt(Character.toString(c));
				}
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
		
