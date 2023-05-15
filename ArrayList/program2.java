/*
Given an array of integers, find all pairs of elements that sum up to a given target value. 
Return the pairs as a list of lists.

Example:
Input:
Array: [2, 4, 5, 7, 8]
Target Sum: 9

Output:
[[2, 7], [4, 5]]
 */

// -----------------------------------------------------------------------------------------

package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class program2 {
    public static List<List<Integer>> findPairs(int[] nums, int targetSum) {
        List<List<Integer>> pairs = new ArrayList<>();

        // Create an ArrayList to store the pairs
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == targetSum) {
                    List<Integer> pair = new ArrayList<>();
                    pair.add(nums[i]);
                    pair.add(nums[j]);
                    pairs.add(pair);
                }
            }
        }

        return pairs;
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 5, 7, 8};
        int targetSum = 9;

        List<List<Integer>> result = findPairs(nums, targetSum);

        // Print the pairs
        for (List<Integer> pair : result) {
            System.out.println(pair);
        }
    }
}

// --------------------------------------------------------------------------------

// import java.util.ArrayList;
// import java.util.List;

// public class program2 {
//     public static List<int[]> findPairs(int[] nums, int targetSum) {
//         List<int[]> pairs = new ArrayList<>();

//         for (int i = 0; i < nums.length; i++) {
//             for (int j = i + 1; j < nums.length; j++) {
//                 if (nums[i] + nums[j] == targetSum) {
//                     int[] pair = {nums[i], nums[j]};
//                     pairs.add(pair);
//                 }
//             }
//         }

//         return pairs;
//     }

//     public static void main(String[] args) {
//         int[] nums = {2, 4, 5, 7, 8};
//         int targetSum = 9;

//         List<int[]> result = findPairs(nums, targetSum);

//         for (int[] pair : result) {
//             System.out.println("[" + pair[0] + ", " + pair[1] + "]");
//         }
//     }
// }

// -------------------------------------------------------------------------------------

// import java.util.ArrayList;

// public class progrma2 {
//     public static ArrayList<int[]> findPairs(int[] nums, int targetSum) {
//         ArrayList<int[]> pairs = new ArrayList<>();

//         for (int i = 0; i < nums.length; i++) {
//             for (int j = i + 1; j < nums.length; j++) {
//                 if (nums[i] + nums[j] == targetSum) {
//                     int[] pair = {nums[i], nums[j]};
//                     pairs.add(pair);
//                 }
//             }
//         }

//         return pairs;
//     }

//     public static void main(String[] args) {
//         int[] nums = {2, 4, 5, 7, 8};
//         int targetSum = 9;

//         ArrayList<int[]> result = findPairs(nums, targetSum);

//         for (int[] pair : result) {
//             System.out.println("[" + pair[0] + ", " + pair[1] + "]");
//         }
//     }
// }


