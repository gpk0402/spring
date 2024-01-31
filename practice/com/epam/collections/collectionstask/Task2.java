package com.epam.collections.collectionstask;


import java.util.*;

// Sorting numbers in descending order using comparator interface
public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparator<Integer> reverseSort = new ReverseSortNumbers();
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
		Collections.sort(numbersList,reverseSort);
		System.out.println(numbersList);

	}

}
