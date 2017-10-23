package module4;

import java.io.*;
import java.net.*;

public class NumericalReader {
	
	public NumericalReader() {
	}
	
	public static String getStringFromKeyboard() {
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(r);
		System.out.println("Please type something");
		String typed = null;
		try {
			String s = b.readLine();
			typed = s;

		 }
		 catch (IOException e) {
		 }
		return typed;
	}

	public static void main(String[] args) {

	}

}
