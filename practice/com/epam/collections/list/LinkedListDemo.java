package com.epam.collections.list;

import java.util.LinkedList;

public class LinkedListDemo {
    // add vs offer -> ADD exception but OFFER returns false in the case of failures
    // get vs peek -> GET exception but PEEK returns false in the case of failures

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements using specific methods
        linkedList.addFirst("Apple");
        linkedList.addLast("Banana");
        linkedList.offerFirst("Cherry");
        linkedList.offerLast("Date");

        // Displaying the LinkedList
        System.out.println("Initial LinkedList: " + linkedList);

        // Retrieve the first and last elements
        System.out.println("First element: " + linkedList.getFirst());
        System.out.println("Last element: " + linkedList.getLast());

        // Remove the first and last elements
        System.out.println("Removing the first element: " + linkedList.removeFirst());
        System.out.println("Removing the last element: " + linkedList.removeLast());

        // Displaying the LinkedList after removal
        System.out.println("LinkedList after removal: " + linkedList);

        // Peek the first and last elements (without removing)
        System.out.println("Peeking the first element: " + linkedList.peekFirst());
        System.out.println("Peeking the last element: " + linkedList.peekLast());

        // Poll the first and last elements (remove and return)
        System.out.println("Polling the first element: " + linkedList.pollFirst());
        System.out.println("Polling the last element: " + linkedList.pollLast());

        // Displaying the LinkedList after polling
        System.out.println("LinkedList after polling: " + linkedList);
    }
}
