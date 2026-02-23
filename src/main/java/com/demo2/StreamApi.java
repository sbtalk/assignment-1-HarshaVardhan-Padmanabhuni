package com.demo2;

import java.util.Arrays;
import java.util.List;

public class StreamApi {
    static void main(String[] args) {
        List<Integer> myList = Arrays.asList(12, 7, 3, 18, 25, 30, 42, 55, 60, 73, 81, 90, 100, 5, 16);

        System.out.println("EVEN NUMBERS....");
        myList.stream().filter(n->n%2==0).forEach(System.out::println);
        int sum = myList.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println("\nSum of Numbers: " + sum);

        System.out.println("\nSorted in Descending Order:");
        myList.stream()
                .sorted((a, b) -> b.compareTo(a))
                .forEach(System.out::println);



    }
}
