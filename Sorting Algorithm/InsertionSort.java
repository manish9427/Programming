/*
 * after comparing element tot the left shift hte element  to the right to make room to insert a value
 * 
 * Time Complexity
 * Quadratic time O(n^2)
 * small data set = decent
 * large data set = bad
 * 
 * less steps than bubble sort 
 * best case is O(n) compared to Selection Sort O(n^2)
 * 
 * Space Complexity
 *  */
// import java.util.*;
//  public class InsertionSort{
//     public static void main(String[] args){
//         int[] arr={-8,-4,5,7,6,8,2,-4,10,100};
//         // Arrays.sort(arr);
//         // for(int i : arr){
//         //     System.out.print(i+ " ");
//         // }
//         InsertionFun(arr);
//         System.out.println(Arrays.toString(arr));
//     }

//     public static void InsertionFun(int[] arr){
//         // starting with index i=1;
//         for(int i=1;i<arr.length;i++){ // increment i with each iteration
//             int temp=arr[i];
//             int j=i-1;  // keep index of previous index;

//             while(j>=0 && arr[j]>temp){ // index j should not go beyond 0 if arr[j] is greater than temp
//                 arr[j+1]=arr[j];
//                 j--;
//             }
//             arr[j+1]=temp;
//             System.out.println(Arrays.toString(arr));
//         }
//     }
//  }

import java.util.Arrays;
class InsertionSort{
    public static void main(String args[]){
        int[] arr = {5,3,1,2,4};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}