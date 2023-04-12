/*
Given an array A having N positive integers. 
Find the nearest smaller number for every element such that the smaller element is on left side. 
Note - If any element doesn't have any smaller element that it to it's left, print -1 for it. 
Sample Input 
input: N = 5 
A : 1 2 5 3 5 
Sample Output 
A: -1 1 2 2 3 
Sample Explanation 
There is no element to the left of 1 hence for it there is no smaller neighbour. Hence the answer is -1. For 2 nearest smaller neighbout to it's left 
 */
import java.util.*;

public class NearestSmallerElement {
    public static void main(String[] args) {
        int[] arr = {3,2,1};
        int[] result = nearestSmallerElements(arr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] nearestSmallerElements(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        
        for (int i = 0; i < n; i++) {
            int j = i - 1;
            while (j >= 0 && arr[j] >= arr[i]) {
                j--;
            }
            res[i] = j >= 0 ? arr[j] : -1;
        }
        
        return res;
    }
}