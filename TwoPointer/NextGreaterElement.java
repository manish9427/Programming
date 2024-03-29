/*
Input Array:
4 5 2 10 8 
Next Greater Elements:
5 10 10 -1 -1
 */

// import java.util.Arrays;
// public class NextGreaterElement{
//     public static void main(String args[] ){
//         int[] arr ={1, 5 , 7 , 10 , -50};

//         int[] solution = Solution(arr) ;
//         System.out.println(Arrays.toString(solution));
//     }

//     public static int[] Solution (int[] arr){
//         int n=arr.length;
//         int[]  result = new int [n];

//         for(int i=0;i<n;i++){
//             result[i] = -1;
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[j]>arr[i]){
//                     result[i]=arr[j];
//                 }break;
//             }
//         }
//         return result;

//     }
// }


// tc= O(n^2)
// sc=O(1)

import java.util.Arrays;
public class NextGreaterElement{
    public static void main(String args[]){
        int[] arr={4,8,7,6,9,4,3};
        int[] ans=FindGreater(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] FindGreater(int[] arr){
        int ans[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i]=-1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    ans[i]=arr[j];
                }break;
            }
        }
        return ans;
    }
}