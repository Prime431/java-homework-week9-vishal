package javaweek9homework;

import java.util.HashMap;
import java.util.Map;

/**
 * 9. Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map
 */
public class Programme_9_HashMap {
    public static void main(String[] args) { //main method
        hashMap(); // Calling the method
    }
    public static void hashMap() { //hashMap method
        HashMap<String, Integer> map = new HashMap<>();
        // Adding element using put method
        map.put("John", 20);
        map.put("peter", 30);
        map.put("Ben", 60);
        map.put("Broad", 40);
        // Iterate the map using
        // for-each loop
        for (Map.Entry<String, Integer> e : map.entrySet())
            System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());
    }
}
