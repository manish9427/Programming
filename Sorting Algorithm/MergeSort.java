/*
 * recursively divides the array in 2 , sort, re-combine
 * T.C => O(nlog(n))
 * S.C => O(n)
 */


import java.util.*;
public class MergeSort{
    public static void main(String args[]){
        int arr [] = {4,2,4,2,4,2,4,2};
        MergeSortFun(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void MergeSortFun(int arr[]){
        int length=arr.length;
        if(length<=1) return;
        int middle=length/2;
        int[] leftArray=new int [ middle];
        int[] rightArray=new int [ length-middle];

        // indices

        int i=0; // left array
        int j=0; // right array

        for(;i<length;i++){
            if(i<middle){
                leftArray[i] = arr[i];
            }else{
                rightArray[j] = arr[i];
               j++; 
            }
        }
        MergeSortFun(leftArray);
        MergeSortFun(rightArray);
        Merge(leftArray, rightArray,arr);

    }

    public static void Merge(int[] leftArray, int[] rightArray, int[] arr){

        int leftSize=arr.length/2;
        int rightSize=arr.length-leftSize;

        int i=0,l=0,r=0; // indices

        while(l<leftSize && r<rightSize){
            if(leftArray[l]<rightArray[r]){
                arr[i]=leftArray[l];
                i++;
                l++;
            }else{
                arr[i]=rightArray[r];
                i++;
                r++;
            }
        }
        while(l<leftSize){
            arr[i]=leftArray[l];
            i++;
            l++;
        }

        while(r<rightSize){
            arr[i]=rightArray[r];
            i++;
            r++;
        }
    }
}

