package module4;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class WordCounter {
	
	public static BufferedReader brfromURL (String urlName) throws IOException {
		URL u = new URL(urlName);
		InputStream is = u.openStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader b = new BufferedReader(isr);
		return b;
	}
	
	public static BufferedReader brFromFile(String fileName) throws IOException {
		FileReader fr = new FileReader(fileName) ; 
		BufferedReader b = new BufferedReader(fr) ;
		return b;
	}
	
//	public static int countWordsInResource(BufferedReader dataAsBR) {
//		Scanner s = new Scanner(dataAsBR);
//		double sum = 0 ;
//		while (s.hasNext()) {
//			String token = s.next();
//			if(Char.parseChar(token)){
//				
//			}
//		}
//		
//	}

	public static void main(String[] args) {

	}

}
