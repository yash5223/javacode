package keystone;

import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add(100);             // Integer
        list.add("Hello");         // String
        list.add(3.14);            // Double
        list.add(false);           // Boolean
        list.add(null);            // null
        list.add('A');             // Character

        // Add at specific index
        list.add(2, "Inserted");

        // Add at first and last
        list.addFirst("Start");
        list.addLast("End");

        // Print full list
        System.out.println("Original LinkedList:\n" + list);

        // Access elements
        System.out.println("\nAccessing Elements:");
        System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());
        System.out.println("At index 3: " + list.get(3));

        // Modify element
        list.set(1, "Updated");

        // Remove elements
        list.removeFirst();              // remove head
        list.removeLast();               // remove tail
        list.remove(2);                  // remove at index
        list.remove("Hello");            // remove by value

        // Check contains, size, empty
        System.out.println("\nContains 'A': " + list.contains('A'));
        System.out.println("Size of list: " + list.size());
        System.out.println("Is list empty? " + list.isEmpty());

        // Loop through elements using for-each
        System.out.println("\nFor-Each Loop:");
        for (Object item : list) {
            System.out.println(item);
        }

        // Loop through elements using index-based for loop
        System.out.println("\nIndex-Based Loop:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Index " + i + ": " + list.get(i));
        }

        // Convert to array
        Object[] array = list.toArray();
        System.out.println("\nArray from LinkedList: " + Arrays.toString(array));

        // Clear the list
        list.clear();
        System.out.println("\nList after clear(): " + list);
    }
}
