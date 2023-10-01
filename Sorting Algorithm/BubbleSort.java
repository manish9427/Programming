/*
 * time complexity 
 * O(n^2) for worst case when array is sorted in decending order
 * O(n) when array is sorted
 * 
 * Space complexity
 * O(1)
 */

import java.util.Arrays;

public class BubbleSort {
    public static void main(String args[]){
        int[] arr = {-8, 10, 15, -6, -8, 10, 12};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
