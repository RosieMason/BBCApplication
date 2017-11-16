package PastPaper2013MidTerm;

import java.util.*;

public class EventStart {
	
	private int nTracks;
	private String triggerID;
	
	public EventStart(int nTracks, String triggerID) {
		this.nTracks = nTracks;
		this.triggerID = triggerID;
	}
	
	public int getNTracks() {
		return nTracks;
	}
	
	public String getTiggerID() {
		return triggerID;
	}
	
	public String toString() {
		String start = "There are "+nTracks+" particle tracks in the event, the trigger ID is: "+triggerID;
		return start;
	}
	public static EventStart FromString(String line) throws Exception{
		
		Scanner s = new Scanner(line);
		
		s.next();
		int nTracks = s.nextInt();
		String triggerID = s.next();
		
		s.close();
		
		return new EventStart(nTracks, triggerID);
	}

}
