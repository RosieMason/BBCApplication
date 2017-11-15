package module5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.util.*;

public class Minerals {
	
	//initialize variables
	static HashMap<Integer, Double> Mass = new HashMap<Integer, Double>();
	static HashMap<Integer, String> Origin = new HashMap<Integer, String>();
	
	//set the values of the Mass HashMap from a URL
	public static HashMap<Integer, Double> setMass(String urlName) throws IOException {
		URL u = new URL(urlName);
		InputStream is = u.openStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader b = new BufferedReader(isr);
		try(Scanner s = new Scanner(b);){
			//run loop while the scanner has another value
			while(s.hasNext()) {
				try {
					//find the identity integer
					int identity = s.nextInt();
					//find the mass double
					double mass = s.nextDouble();
					//add mass and identity to Mass HashMap
					Mass.put(identity, mass);
				}
				catch(Exception e) {}
			}
		}
		return Mass;
	}
	
	//set the values of the Origin HashMap from a URL
	public static HashMap<Integer, String> setOrigin(String urlName) throws IOException {
		URL u = new URL(urlName);
		InputStream is = u.openStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader b = new BufferedReader(isr);
		try(Scanner s = new Scanner(b);){
			//run loop while the scanner has another value
			while(s.hasNext()) {
				try {
					//find the next string
					String origin = s.next();
					//find the identity integer
					int identity = s.nextInt();
					//add origin and identity to the Origin HashMap
					Origin.put(identity, origin);
				}
				catch(Exception e) {}
			}
		}
		return Origin;
	}

	public static void main(String[] args) {
		//Set the Mass HashMap
		try {
			Mass = setMass("http://www.hep.ucl.ac.uk/undergrad/3459/data/module5/module5-samples.txt ");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Set the Origin HashMap
		try {
			Origin = setOrigin("http://www.hep.ucl.ac.uk/undergrad/3459/data/module5/module5-locations.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}

		//find the maximum Mass
		 double maxMass = Collections.max(Mass.values());
		 //convert max to string in order to find corresponding identity
		 String max = Double.toString(maxMass);
		 //initialize integer
		 int mineralmax = 0;
		 //change HashMap to Map to find the Key from a Value
		 for (Map.Entry<Integer,Double> e : Mass.entrySet()) {
			 Integer key = e.getKey();
			 Object value = e.getValue();
			 if ((value.toString()).equals(max)) {
			 mineralmax = key;
			 }
		 }
		 //find the origin of the max
		 String origin = Origin.get(mineralmax);
		 System.out.println("The mineral with the largest mass is "+mineralmax+" with mass "+maxMass+", it is found in "+origin);
		 
		 //find the minimum mass
		 double minMass = Collections.min(Mass.values());
		 //convert min to string in order to find the corresponding identity
		 String min = Double.toString(minMass);
		 //initlaize integer
		 int mineralmin = 0;
		 //change HashMap to Map to find the Key from a Value
		 for (Map.Entry<Integer,Double> e : Mass.entrySet()) {
			 Integer key = e.getKey();
			 Object value = e.getValue();
			 if ((value.toString()).equals(min)) {
			 mineralmin = key;
			 }
		 }
		 //find the origin of the min
		 String originmin = Origin.get(mineralmin);
		 System.out.println("The mineral with the smallest mass is "+mineralmin+" with mass "+minMass+", it is found in "+originmin);


	}

}
