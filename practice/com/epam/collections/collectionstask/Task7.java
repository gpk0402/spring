package com.epam.collections.collectionstask;


import java.util.*;
import java.util.Map.*;

public class Task7 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, Employee> employeesMap = new TreeMap<>();
		employeesMap.put(100,new Employee(2,"Sara Tancredi"));
		employeesMap.put(300,new Employee(4,"Paul Niksui"));
		employeesMap.put(523,new Employee(4,"Manu Sharma"));
		employeesMap.put(168,new Employee(10,"Micheal"));
		
		//System.out.println(employeesMap);
		Set<Entry<Integer, Employee>> entrySet= employeesMap.entrySet();
		
		List<Entry<Integer, Employee>> entryList = new ArrayList<>(entrySet);
		
		Collections.sort(entryList,new Comparator<Entry<Integer,Employee>>(){
			@Override
			public int compare(Entry<Integer, Employee> o1, Entry<Integer, Employee> o2) {
				// TODO Auto-generated method stub
				return o2.getValue().getName().compareTo(o1.getValue().getName());
			}
		});
		System.out.println(entryList);
		// Collections.sort(entryList,(o1,o2)-> o2.getValue().getName().compareTo(o1.getValue().getName()));
	}
}
