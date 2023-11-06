package javaweek9homework;
/*
10. Write a programme that tells you which line passes through particular stations.
Just use Zone 1 stations name.
 */

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class Programme_10_LondonTubeLine {
    public static void main(String[] args) {
        underground();
    }
    public static void underground(){
        Scanner scanner = new Scanner(System.in); //applying scanner
        HashMap<String, String> underGroundStation = new HashMap<>();// mapping the station name and tube lines
        underGroundStation.put("Euston", "Bakerloo, Metrolpolitan, Overground, Circle"); // storing tubes line passing from particular station
        underGroundStation.put("Oxford Street", "Bakerloo, Central, Jubilee");
        underGroundStation.put("Paddington", "Bakerloo, Circle, District, Circle");

        System.out.println("Enter the station name");
        String stationName = scanner.nextLine(); // storing the station name

        if(underGroundStation.containsKey(stationName)) // using loop for matching the underground station name
        {
            String lines = underGroundStation.get(stationName);
            System.out.println("Line passing through" + stationName + ":" + lines);
        } else {
            System.out.println(stationName + "is not in zone 1");
        }

        scanner.close(); // closing scanner
    }
}