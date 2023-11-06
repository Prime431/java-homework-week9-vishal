package javaweek9homework;

import java.util.AbstractSet;
import java.util.HashSet;
import java.util.Set;

public class Programme_8_HashSet {
    public static void main(String[] args) {
        hashSet(); // calling the method in main method
    }
    public static void hashSet() {
        Set<Integer> numbers = new HashSet<>(); // Create a Hashset to store Integer objects
        numbers.add(4); //adding the value in hashset
        numbers.add(7);
        numbers.add(8);

        System.out.println("Numbers between 1 and 10 in the set: ");
        for (int i = 0; i <= 10; i++) { // for loop for checking the hashset value between 1 to 10
            if (numbers.contains(i)) { // using predefined contains method for determines the collection have given item or not
                System.out.println(i + " Number is in Set ");
            } else {
                System.out.println(+i + " is Not in the set between 1 to 10 set");
            }
        }
    }
}
