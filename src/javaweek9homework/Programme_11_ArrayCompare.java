package javaweek9homework;

import java.util.ArrayList;

public class Programme_11_ArrayCompare {
    public static void main(String[] args) { //main method
        arrayCompare(); // calling the arrayCompare method
    }

    public static void arrayCompare() { // static method
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        ArrayList<String> c2 = new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");
        System.out.println("ArrayList1 = " + c1);
        System.out.println("ArrayList1 = " + c2);
        // using if loop for comapre
        if (c1.equals(c2) == true) {
            System.out.println("Array List are equal");
        } else {
            System.out.println("Array List are not equal");
        }

    }
}

