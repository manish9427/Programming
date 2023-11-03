/*
Input:

Array: {2, 1, 5, 1, 3, 2}
Window size k: 3
Output:

Maximum Subarray Sum: 9

Input:

Array: {4, 2, 10, 23, 8, 5, 1, 3}
Window size k: 4
Output:

Maximum Subarray Sum: 39

*/
import java.util.Arrays;
public class MaximumSubArray {
    public static void main(String args[]){
        int[] arr={2, 1, 5, 1, 3, 2};
        int k=3;

        System.out.println(Arrays.toString(arr));

        // for i to n
        // length = n-k;

        // arr[0]+arr[1]+arr[2];=>8
        // arr[1]+arr[2]+arr[3];=>7
        // arr[2]+arr[3]+arr[4];=>9
        // arr[3]+arr[4]+arr[5];=>6

        // store the value store
        // if (store<current)
        // restore the value to store


        int maxSum=0;
        for(int i=0;i<arr.length-k+1;i++){
            int sum=arr[i]+arr[i+1]+arr[i+2];
            // System.out.println(sum);
            maxSum=Math.max(sum,maxSum);
            // System.out.println(sum);
        }
        System.out.println(maxSum);

    }

    
}
// TC O(n)
// SC O(1)
