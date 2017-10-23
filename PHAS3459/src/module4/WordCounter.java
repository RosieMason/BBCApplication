package module4;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class WordCounter {
	
	public static BufferedReader brFromURL (String urlName) throws IOException {
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
	
	public static int countWordsInResource(BufferedReader dataAsBR) throws IOException{
		try (
			Scanner s = new Scanner(dataAsBR) ;
		){
			int sum = 0 ;
			while (s.hasNext()){
				s.next();
				sum++;
			}
			s.close();
			return sum;
		}
	}

	public static void main(String[] args) {
		try {
			BufferedReader b = brFromURL("http://www.hep.ucl.ac.uk/undergrad/3459/data/module4/module4_text.txt");
			int words = countWordsInResource(b);
			System.out.println("The total number of words is "+words);
		}
		catch(IOException e) {
		}
		
		

	}

}
