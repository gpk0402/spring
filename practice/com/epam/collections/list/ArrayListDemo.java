package com.epam.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Create an ArrayList
        List<String> arrayList = new ArrayList<>();
        List<Integer> ar1 = new ArrayList<>();
        ar1.addAll(Arrays.asList(10,2,3,4));
        ar1.remove(Integer.valueOf(10));
        ar1.remove(Integer.parseInt("1"));

        // Adding elements to the ArrayList
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Date");

        // Displaying the ArrayList
        System.out.println("Initial ArrayList: " + arrayList);

        // Adding an element at a specific index
        arrayList.add(2, "Grape");
        System.out.println("After adding Grape at index 2: " + arrayList);

        // Accessing elements by index
        System.out.println("Element at index 3: " + arrayList.get(3));

        // Updating an element
        arrayList.set(1, "Blueberry");
        System.out.println("After updating element at index 1: " + arrayList);

        // Removing an element by value
        arrayList.remove("Cherry");
        System.out.println("After removing Cherry: " + arrayList);

        // Removing an element by index
        arrayList.remove(0);
        System.out.println("After removing element at index 0: " + arrayList);

        // Checking if an element exists
        System.out.println("Contains Banana? " + arrayList.contains("Banana"));
        System.out.println("Contains Orange? " + arrayList.contains("Orange"));

        // Getting the size of the ArrayList
        System.out.println("Size of the ArrayList: " + arrayList.size());

        // Clearing the ArrayList
        arrayList.clear();
        System.out.println("After clearing the ArrayList: " + arrayList);

        // Checking if the ArrayList is empty
        System.out.println("Is the ArrayList empty? " + arrayList.isEmpty());
    }
}

