package com.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicateElements {

	public static void main(String[] args) {

		List<String> words = Arrays.asList("one", "two", "three", "four", "one","two");
		Map<String, Integer> map = new HashMap<>();

		for (String s : words) {
			int count =1;
			if (map.containsKey(s)) {
				map.put(s, ++count);
			} else {
				map.put(s, 1);
			}
		}

		System.out.println(map);
		Map<String, Integer> filterMap =map.entrySet().stream().filter(m -> m.getValue()!=2).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
		System.out.println(filterMap);
	}

}
