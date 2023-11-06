package javaweek9homework;

import java.util.ArrayList;

// Write a Java program to iterate through all elements in an array list using
//Iterater.
public class Programme_5_ArrayIterate {

    public static void main(String[] args) { //main method

        iterate(); // calling method in main method
    }

    public static void iterate() { // static method
        // Creating an array List
        ArrayList<String> languages = new ArrayList<>();
        languages.add("Hindi");
        languages.add("Gujarati");
        languages.add("Marathi");
        languages.add("Rajasthani");
        languages.add("Telgu");
        System.out.println("ArrayList : " + languages);

        //using for loop for getting all languages
        for (int i = 0; i < languages.size(); i++) {
            System.out.println(languages.get(i)); // printing out all languages
            System.out.println(", ");
        }

    }
}
