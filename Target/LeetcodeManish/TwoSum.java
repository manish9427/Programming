//-------------------------------------- brute force-----------------------------

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        // If no solution is found, return an empty array or throw an exception
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}


//------------------------------------ hashmap----------------------------
/*
class Solution{
    public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> numMap = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        if (numMap.containsKey(complement)) {
            return new int[] { numMap.get(complement), i };
        }
        numMap.put(nums[i], i);
    }
    return new int[] {-1, -1}; // no solution found
    }
} 
*/

//----------------------------------------two pointer-------------------------
// class TwoSum {
//     public static void main(String args[]) {
//         int[] arr = {2, 7, 11, 9};
//         int target = 9;
//         int[] result = twoSum(arr, target);
//         System.out.println("Indices: " + result[0] + ", " + result[1]);
//     }
    
//     public int[] twoSum(int[] nums, int target) {
//         if (nums == null || nums.length < 2) {
//             return new int[] {-1, -1}; // handle edge cases
//         }
//         int left = 0;
//         int right = nums.length - 1;
//         while (left < right) {
//             int sum = nums[left] + nums[right];
//             if (sum == target) {
//                 return new int[] { left, right };
//             } else if (sum < target) {
//                 left++;
//             } else {
//                 right--;
//             }
//         }
//         return new int[] {-1, -1}; // no solution found
//     }
// }
// ------------------------------------------------------------------
// import java.util.HashMap;
// import java.util.Map;

// class TwoSum {
//     public int[] twoSum(int[] nums, int target) {
//         Map<Integer, Integer> map = new HashMap<>();
        
//         for (int i = 0; i < nums.length; i++) {
//             int complement = target - nums[i];
            
//             if (map.containsKey(complement)) {
//                 return new int[]{map.get(complement), i};
//             }
            
//             map.put(nums[i], i);
//         }
        
//         return null;
//     }
    
//     public static void main(String[] args) {
//         TwoSum twoSum = new TwoSum();
        
//         int[] nums = {2, 7, 11, 15};
//         int target = 9;
        
//         int[] result = twoSum.twoSum(nums, target);
//         System.out.println(result);
        
//         if (result != null) {
//             System.out.println("Indices: " + result[0] + ", " + result[1]);
//         } else {
//             System.out.println("No solution found.");
//         }
//     }
// }
