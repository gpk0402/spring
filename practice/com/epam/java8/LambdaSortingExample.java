package com.epam.java8;

import com.sun.source.tree.Tree;

import java.util.*;

public class LambdaSortingExample {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(76,203,11,54,21));
        System.out.println("Elements in array list before sorting: "+arrayList);
        Collections.sort(arrayList,(a,b)-> a-b);
        System.out.println("Elements in array list after sorting: "+arrayList);

        Set<Integer> treeSet = new TreeSet<>((a,b)->b-a);
        treeSet.add(2);
        treeSet.add(96);
        Collections.shuffle(arrayList);
        treeSet.addAll(arrayList);
        System.out.println("Elements in tree set: "+ treeSet);

        int a = "gpk".compareTo("z");
        System.out.println(a);
    }
}
