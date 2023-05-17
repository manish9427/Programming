/*
 Remove Duplicates from sorted array
 input => [1,1,2]
 output => 2 
 */

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
