package javaweek9homework;

import java.util.ArrayList;

//7. Write a Java program to test if an array list is empty or not
public class Programme_7_EmptyArrayOrNot {


    public static void main(String[] args) { // main method

        emptyOrNot(); // calling the empty or Not method
    }

    public static void emptyOrNot() { // static method
        ArrayList<String> arrayList = new ArrayList<>();
        if (arrayList.isEmpty()) {
            System.out.println("arrayList is empty");
        } else {
            System.out.println("arrayList is not empty");
        }
        // printing all the elements available in arrayList
        System.out.println("ArrayList = " + arrayList);

        // use add() method to add elements in the arrayList
        arrayList.add("a");
        arrayList.add("b");
        if (arrayList.isEmpty()) {
            System.out.println("arrayList is empty");
        } else {
            System.out.println("array list is not empty");
        }
        //printing all the elements available in arrayList
        System.out.println("ArrayList = " + arrayList);
    }

}

