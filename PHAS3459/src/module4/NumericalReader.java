package module4;

import java.io.*;
import java.net.*;
import java.util.Scanner;


public class NumericalReader {
	
	public NumericalReader() {
	}
	//initialise variables
	Double minValue;
	Double maxValue;
	Double nValues = 0.;
	Double sumOfValues = 0.;
	File outputfile;
	String dataFile;
	String saveFile;
	
	//method to take information from the keyboard
	public static String getStringFromKeyboard() throws Exception {
		//if no input throw exception
		if (System.in == null) {
			throw new Exception("Nothing was typed");
		}
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(r);
		System.out.println("Please type something");
		String s = b.readLine();
		return s;
	}
	
	//method to read data from a url 
	public BufferedReader brFromURL(String urlName) throws IOException {
		URL u = new URL(urlName);
		InputStream is = u.openStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader b = new BufferedReader(isr);
		return b;
	}
	
	//method to initialise files and variables 
	void analysisStart(String dataFile) throws IOException{
		File outputfile = new File(dataFile);
		Double minValue;
		Double maxValue;
		Double nValues;
		Double sumOfValues;
		}
	
	//method to analys the data in the file
	void analyseData(String line) throws IOException {
		Scanner scan = new Scanner(line);
		//initial min and max
		double b = scan.nextDouble();
		minValue = b;
		maxValue = b;
		//if the line start with a number - analyse
			if(Character.isDigit(line.charAt(0))) {
				try (
						FileWriter fw = new FileWriter(saveFile);
						BufferedWriter br = new BufferedWriter(fw);
						PrintWriter pw = new PrintWriter(br);){;
					//while there are still elements in the line continue analysis
					while (scan.hasNext()) {
						double a = scan.nextDouble();
						System.out.println (a);
						//if a is smaller than the min, a is the new min
						if (a < minValue) {
							minValue = a;
						}
						//if a is greater than the max, a is the new max
						else if(a>maxValue) {
							maxValue = a;
						}
						//increase n values by 1
						nValues++;
						//add integer to the sumOfValues
						sumOfValues = sumOfValues + a;
						//write new values to file
						pw.write(Double.toString(minValue));
						pw.write(Double.toString(maxValue));
						pw.write(Double.toString(nValues));
						pw.write(Double.toString(sumOfValues));
					}
				}
			}
			//if the line doesnt start with a number - do nothing
			else {
			}
	
		}


	//method to print file at the end of analysis
	void analysisEnd() throws IOException {
		FileReader fr = new FileReader(saveFile);
		BufferedReader br = new BufferedReader(fr);
		Scanner s = new Scanner(br);
		minValue = s.nextDouble();
		System.out.println("The minimum value is : "+minValue);
		s.next();
		maxValue = s.nextDouble();
		System.out.println("The maximum value is : "+maxValue);
		s.next();
		nValues = s.nextDouble();
		System.out.println("The total number of values is : "+nValues);
		s.next();
		sumOfValues = s.nextDouble();
		System.out.println("The sum of the values is : "+sumOfValues);
		
		

		
		 

	}
	

	public static void main(String[] args) {
		//initalise directory 
		String directory;
		//try to input directory
		try {
			directory = getStringFromKeyboard();
		}
		//catch exception if there is no input
		catch(Exception e) {
			directory = "System.getProperty(\"user.home\")";
			System.out.println(e);
		}
		NumericalReader nr = new NumericalReader();
		
		
		//try to create, analyse and print file for URL1
		try {
			BufferedReader br = nr.brFromURL("http://www.hep.ucl.ac.uk/undergrad/3459/data/module4/module4_data1.txt");
			String saveFile = (directory + File.separator + "Eclipse" + File.separator+"numberFromURL1.txt");
			String line = "";
			nr.analysisStart(saveFile);
			while ((line = br.readLine()) !=null){
				nr.analyseData(line);
			}
			nr.analysisEnd();
		}
		//catch exception if thrown
		catch(IOException e){
		}
		
		
		//try to create, analyse and print file for URL1
		try {
			BufferedReader br = nr.brFromURL("http://www.hep.ucl.ac.uk/undergrad/3459/data/module4/module4_data2.txt");
			String saveFile = (directory + File.separator + "Eclipse" + File.separator+"numberFromURL2.txt");
			String line = "";
			nr.analysisStart(saveFile);
			while ((line = br.readLine()) !=null){
				nr.analyseData(line);
			}
			nr.analysisEnd();
		}
		//catch exception if thrown
		catch(IOException e){
		}

}
}
