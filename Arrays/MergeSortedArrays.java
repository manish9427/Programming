import java.util.*;
public class MergeSortedArrays {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("size of arr1: ");
        int m=sc.nextInt();
        int[] arr1=new int[m];
        System.out.println("element of arr1: ");
        for(int i=0;i<m;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("size of arr2: ");
        int n=sc.nextInt();
        int[] arr2=new int[n];
        System.out.println("element of arr2: ");
        for(int i=0;i<m;i++){
            arr2[i]=sc.nextInt();
        }
        int[] merged = mergeSortedArrays(arr1,m, arr2,n);
        System.out.println(Arrays.toString(merged));
        
    }
    public static int[] mergeSortedArrays(int[] arr1,int m ,int[] arr2,int n) {
        int[] merged = new int[m + n];
        int i = 0, j = 0, k = 0;
    
        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                merged[k] = arr1[i];
                i++;
            } else {
                merged[k] = arr2[j];
                j++;
            }
            k++;
        }
    
        while (i < m) {
            merged[k] = arr1[i];
            i++;
            k++;
        }
    
        while (j < n) {
            merged[k] = arr2[j];
            j++;
            k++;
        }
    
        return merged;
    }
    
}

// TC= O(m+n)
// SC= O(m+n)