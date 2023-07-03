/* 
-----------------------------Search In Roated Sorted Array---------------------------
Example 1:

Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
Example 2:

Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1
Example 3:

Input: nums = [1], target = 0
Output: -1
*/

function Search(nums, target) {
  for (let i = 0; i < nums.length; i++) {
    if (nums[i] === target) {
      return i;
    }
  }
  return -1;
}

let nums = [4, 5, 6, 7, 0, 1, 2];
let target = 3;

console.log(Search(nums, target));

// Linear Search --> O(n)
// Binary Search --> O(log n)
