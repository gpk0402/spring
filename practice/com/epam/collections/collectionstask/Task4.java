package com.epam.collections.collectionstask;


import java.util.*;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> numbersSet = new TreeSet<>(new ReverseSortNumbers());
		numbersSet.add(5);
		numbersSet.add(2);
		numbersSet.add(7);
		numbersSet.add(15);
		numbersSet.add(12);
		numbersSet.add(1);
		numbersSet.add(6);
		numbersSet.add(3);
		numbersSet.add(1);

		System.out.println(numbersSet);

	}

}
