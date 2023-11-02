//--------------------------------- Container With Most Water
/*
 * You are given an array of non-negative integers representing a line where the width of each bar
   is 1 and the height of each bar is the value in the array. You need to find two bars, such that 
   together with the x-axis they form a container that can hold the most water.

 * Write a function to determine the maximum area of water that can be contained.

 * For example, given the array [1, 8, 6, 2, 5, 4, 8, 3, 7], the function should return 49, 
   as the container formed between the second and ninth bars can hold the most water
   (7 units of height * 7 units of width = 49 square units of area).
 */
public class MaximumArea{
    public static void main(String[] args){
        int[] height={1, 8, 6, 2, 5, 4, 8, 3, 7};

        int maxArea = maxArea(height);
        System.out.println("Maximum Area: " + maxArea);
    }
    public static  int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;
    
        while (left < right) {
            int h = Math.min(height[left], height[right]);
            int w = right - left;
            int area = h * w;
            maxArea = Math.max(maxArea, area);
    
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
    
        return maxArea;
    }
    
}




/*
maximum area
=> compulsory thing
array  

left = 0;
right = array.length-1;
while loop (left < right)

arr[left]
arr[right]
left ++
right ++
 */