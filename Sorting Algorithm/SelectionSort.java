// // time complexity = > O(n^2) and space Complexity => O(1)

// import java.util.*;
// public class SelectionSort {
//     public static void main(String args[]){
//         int arr[] = { 5, 8, -7, -4, 10, 9 };
//         Solution(arr);
//         System.out.println(Arrays.toString(arr));
//     }

//     public static void Solution(int arr[]){
//         for(int i=0;i<arr.length-1;i++){
//             int min = i; 
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[j]<arr[min]){
//                     min=j;
//                 }
//             } 
//             int temp=arr[min];
//             arr[min]=arr[i];
//             arr[i]=temp;
//         }
//     }
// }

// import java.util.*;
// public class SelectionSort{
//     public static void main(String args[]){
//         int[] arr={9,8,7,6,5,4,3,2,1};
//         for(int i:arr){
//             System.out.print(i+" ");
//         }
//         // System.out.print("\n");
//         System.out.println();
//         // Arrays.sort(arr);
//         SortArray(arr);
//         System.out.println(Arrays.toString(arr));
//     }
//     public static void SortArray(int[] arr){
//         int n=arr.length;
//         for(int i=0;i<n-1;i++){
//             int min=i;
//             for(int j=i+1;j<n;j++){
//                 if(arr[j]<arr[min]){
//                     min=j;
//                 }
//             }
//             int temp=arr[min];
//             arr[min]=arr[i];
//             arr[i]=temp;
//             System.out.println(Arrays.toString(arr));
//         }
//     }
// }

class SelectionSort{
    public static void main(String args[]){
        int[] arr ={3,2,3,4,2,3,4,4,4,1};
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j =i+1; j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp = arr[i];
            arr[i]= arr[min];
            arr[min]=temp;
        }
        // for(int i=0;i<arr.length;i++){

            // System.out.print(arr[i]+" ");
            System.out.print(arr.toString());
        // }
    }
}