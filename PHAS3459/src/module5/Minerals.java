package module5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Minerals {
	
	static HashMap<Integer, Double> Mass = new HashMap<Integer, Double>();
	static HashMap<Integer, String> Origin = new HashMap<Integer, String>();
	
	public static HashMap<Integer, Double> setMass(String urlName) throws IOException {
		URL u = new URL(urlName);
		InputStream is = u.openStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader b = new BufferedReader(isr);
		try(Scanner s = new Scanner(b);){
		while(s.hasNext()) {
			try {
			int i = s.nextInt();
			double m = s.nextDouble();
			Mass.put(i, m);
			}
			catch(Exception e) {}
		}
		}
		return Mass;
	}
	
	public static HashMap<Integer, String> setOrigin(String urlName) throws IOException {
		URL u = new URL(urlName);
		InputStream is = u.openStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader b = new BufferedReader(isr);
		try(Scanner s = new Scanner(b);){
		while(s.hasNext()) {
			try {
			String o = s.next();
			int i = s.nextInt();
			Origin.put(i, o);
			}
			catch(Exception e) {}
		}
		}
		return Origin;
	}

	public static void main(String[] args) {
		try {
			Mass = setMass("http://www.hep.ucl.ac.uk/undergrad/3459/data/module5/module5-samples.txt ");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			Origin = setOrigin("http://www.hep.ucl.ac.uk/undergrad/3459/data/module5/module5-locations.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(Mass);
		System.out.println(Origin);

	}

}
