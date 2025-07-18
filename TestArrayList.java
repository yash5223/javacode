package keystone;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {

        // 1️⃣ Create original list
        ArrayList list1 = new ArrayList();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add("hello4");
        list1.add(5);
        System.out.println("Original list (list1): " + list1);

        // 2️⃣ Remove element from index 3
        ArrayList list2 = new ArrayList(list1); // copy of list1
        System.out.println("Removed element at index 3: " + list2.remove(3));
        System.out.println("List after removal (list2): " + list2);

        // 3️⃣ Merge list2 with another list using addAll()
        ArrayList list3 = new ArrayList(list2); // copy of list2
        ArrayList anotherList = new ArrayList(list2); // another copy
        System.out.println("Adding anotherList to list3: " + list3.addAll(anotherList));
        System.out.println("List after addAll (list3): " + list3);

        // 4️⃣ Get size of list
        System.out.println("Size of list3: " + list3.size());

        // 5️⃣ Check if list contains another list
        System.out.println("Does list3 contain anotherList? " + list3.contains(anotherList)); // false

        // 6️⃣ Remove all elements using removeAll
        ArrayList list4 = new ArrayList(list3);
        System.out.println("Removing all elements: " + list4.removeAll(list4)); // true
        System.out.println("List after removeAll (list4): " + list4);

        // 7️⃣ Check containsAll() on empty list
        System.out.println("Does list4 contain all of itself? " + list4.containsAll(list4)); // true

        // 8️⃣ Check if list is empty
        System.out.println("Is list4 empty? " + list4.isEmpty());

        // 9️⃣ Clear the list (already empty)
        list4.clear();
        System.out.println("List after clear (list4): " + list4);

        // 🔟 Working with get(), set(), add(index, element), indexOf(), lastIndexOf()
        ArrayList list5 = new ArrayList();
        list5.add("Ram");
        list5.add("Shyam");
        list5.add("Geeta");
        list5.add("Ram");  // duplicate to test indexOf() and lastIndexOf()
        System.out.println("List before modifications (list5): " + list5);

        // Set element at index 2 to "Seeta"
        list5.set(2, "Seeta");
        System.out.println("List after set at index 2: " + list5);

        // Get element at index 1
        System.out.println("Element at index 1: " + list5.get(1));

        // Add element at specific index
        list5.add(2, "Laxman");
        System.out.println("List after adding 'Laxman' at index 2: " + list5);

        // indexOf: First occurrence of "Ram"
        System.out.println("First index of 'Ram': " + list5.indexOf("Ram"));

        // lastIndexOf: Last occurrence of "Ram"
        System.out.println("Last index of 'Ram': " + list5.lastIndexOf("Ram"));
    }
}
