package com.collections;

import java.io.ObjectInputStream.GetField;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MapExample1 {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		// Adding elements to map
		map.put(1, "Amit");
		map.put(3, "Sayed");
		map.put(5, "Rahul");
		map.put(2, "Jai");
		map.put(6, "Amit");
		map.put(4, "Babu");
		//map.put(2, "Amit");
		// Traversing Map
		Set set = map.entrySet();
//	    Iterator it=set.iterator();
//	    
//	    while(it.hasNext()) {
//	    	Map.Entry entry=(Map.Entry)it.next();
//	    	System.out.println(entry.getKey()+" , "+entry.getValue());
//	    }
		System.out.println(map.keySet()+" "+map.values());
		traversingMap(map);
		
		System.out.println("---------------------------");
		
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		System.out.println("---------- Reverse Order by Key -----------------");
		
		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
		System.out.println("--------- Natural sorted order -----------");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.naturalOrder())).forEach(System.out::println);
		
		System.out.println("--------- Filter conditions ---------");
		map.entrySet().stream().filter( m -> m.getValue().startsWith("A")).forEach(System.out::println);
		System.out.println("------------- FIlter with Map object ----------------");
		Map<Integer,String> fileterMap=map.entrySet().stream().filter(m -> m.getKey() >= 4)
				.collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));
		traversingMap(fileterMap);
		
		System.out.println("------------- FIlter2 with Map object ----------------");
		Map<Integer,String> fileterMap1=map.entrySet().stream().filter(m -> m.getKey() <= 4)
				.collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
		traversingMap(fileterMap1);
	}

	private static void traversingMap(Map<Integer, String> map) {
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}
