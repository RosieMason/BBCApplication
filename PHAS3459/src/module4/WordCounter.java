package module4;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class WordCounter {
	
	//method to read from a URL
	public static BufferedReader brFromURL (String urlName) throws IOException {
		URL u = new URL(urlName);
		InputStream is = u.openStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader b = new BufferedReader(isr);
		return b;
	}
	
	//method to read from a file
	public static BufferedReader brFromFile(String fileName) throws IOException {
		FileReader fr = new FileReader(fileName) ; 
		BufferedReader b = new BufferedReader(fr) ;
		return b;
	}
	
	//method to count words in a resource
	public static int countWordsInResource(BufferedReader dataAsBR) throws IOException{
		//try to scan resource - trows exception if no resource
		try (
			Scanner s = new Scanner(dataAsBR);
		){
			int sum = 0 ; //initialise sum
			//while the scanner has more to scan add one to sum
			while (s.hasNext()){
				s.next();
				sum++;
			}
			return sum;
		}
	}

	public static void main(String[] args) {
		//test out word counter
		try {
			BufferedReader b = brFromURL("http://www.hep.ucl.ac.uk/undergrad/3459/data/module5/module5-xy.txt");
			int words = countWordsInResource(b);
			System.out.println("The total number of words is "+words);
		}
		//catch exceptions
		catch(IOException e) {
		}
		
		

	}

}
