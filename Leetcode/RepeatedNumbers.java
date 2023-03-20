import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RepeatedNumbers {

    public static List<Integer> findRepeatedNumbers(int[] arr) {
        // Sort the array in ascending order
        Arrays.sort(arr);

        List<Integer> repeatedNumbers = new ArrayList<>();
        // Traverse the sorted array and compare adjacent elements
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i+1]) {
                // If adjacent elements are the same, add it to the repeatedNumbers list
                if (!repeatedNumbers.contains(arr[i])) {
                    repeatedNumbers.add(arr[i]);
                }
            }
        }

        // Return the list of repeated numbers
        return repeatedNumbers;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 2, 5, 6, 7, 5, 8, 9, 9};
        List<Integer> repeatedNumbers = findRepeatedNumbers(arr);
        System.out.println(repeatedNumbers); // Output: [2, 5, 9]
    }
}
