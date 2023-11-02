/*
 * T.C => O(n)
 * S.C => O(1)
 */


// public class LinearSearch {
//     public static void main(String[] args) {
//         int[] arr= {1,2,3,4,5};
//         int find = 4;
//         int index=-1;
        
//         for(int i=0;i<arr.length;i++){
//             if(find==arr[i]){
//                 index=i;
//             }
//         }
//         if(index!=-1){
//             System.out.println("The element "+arr[index]+" is on index  "+index);
//         }
//         else{
//             System.out.println("The element "+arr[index]+" is not present in array");
//         }
//     }
// }

// for multiple element in array
// public class LinearSearch {
//     public static void main(String[] args) {
//         int[] myArray = {4, 2, 9, 7, 1, 5, 7, 7};
//         int elementToFind = 7;

//         System.out.print("Indices of element " + elementToFind + ": ");
//         boolean found = false; // A flag to track if the element was found at least once

//         for (int i = 0; i < myArray.length; i++) {
//             if (myArray[i] == elementToFind) {
//                 System.out.print(i + " ");
//                 found = true;
//             }
//         }

//         if (!found) {
//             System.out.println("Element " + elementToFind + " not found in the array.");
//         } else {
//             System.out.println(); // Print a newline after the indices
//         }
//     }
// }

class LinearSearch{
    public static void main(String args[]){
        int[] arr = {1,2,3,4,-8,-10};
        int target = -15;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println(arr[i] +" is at index "+i);
            }else{
                System.out.println("Not Found "+ target);
            }break;
        }
    }
}
