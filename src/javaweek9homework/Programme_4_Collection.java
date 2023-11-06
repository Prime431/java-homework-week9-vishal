package javaweek9homework;
//4. Write a Java program to create a new array list, add some colours (string) and
//printout the collection using for each loop.
import java.util.ArrayList;

public class Programme_4_Collection {
    public static void main(String[] args) // main method
    {
       colorArrayList(); // calling method in main method
    }
    public static void colorArrayList(){  // static method
        //Create a new ArrayList to store colors
        ArrayList<String> colorList = new ArrayList<String>();

// Add some colors to the ArrayList
        colorList.add("Red");
        colorList.add("White");
        colorList.add("Yellow");
        colorList.add("Blue");
        colorList.add("Pink");

        // print out the collection using a for-each loop
        System.out.println("Colors in the ArrayList");
        for(String color : colorList){
            System.out.println(color);
        }

    }

}
