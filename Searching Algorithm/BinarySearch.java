// import java.util.Arrays;
// public class BinarySearch {
//     public static void main(String[] args){
//         int[] arr={1,3,9,-8,-6,15};
//         int target=9;
//         int index=-1;
//         Arrays.sort(arr);
//         for(int i:arr){
//             System.out.print(i+" ");
//         }
//         System.out.println();
//         index=Arrays.binarySearch(arr,target);
//         if(index!=-1){
//             System.out.println(arr[index]+ " " +index);
//         }
//     }
// }



// public class BinarySearch{

//     public static void main(String args[]){
//         int [] arr = {1,2,3,4,4,5,6,6,7,7,7,8,9};
//         int target= 7;

//         int left = 0;
//         int right = arr.length-1;

//         int result=-1;

//         while(left<=right){
//             int mid =left + (right-left)/2;

//             if(arr[mid]==target){
//                 result = mid;
//             }

//             if(arr[mid]<target){
//                 left=mid+1;
//             }else{
//                 right=mid-1;
//             }
//         }

//         if(result==-1){
//             System.out.println(target+" Not found");
//         }else{
//             System.out.println(target + " : "+ result);
//         }

//     }
// } 

public class BinarySearch{

    public static void main(String args[]){
        int [] arr = {1,2,3,4,4,5,6,6,7,7,7,8,9};
        int target= 7;

        int left = 0;
        int right = arr.length-1;

        int result=-1;

        while(left<=right){
            int mid =left + (right-left)/2;

            if(arr[mid]==target){
                result = mid;
            }

            if(arr[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }

        if(result==-1){
            System.out.println(target+" Not found");
        }else{
            System.out.println(target + " : "+ result);
        }

    }
} 
