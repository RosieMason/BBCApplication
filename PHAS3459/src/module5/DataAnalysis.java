package module5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.util.*;

public class DataAnalysis {
	
	//initialize variables
	static ArrayList<Double> data = new ArrayList<Double>();
	static String datapoints = new String();
	
	//create an array of the data from a URL - throws an exception if nothing is entered
	public static ArrayList<Double> dataFromURL(String urlName) throws IOException {
		URL u = new URL(urlName);
		InputStream is = u.openStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader b = new BufferedReader(isr);
		try(Scanner s = new Scanner(b);){
			//run loop while s has a next value
			while(s.hasNext()) {
				String a = s.next();
				//change string to doubles
				try {
					double c = Double.parseDouble(a);
					data.add(c);
				}
				catch(Exception e) {}
			}
		return data;
		}
	}
	
	//method to calculate chi squared
	//sum of (y - y mean)^2 / (y error)^2
	public static double goodnessOfFit(int n, ArrayList<Double> dataPoints) {
		//set values for x, y, and ey
		ArrayList<Double> x =  DataPoint.setX(dataPoints);
		ArrayList<Double> y =  DataPoint.setY(dataPoints);
		ArrayList<Double> ey =  DataPoint.setEY(dataPoints);
		//initialize array for theoretical y
		ArrayList<Double> yTheory = new ArrayList<Double>();
		//set n
		Theory.setN(n);
		int i = 0;
		//calculate theoretical y for each x
		for(i=0 ;i < x.size(); i++) {
			double a = Theory.calculateY(x.get(i));
			yTheory.add(a);
		}
		double chiSquared = 0;
		//calculate values for chi squared and add them together
		for(i=0; i< y.size(); i++) {
			double b = ((y.get(i) - yTheory.get(i)) * (y.get(i) - yTheory.get(i))) / (ey.get(i) * ey.get(i));
			chiSquared += b;
		}
		return chiSquared;
	}

	public static void main(String[] args) {
		//initialize variable for the points
		ArrayList<Double> points = new ArrayList<Double>();
		try {
			//set the data points from a URL
			points =dataFromURL("http://www.hep.ucl.ac.uk/undergrad/3459/data/module5/module5-xy.txt");
		}
		catch(IOException e) {
			System.out.println("error");
		}
		//calucate chi squared for n = 2
		double nTwo = goodnessOfFit(2, points);
		System.out.println("The chiSquared for n = 2 is: "+nTwo);
		//calculate chi squared for n = 4
		double nFour = goodnessOfFit(4, points);
		System.out.println("The chiSquared for n = 4 is: "+nFour);
		System.out.println("The value for n = 4 should be 2.7E9, the code shows double this");
		System.out.println("For the chi squared test the lower the value the better the line fits the data");
		System.out.println("This means that the line for y^2 fits the data better");
	}
}


