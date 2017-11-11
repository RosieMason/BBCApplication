package module5;

import java.util.*;

public class DataPoint {
	
	static ArrayList x = new ArrayList();
	static ArrayList y = new ArrayList<Double>();
	static ArrayList ey = new ArrayList();
	
	
	public static ArrayList setX(ArrayList data) {
		int i = 0;
		while (i < data.size()){
				x.add(data.get(i));
				i = i + 3;
			}
			return x;
		}
	
	ArrayList  getX() {
		return x;
	}
	
	
	public static ArrayList setY(ArrayList data) {
		int i = 1;
		while (i < data.size()){
				y.add(data.get(i));
				i = i + 3;
			}
			return y;
		}
	
	ArrayList  getY() {
		return y;
	}
	
	public static ArrayList setEY(ArrayList data) {
		int i = 2;
		while (i < data.size()){
				ey.add(data.get(i));
				i = i + 3;
			}
			return ey;
		}
	
	ArrayList  getEY() {
		return ey;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
