package com.epam.collections.collectionstask;

import java.util.*;

// Second largest number in the given list
public class Task1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbersList = new ArrayList<>();
		numbersList.add(5);
		numbersList.add(2);
		numbersList.add(7);
		numbersList.add(15);
		numbersList.add(12);
		numbersList.add(1);
		numbersList.add(6);
		numbersList.add(3);
		numbersList.add(4);
		Set<Integer> numbersSet = new HashSet<Integer>(numbersList);
		numbersList = new ArrayList<>(numbersSet);
		Collections.sort(numbersList);
		int secondLargest = numbersList.get(numbersList.size()-2);
		System.out.println("Second largest number in the list is: "+secondLargest);
		
	}
}
