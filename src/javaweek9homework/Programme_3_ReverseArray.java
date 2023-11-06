package javaweek9homework;

/**
 * 3. Write a Java program to reverse an array of integer values.
 */

public class Programme_3_ReverseArray {
    static int[] arr = {10, 20, 30, 40, 50}; // Array value

    public static void main(String[] args) { // main method
        reversArray(arr, arr.length); // calling reversArray in main method
    }
    public static void reversArray(int a[], int n) { //login in reversArray method
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }

        System.out.println("reversed array"); // Printing the reverse array
        for (int k = 0; k < n; k++) {
            System.out.println(b[k]);
        }

    }
}


