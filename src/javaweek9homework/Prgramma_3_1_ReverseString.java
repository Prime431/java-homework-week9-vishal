package javaweek9homework;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * 3. Write a Java program to reverse an array of integer values.
 */
public class Prgramma_3_1_ReverseString {
    static char[] char_Array = {'h', 'e', 'l', 'l', 'o'}; // Array value

    public static void main(String[] args) { // main method
        reverse(char_Array, char_Array.length); // calling the reverse method to reverse the character array
    }
    public static void reverse(char char_Array[], int n) { //Method to reverse a character array
        char[] dest_array = new char[n]; // create a new character array to store the reversed charactrs
        int j = n;
        for (int i = 0; i < n; i++) {  //loop through the original array and reverse it
            dest_array[j - 1] = char_Array[i];
            j = j - 1;
        }
        // Print the original array
        System.out.println(" Original Array : ");
        for (int k = 0; k < char_Array.length; k++) {
            System.out.println(char_Array[k] + " ");
        }
        // Print the reverse array
        System.out.println("Reversed arrays:  ");
        for (int k = 0; k < n; k++) {
            System.out.print(dest_array[k] + " ");
            System.out.println();

        }
    }
}