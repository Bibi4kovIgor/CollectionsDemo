package edu.alevel;

import edu.alevel.model.Person;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Person> personList = new TreeSet<>();
        personList.add(new Person("Ihor", 31));
        personList.add(new Person("Marina", 28));
        personList.add(new Person("Illya", 23));
        personList.add(new Person("Semen", 44));

        personList.forEach(System.out::println);
        System.out.println();

//        personList.sort(new PersonAgeComparator().reversed());
//        personList.forEach(System.out::println);
//        System.out.println();
//
//        personList.sort(new PersonNameComparator());
//        personList.forEach(System.out::println);
//
//        System.out.println();
//
//        Collections.sort(personList);
//        personList.forEach(System.out::println);


        Set<String> strings = new HashSet<>();
        strings.add("apple");
        strings.add("apple");
        strings.add("apple");
        strings.add("dog");
        strings.add("dog");
        System.out.println(strings.size());
        strings.forEach(System.out::println);

        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("pear", "груша");
        linkedHashMap.put("apple", "яблуко"); // record<K, V>
        linkedHashMap.put("orange", "апельсин");

        linkedHashMap.forEach((key, value) -> System.out.println("Key=" + key + " Value=" + value));

        System.out.println();

        Map<String, String> map = new HashMap<>();
        map.put("pear", "груша");
        map.put("apple", "яблуко");
        map.put("orange", "апельсин");

        map.forEach((key, value) -> System.out.println("Key=" + key + " Value=" + value));

        System.out.println();

        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("pear", "груша");
        treeMap.put("orange", "апельсин");
        treeMap.put("apple", "яблуко");

        treeMap.forEach((key, value) -> System.out.println("Key=" + key + " Value=" + value));


    }

}