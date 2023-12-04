public class FindMinInRotatedArray {
    public static int findMin(int[] nums) {
        int low = 0, high = nums.length - 1;

        while (low < high) {
            int mid = (low + high) / 2;

            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return nums[low];
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int min = findMin(nums);
        System.out.println("Minimum element: " + min);
    }
}


/*
 Find Minimum in Rotated Sorted Array:
Time Complexity: O(log n)

Similar to the search algorithm, the find-minimum algorithm uses binary search. The time complexity is O(log n) because, in each iteration, the search space is reduced by half.
Space Complexity: O(1)

As with the search algorithm, the space complexity is constant. The algorithm doesn't use any extra space that grows with the input size.
 */