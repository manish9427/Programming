/*
 Remove Duplicates from sorted array
 input => [1,1,2]
 output => 2 
 */
// --------------------------------------------------------------------------------------------

public class RemoveDuplicates {
    public static void main(String args[]){
        int[] arr={1,1,2};
        int ans=removeDuplicates(arr);
        System.out.println(ans);
    }
    public static int removeDuplicates(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=nums[j]){
                nums[++j]=nums[i];
            }
        }return ++j;
    }    
}
// ----------------------BRUTE FORCE--------------------------
// public int removeDuplicates(int[] nums) {
//     int n = nums.length;
//     if (n == 0) {
//         return 0;
//     }

//     int index = 1; // Index of the next unique element

//     for (int i = 1; i < n; i++) {
//         if (nums[i] != nums[i - 1]) {
//             nums[index] = nums[i];
//             index++;
//         }
//     }

//     return index;
// }

// TC=>O(n^2)
// SC=>O(1)




// -----------------------TWO POINTER-------------------------
// public int removeDuplicates(int[] nums) {
//     if (nums.length == 0) {
//         return 0;
//     }

//     // Use two pointers: one to iterate the array, and one to mark the position for unique elements
//     int i = 0;

//     for (int j = 1; j < nums.length; j++) {
//         // If the current element is different from the previous element, update the pointer and assign the current element to that position
//         if (nums[j] != nums[i]) {
//             i++;
//             nums[i] = nums[j];
//         }
//     }

//     // The unique elements are from index 0 to i (inclusive)
//     return i + 1;
// }


// TC=>O(n)
// SC=>O(1)

