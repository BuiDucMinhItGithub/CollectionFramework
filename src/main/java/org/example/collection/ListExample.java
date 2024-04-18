package org.example.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListExample {

  public static void main(String[] args) {

    System.out.println("-------------------------------");

    // Array List
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Toyota");
    cars.add("Camry");
    cars.add("Honda");
    cars.add("Mazda");
    cars.add("Camry");
    cars.add(null);
    cars.add(null);

    System.out.println(cars);

    System.out.println(cars.get(2));

    for (String car: cars) {
      System.out.println(car);
    }

    System.out.println("-------------------------------");

    // Linked List
    LinkedList<String> names = new LinkedList<>();
    names.add("Minh");
    names.add("Hoa");
    names.add("Anh");
    names.add("Khoa");
    names.add("Minh");
    names.add(null);
    names.add(null);

    System.out.println(names);
    for (String name: names) {
      System.out.println(name);
    }

  }

}
