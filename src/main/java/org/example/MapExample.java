package org.example;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapExample {
  public static void main(String[] args) {

    System.out.println("---------------------------");

    // HashMap
    HashMap<String, String> books = new HashMap<>();
    books.put("abc", "Hoa Hoc Tro");
    books.put("abcd", "Tuoi Tre");
    books.put("abce", "VN Express");
    books.put("abcf", "Dan tri");
    books.put("abcg", "24h");
    books.put("abcgg", "24h");
    books.put("abcgg", null);
    books.put(null, null);

    System.out.println(books);

    System.out.println(books.get("123"));
    System.out.println(books.get("abcd"));

    for (String key: books.keySet()) {
      System.out.println(books.get(key) + " hashmap");
    }

    System.out.println("---------------------------");

    // Linked HashMap
    LinkedHashMap<String, String> flowers = new LinkedHashMap<>();
    flowers.put("qqq", "Hoa hong");
    flowers.put("qqqa", "Hoa tulip");
    flowers.put("qqqs", "Hoa hong baby");
    flowers.put("qqzq", "Hoa sen");
    flowers.put("qqvq", "Hoa phuong");
    flowers.put("qqqx", "Hoa hong");
    flowers.put("qqqx", "Hoa hong den");
    flowers.put(null, "Hoa hong den");
    flowers.put(null, null);
    flowers.put("qaaa", null);
    flowers.put("opi", null);

    System.out.println(flowers);

    for (String key: flowers.keySet()) {
      System.out.println(flowers.get(key) + " linked");
    }

    System.out.println("---------------------------");

    // TreeMap
    TreeMap<String, String> certs = new TreeMap<>();
    certs.put("qqql", "Hoa hong");
    certs.put("qqqa", "Hoa tulip");
    certs.put("qqqs", "Hoa hong baby");
    certs.put("qqzq", "Hoa sen");
    certs.put("qqvq", "Hoa phuong");
    certs.put("qqqx", "Hoa hong");
    certs.put("qqqx", "Hoa hong den");
    certs.put("qqzq", "baby tim");
    certs.put("nice", "nice");
    certs.put("nicsse", null);
    certs.put("nicssev", null);

    System.out.println(certs);

    for (String key: certs.keySet()) {
      System.out.println(certs.get(key) + " tree");
    }

  }
}
