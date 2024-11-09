package org.example.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample {

  public static void main(String[] args) {

    System.out.println("---------------------------");

    // HashSet
    HashSet<Integer> numbers = new HashSet<>();
    numbers.add(123);
    numbers.add(null);
    System.out.println("Toi khong thich dieu nay");
    numbers.add(null);

    System.out.println(numbers);

    for (Integer number: numbers) {
      System.out.println(number);
    }

    System.out.println("---------------------------");

    // LinkedHashSet
    LinkedHashSet<String> words = new LinkedHashSet<>();
    words.add("Minh");
    words.add("Hoa");
    words.add("Linh");
    words.add("Kien");
    words.add("Minh");
    words.add(null);

    System.out.println(words);
    for (String word: words) {
      System.out.println(word);
    }

    System.out.println("---------------------------");

    // TreeSet
    TreeSet<Integer> ranges = new TreeSet<>();
    ranges.add(123);
    ranges.add(321);
    ranges.add(111);
    ranges.add(222);

    System.out.println(ranges);
  }
}
