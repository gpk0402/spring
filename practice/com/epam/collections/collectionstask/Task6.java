package com.epam.collections.collectionstask;

import java.util.*;
import java.util.Map.Entry;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> numbersMap = new HashMap<>();
		numbersMap.put("A", 67);
		numbersMap.put("B", 21);
		numbersMap.put("C", 43);
		numbersMap.put("D", 22);
		numbersMap.put("E", 8);
		numbersMap.put("F", 43);
		
		Set<Entry<String,Integer>> entrySet = numbersMap.entrySet();
		List<Entry<String,Integer>> entryList = new ArrayList<>(entrySet);
		Collections.sort(entryList,new Comparator<Entry<String,Integer>>(){
			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o2.getValue().compareTo(o1.getValue());
			}
		});
		System.out.println(entryList);
		
		

	}

}
