package com.epam.java8.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsPractice {

public static void main(String[] args) {

    // 1. Even or Odd:
    Arrays.asList(1,2,3,4).stream().filter(i -> i % 2 == 0).forEach(System.out::println);

// 2. Filter Numbers Starting with 1:
    Arrays.asList(1,2,3,4).stream().map(i -> i + "").filter(i -> i.startsWith("1")).forEach(System.out::println);

// 3. Find Duplicate Elements in List:
    Set<Integer> set = new HashSet<>();
    System.out.println(Arrays.asList(1,2,2,33,4,5,65,23,2,2,3,43,33,4,5,8).stream().filter(i -> !set.add(i)).collect(Collectors.toSet()));

// 4. Generate 100 Random Numbers in Range 1-10:
//    new Random().ints(100, 1, 10).forEach(System.out::println);

// 5. Find Max Number using max():
    System.out.println(Arrays.asList(1,2,34,4,5,6,6).stream().max((a,b)-> b-a).get());
    System.out.println(Arrays.asList(1,2,2,33,4,5,65,23,2,2,3,43,33,4,5,8).stream().sorted().findFirst());

// 6. Find Min Number using min():
    System.out.println(Arrays.asList(1,2,34,4,5,6,6).stream().min(Comparator.comparing(Integer::valueOf)).get());
//
// 7. Concatenate 2 ArrayLists:
    Stream.concat(Arrays.asList(1,2,3).stream(), Arrays.asList(1,2,3).stream()).forEach(System.out::println);
//
// 8. Find Unique Elements:
    List<Integer> list = Arrays.asList(1,2,2,33,4,5,65,23,2,2,3,43,33,4,5,8);
    list.stream().distinct().forEach(System.out::println);
    (list.stream().filter(i -> Collections.frequency(list,i) == 1).collect(Collectors.toSet())).forEach(i -> System.out.print(i+","));
//    System.out.println(result);
//
// 9. String Reverse:
    String result = ("hiiiiokok".chars().mapToObj(i -> (char)i + "").reduce("", (a,b) -> b + a));
//
// 10. Remove Unknown Chars:
    String s = "@#$%^&*()(*&^HJHCVB NMHGSwerty12 345678gv%^&*(^%#$vDgV#$%";
    String s1 = s.replaceAll("[^a-zA-Z0-9]","");
    System.out.println(s1); // Output: HJHCVBNMGSwerty12345678

// Map used
    Map<Integer,String> map = new HashMap<>();
    map.put(1, "hi");
    map.put(2, "ok");
    map.put(-3, "neg");
    map.put(12, "ok");

// 12. Iterators in Map:
    Set<Integer> set1 = map.keySet();
    Iterator<Integer> it = set1.iterator();
    while(it.hasNext()) {
        System.out.println(it.next());
    }

// 13. Collecting Maps:
    Map<Integer,String> map1 = map.entrySet().stream().sorted((entry1, entry2) -> entry1.getValue().compareTo(entry2.getValue())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));

// 14. Sort Ascending Based on Keys:
    map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));

// 15. Sort Ascending Based on Values:
    map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));

// 16. Sort Descending Based on Keys:
    map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey())).forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));

// 17. Sort Descending Based on Values:
    map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));

// 18. Generate 30 Numbers:
    IntStream.range(1, 30).boxed().forEach(System.out::print);

// 19. Remove Duplicates:
    Arrays.asList(1,2,3,4,4,5,6,2,3,1,4).stream().distinct().forEach(System.out::println);

//// 20. Get Count of Each Number:
//    System.out.println(Arrays.asList(1,2,3,4,4,5,6,2,3,1,4).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
//
// 21. Get Sum of Elements:
    System.out.println(Arrays.asList(1,2,3,4,4,5,6,2,3,1,4).stream().mapToInt(i -> i).sum());

// 22. Get Average of Elements:
    System.out.println(Arrays.asList(1,2,3,4,4,5,6,2,3,1,4).stream().mapToInt(i -> i).average().getAsDouble());

// 23. Get All Statistics:
    IntSummaryStatistics stats = Arrays.asList(1,2,3,4,5).stream().mapToInt(x -> x).summaryStatistics();
    System.out.println("Highest number in List : " + stats.getMax());
    System.out.println("Lowest number in List : " + stats.getMin());
    System.out.println("Sum of all numbers : " + stats.getSum());
    System.out.println("Average of all numbers : " + stats.getAverage());
    System.out.println("Count of all numbers : " + stats.getCount());

// 24. Join Strings with , :
    System.out.println(Arrays.asList("hell","hii","ooj").stream().collect(Collectors.joining(","))); // Output: hell,hii,ooj
    System.out.println(Arrays.asList("hell","hii","ooj").stream().collect(Collectors.joining(",","[","]"))); // Output: [hell,hii,ooj]

// 25. Building Stream of Strings:
    Stream.of("a", "b", "c").forEach(System.out::println);

    System.out.println("---------------------");
    int[] arr = {5, 7, 5, 7, 5, 2};
    System.out.println(Arrays.stream(arr).boxed().collect(Collectors.groupingBy(a->a,Collectors.counting()))
            .entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).get().getKey());

    Map<Integer, String> map3 = new HashMap<>();
    map3.put(1, "Apple");
    map3.put(2, "Banana");
    map3.put(3, "Orange");
    map3.put(4, "Grapes");

    // Filter map based on keys greater than 2 and store the result in a new map
    Map<Integer, String> filteredMap = map3.entrySet().stream()
            .filter(entry -> entry.getKey() > 2)
            .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));

}
}
