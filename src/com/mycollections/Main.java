/**
 *  Java program to find size of the Tree.
 */

package com.mycollections;

import java.util.Set;
import java.util.TreeSet;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating an instance of a TreeSet.
        Set<Double> mySet = new TreeSet<>();

        // Adding elements to mySet.
        mySet.add(10.5);
        mySet.add(11.8);
        mySet.add(22.3);
        mySet.add(90.6);
        mySet.add(1.0);
        mySet.add(81.2);
        mySet.add(14.5);
        mySet.add(13.2);

        // Printing size of mySet to console.
        System.out.println("Size of mySet is: " + mySet.size()); // Output: Size of mySet is: 8

    }
}