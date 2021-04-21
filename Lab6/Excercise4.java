package Lab6;

import java.util.*;

public class Excercise4 {
public static HashMap getStudents(HashMap<String, Integer> hmap) {
		
		HashMap<String, String> map = new HashMap<>();
		
		for (Map.Entry e : hmap.entrySet()) {
			
			int m = (int)e.getValue();
           
			if(m > 69 && m < 80) {
				
            	map.put((String)e.getKey(), "Bronze MEDAL");
            
			} else if(m > 79 && m < 90) {
            	map.put((String)e.getKey(), "Silver MEDAL");
            
			} else {
            	if(m > 89 && m < 101) {
            		map.put((String)e.getKey(), "Gold MEDAL");
            	}
            }
		}
		
		return map;
	}
	
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
	    map.put("A", 65);
	    map.put("B", 95);
	    map.put("C", 82);
	    map.put("D", 76);
	    System.out.println(getStudents(map));
	}
}