package module5;

import java.util.*;

public class DataPoint {
	
	//initialize variables
	static ArrayList<Double> x = new ArrayList<Double>();
	static ArrayList<Double> y = new ArrayList<Double>();
	static ArrayList<Double> ey = new ArrayList<Double>();
	
	//create an x array
	public static ArrayList<Double> setX(ArrayList<Double> data) {
		int i = 0;
		//take every 3rd element of the sort starting at 0
		while (i < data.size()){
				x.add(data.get(i));
				i = i + 3;
			}
			return x;
		}
	
	//method to get the x array
	static ArrayList<Double>  getX() {
		return x;
	}
	
	//create a y array
	public static ArrayList<Double> setY(ArrayList<Double> data) {
		int i = 1;
		//take every 3rd element of the sort starting at 1
		while (i < data.size()){
				y.add(data.get(i));
				i = i + 3;
			}
			return y;
		}
	
	//method to get the y array
	static ArrayList<Double>  getY() {
		return y;
	}
	
	//take every 3rd element of the sort starting at 2
	public static ArrayList<Double> setEY(ArrayList<Double> data) {
		int i = 2;
		while (i < data.size()){
				ey.add(data.get(i));
				i = i + 3;
			}
			return ey;
		}
	
	//method to get the ey array
	static ArrayList<Double>  getEY() {
		return ey;
	}


}
