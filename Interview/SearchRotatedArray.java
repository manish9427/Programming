public class SearchRotatedArray {
    public static int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && target <= nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (nums[mid] <= target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int result = search(nums, target);
        System.out.println("Index of " + target + ": " + result);
    }
}


/*
 
Let's analyze the time and space complexity for the provided Java solutions:

Search in Rotated Sorted Array:
Time Complexity: O(log n)

The algorithm uses binary search, which has a time complexity of O(log n) for a sorted array. 
The search space is effectively reduced in half with each iteration.
Space Complexity: O(1)

The algorithm uses only a constant amount of extra space, regardless of the input size. 
It doesn't use any additional data structures that scale with the input.
 */