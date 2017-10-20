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
	

	public static void main(String[] args) {
		int i;
		for (i = 1; i<=250; i++) {
			char c = randomCharacter();
			System.out.println(c);
		}
	}

}
