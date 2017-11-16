package PastPaper2013MidTerm;

import java.io.*;
import java.net.*;
import java.util.*;

public class MidTermExam {
	
	public static ArrayList<EventStart> setEventStartfromURL(String url) throws Exception{
		
		URL u = new URL(url);
		InputStream is = u.openStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader b = new BufferedReader(isr);
		
		String line;
		ArrayList<EventStart> start = new ArrayList<EventStart>();
		
		while((line = b.readLine()) != null) {
			try {
				EventStart es = EventStart.FromString(line);
				start.add(es);
			}
			catch(RuntimeException e) {
			}
		}
		return start;		
	}
	
	public static ArrayList<EventsData> setEventDatafromURL(String url) throws Exception{
		
		URL u = new URL(url);
		InputStream is = u.openStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader b = new BufferedReader(isr);
		
		String line;
		ArrayList<EventsData> data = new ArrayList<EventsData>();
		
		while((line = b.readLine()) != null) {
			int i = 0;
			try {
				EventsData ed = EventsData.FromString(line);
				data.add(ed);
			}
			catch(RuntimeException e) {
				data.add(null);
			}
		}
		return data;
	}

	public static void main(String[] args) {
		ArrayList<EventStart> start = new ArrayList<EventStart>();
		ArrayList<EventsData> data = new ArrayList<EventsData>();
		try{
			start = setEventStartfromURL("http://www.hep.ucl.ac.uk/undergrad/3459/exam_data/2013-14/particles.txt");
		}
		catch(Exception e) {
		}
		try {
			data = setEventDatafromURL("http://www.hep.ucl.ac.uk/undergrad/3459/exam_data/2013-14/particles.txt");
		}
		catch(Exception e) {
		}
//		System.out.println(start);
//		System.out.println(data);
		int pairs = 0;
		int charge;
		ArrayList<Integer> charges = new ArrayList<Integer>();

		for(EventsData ed : data) {
				if(ed == null) {
					charge = 0;
					pairs = 0;

				}
				else if(ed!=null) {
					charge = ed.getCharge();
					if(charge == 1) {						
					}
					System.out.println(charge);
				}
			}
		}
			
		

	}

