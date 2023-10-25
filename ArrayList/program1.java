/*
This example covers the following ArrayList functions:

add(): Adds elements to the ArrayList.
size(): Gets the size (number of elements) of the ArrayList.
get(): Accesses elements by index.
contains(): Checks if an element exists in the ArrayList.
set(): Modifies an element at a specific index.
remove(): Removes an element by index or value.
isEmpty(): Checks if the ArrayList is empty.
clear(): Clears all elements from the ArrayList.

By running this example, you can see how these functions work and manipulate the ArrayList.
 */

package ArrayList;

import java.util.ArrayList;

public class program1 {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Get the size of the ArrayList
        int size = fruits.size();
        System.out.println("Size: " + size);

        // Access elements by index
        String firstFruit = fruits.get(0);
        System.out.println("First fruit: " + firstFruit);

        // Check if an element exists in the ArrayList
        boolean containsBanana = fruits.contains("Banana");
        System.out.println("Contains Banana? " + containsBanana);

        // Modify an element
        fruits.set(2, "Grapes");
        System.out.println("Updated fruits: " + fruits);

        // Remove an element by index
        String removedFruit = fruits.remove(0);
        System.out.println("Removed fruit: " + removedFruit);

        // Remove an element by value
        boolean removed = fruits.remove("Banana");
        System.out.println("Removed Banana? " + removed);

        // Check if the ArrayList is empty
        boolean isEmpty = fruits.isEmpty();
        System.out.println("Is empty? " + isEmpty);

        // Clear the ArrayList
        fruits.clear();
        System.out.println("Cleared fruits: " + fruits);


    }
}

