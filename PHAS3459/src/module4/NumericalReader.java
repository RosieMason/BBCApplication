package module4;

import java.io.*;
import java.net.*;
import java.util.Scanner;


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
	
	public BufferedReader brFromURL(String urlName) throws IOException {
		URL u = new URL(urlName);
		InputStream is = u.openStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader b = new BufferedReader(isr);
		return b;
	}
	
	void analysisStart(String dataFile) throws IOException{
		double minValue;
		double maxValue;
		double nValues;
		double sunOfValues;
		File datafile= new File(dataFile);
		}
	
	void analyseData(String line) {
		Scanner s = new Scanner(line);
		
	}

	public static void main(String[] args) {

	}

}
