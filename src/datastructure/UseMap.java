package datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UseMap {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Map that includes storing and retrieving elements.
         * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         */

        // Create a new Map to store String keys and List<String> values


        Map<String, List<String>> listMap = new HashMap<String, List<String>>();

        // Create a new List to store strings
        List<String> list = new ArrayList<String>();
        list.add("item1");
        list.add("item2");
        list.add("item3");

        // Add the List to the Map with a key "key1"
        listMap.put("key1", list);

        // Add another List to the Map with a key "key2"
        list = new ArrayList<String>();
        list.add("item4");
        list.add("item5");
        listMap.put("key2", list);

        // Iterate through the Map using a for-each loop
        for (Map.Entry<String, List<String>> entry : listMap.entrySet()) {
            System.out.println("Key: " + entry.getKey());
            System.out.println("Values: " + entry.getValue());
        }

        // Iterate through the Map using an iterator
        for (Map.Entry<String, List<String>> entry : listMap.entrySet()) {
            System.out.println("Key: " + entry.getKey());
            System.out.println("Values: " + entry.getValue());
        }

        // Iterate through the Map using a while loop with an iterator
        for (Map.Entry<String, List<String>> entry : listMap.entrySet()) {
            System.out.println("Key: " + entry.getKey());
            System.out.println("Values: " + entry.getValue());
        }

    }
}