package javaweek9homework;

import java.util.Scanner;

/**
 * 6. Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */
public class Programme_6_RetrieveElement {
    static int[] arr = {3, 4, 5, 6, 7, 8,}; // declare static arrays
    static int value; // static value

    public static void main(String[] args) { // main method
        Scanner scanner = new Scanner(System.in); // Applying scanner for requesting arrays
        System.out.println("Please enter the value");
        int value = scanner.nextInt(); // storing scanner value in "value"
        System.out.println("Please enter index ");
        int index = scanner.nextInt();
        scanner.close(); // closing scanner
        System.out.println(retrive(value)); // Printing the index number
        index(index); // calling index method
    }

    public static void index(int index) { // index method
        try {
            System.out.println(+index + " Index of the Value is : " + arr[index]); // finding the index according to value
        } catch (Exception e) { //using try catch for invalid value
            e.printStackTrace();
            System.out.println("Use right index");
        }
    }

    public static int retrive(int value) { // logic method


        for (int i = 0; i < arr.length; i++) { // for loop finding the value
            if (arr[i] == value) {
                System.out.print(+value + " Value of the Index number is : ");
                return i; //returning the value
            }
        }

        return -1; // returning -1 for invalid index

    }


}

