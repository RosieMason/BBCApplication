package module5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.util.*;

public class DataPoint {
	
	static ArrayList<Double> x = new ArrayList<Double>();
	static ArrayList<Double> y = new ArrayList<Double>();
	static ArrayList<Double> ey = new ArrayList<Double>();
	
	public static BufferedReader brFromURL (String urlName) throws IOException {
		URL u = new URL(urlName);
		InputStream is = u.openStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader b = new BufferedReader(isr);
		return b;
	}
	
	public static ArrayList setX(BufferedReader dataAsBR) throws IOException{
		try (
			Scanner s = new Scanner(dataAsBR);
		){
			while (s.hasNextLine()){
				x.add(s.nextDouble());
				s.nextLine();
			}
			return x;
		}
	}
	
	ArrayList  getX() {
		return x;
	}
	
	
	public static ArrayList setY(BufferedReader dataAsBR) throws IOException{
		try (
			Scanner s = new Scanner(dataAsBR);
		){
			while (s.hasNextLine()){
				s.next();
				y.add(s.nextDouble());
				s.nextLine();
			}
			return y;
		}
	}
	
	ArrayList  getY() {
		return y;
	}
	
	
	public static ArrayList setEY(BufferedReader dataAsBR) throws IOException{
		try (
			Scanner s = new Scanner(dataAsBR);
		){
			while (s.hasNextLine()){
				s.next();
				s.next();
				ey.add(s.nextDouble());
				s.nextLine();
			}
			return ey;
		}
	}
	
	ArrayList  getEY() {
		return ey;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
