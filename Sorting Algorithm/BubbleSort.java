/*
 * time complexity 
 * O(n^2) for worst case when array is sorted in decending order
 * O(n) when array is sorted
 * 
 * Space complexity
 * O(1)
 */

 /*
  * pseudo code
  for i from 1 to N
  for j from 0 to N-1
  if(arr[j]>arr[j+1])
  swap(arr[j],arr[j+1])
  */

// import java.util.Arrays;

// public class BubbleSort {
//     public static void main(String args[]){
//         int[] arr = {-8, 10, 15, -6, -8, 10, 12};
//         Solution(arr);
//         System.out.println(Arrays.toString(arr));
//     }
//     public static void Solution(int arr[]){
//         for(int i=1;i<arr.length;i++){
//             for(int j=0;j<arr.length-1;j++){
//                 if(arr[j]>arr[j+1]){
//                     // swap
//                     int temp=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;
//                 }
//             }
//         }
//     }
// }


import java.util.Arrays;

public class BubbleSort {
    public static void main(String args[]){
        int[] arr = {-8, 10, 15, -6, -8, 10, 12};
        Solution(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void Solution(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
                System.out.println(Arrays.toString(arr));
            }
        }
    }
}
