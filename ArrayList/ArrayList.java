import java.util.ArrayList;

public class ArrayList {
    public static void main(String args[]) {
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        fruits.add("apple");
        fruits.add("Mango");
        fruits.add("papaya");
        System.out.println(fruits.get(0)); // Printing the first element

        // Getting the size of the ArrayList
        int size = fruits.size();
        System.out.println(size);

        // Removing the first element
        fruits.remove(0);
        System.out.println(fruits.get(0)); // Printing the new first element

        // Iterating through the ArrayList
        for (String i : fruits) {
            System.out.println(i);
        }

        
        // Converting the ArrayList to an array
        String[] a = new String[fruits.size()];
        a = fruits.toArray(a);
        for (String i : a) {
            System.out.println(i);
        }

        // Finding the index of "Mango" in the ArrayList
        int index = fruits.indexOf("Mango");
        System.out.println(index);
        
        
        // Using the set method to modify elements
        fruits.set(0, "orange");
        fruits.set(1, "Apple");
        
        for (String f : fruits) {
            System.out.println(f);
        }
        
        // Checking if the ArrayList contains "apple"
        System.out.println(fruits.contains("Apple"));
        
        // Clearing the ArrayList (removing all elements)
        fruits.clear();
        System.out.println(fruits);
        
        // Checking if the ArrayList is empty
        System.out.println(fruits.isEmpty());
    }
}


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