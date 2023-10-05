/*
 * recursively divides the array in 2 , sort, recombine
 * T.C => O(nlog(n))
 * S.C => O(n)
 */


import java.util.*;
public class MergeSort{
    public static void main(String args[]){
        int[] arr={-8,4,19,10,-15,20,10};
        MergeSortFun(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void MergeSortFun(int arr[]){
        int length=arr.length;
        if(length<=1) return;
    }
}