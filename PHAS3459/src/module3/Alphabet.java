package module3;

import java.util.Random;
import java.lang.Character;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.lang.Math;

public class Alphabet {
	
	public static char randomCharacter() {
		Random n = new Random();
		int i = n.nextInt(127)+0;
		char c =(char) i;
		return c;
	}
	

	public static void main(String[] args) throws Exception {
		int i;
		StringBuilder s = new StringBuilder();
		int total = 0;
		int exceptions = 0;
		for (i = 0; i<250; i++) {
			char c = randomCharacter();
			if (Character.isLetter(c) || Character.isDigit(c)) {
				s.append(c);
				if (Character.isLetter(c)) {
					throw new Exception ("c is a Letter so cannot convert to interger");
				}
				try{
					total = total + Integer.parseInt(Character.toString(c));
				}
				catch (Exception e) {
					exceptions++;
				}
			}
			else {
			}
		}
		System.out.println("The total is " + total);
	}
	
}
		
