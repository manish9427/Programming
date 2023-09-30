// time complexity = > O(n^2) and space Complexity => O(1)

import java.util.*;
public class SelectionSort {
    public static void main(String args[]){
        int arr[] = { 5, 8, -7, -4, 10, 9 };
        Solution(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void Solution(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int min = i; 
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            } 
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }
}
