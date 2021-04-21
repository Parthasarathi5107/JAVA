package Lab6;

import java.util.*;

public class Excercise1 {
	
	@SuppressWarnings("unchecked")
	public static List sortByValue(HashMap<String, Integer> map) {
			 
		List list = new LinkedList(map.entrySet());
		      
		        Collections.sort(list, new Comparator() {
		             public int compare(Object obj1, Object obj2) {
		                return ((Comparable) ((Map.Entry) (obj1)).getValue()).compareTo(((Map.Entry) (obj2)).getValue());
		             }
		        });
				return list;
			
		}

		public static void main(String[] args) {
			
			HashMap<String, Integer> map = new HashMap<>();

	        map.put("X", 33);
	        map.put("Y", 98);
	        map.put("Z", 20);
	        
	        List<?> list = sortByValue(map);
	        System.out.println(list);
	        
		}
}

