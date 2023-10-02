/* 
- move smaller element to the left of piviot
- recusively divide array in 2 partions
 * time complexity =>  
 * average & best case => O(nlog(n)) where as for 
 * worst case => O(n^2) when pivot selection is poor  if array is sorted already
 * 
 * Space complexity => O(log(n)) due to recursion
 */


 /*
  * 
  */

import java.util.*;  
public class QuickSort {
    public static void main(String args[]){
        int arr[] = {9,5,7,-5,-4,5,10};
        // Arrays.sort(arr);
        Solution(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

        // for(int i : arr){
        //     System.out.print(i+" ");
        // }
    }

    public static void Solution(int[] arr, int start, int end){
        if(start>=end) return ; // base case

        int piviot=Partition(arr, start, end);
        Solution(arr,start,piviot-1);
        Solution(arr,piviot+1,end);
    }
    public static int  Partition(int[] arr, int start, int end){

        int piviot=arr[end];
        int i=start-1;

        for(int j=start;j<=end-1;j++){
            if(arr[j]<piviot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=arr[end];
        arr[end]=temp;
        
         return i; //location of the piviotory
    }
}
