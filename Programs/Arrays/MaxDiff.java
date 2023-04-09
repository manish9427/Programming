/*
  Write a function in any programming language that takes an array of integers as input and 
  returns the maximum difference between any two elements in the array. For example, if the input
  array is [1, 3, 7, 2, 9, 8], the function should return 8 (the difference between 1 and 9).

Note: The function should handle both positive and negative integers in the array.
 */
package Programs.Arrays;

public class MaxDiff {
    public static void main(String args[]){
        int[] arr={1, 3, 7, 2, 9, 8};
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        int ans = solution(arr);
        System.out.println("Output: ");
        System.out.println(ans);
    }
    public static int  solution(int arr[]){
        if (arr == null || arr.length < 2) {
            return 0; // Return 0 if array is null or has less than 2 elements
        }
        
        int maxDiff = 0;
        int minVal = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            int diff = arr[i] - minVal;
            maxDiff = Math.max(maxDiff, diff);
            minVal = Math.min(minVal, arr[i]);
        }
        
        return maxDiff;

    }
    
}
