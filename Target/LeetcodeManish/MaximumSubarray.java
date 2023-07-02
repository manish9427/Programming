public class MaximumSubarray {
    public static void main(String args[]){
        int [] arr={1,-1,3,2};
        System.out.println(maximumSum(arr));
    }

    public static int maximumSum(int arr[]){
        if(arr==null||arr.length==0){
            return 0;
        }

        int maxSum=arr[0];
        int currSum=arr[0];

        for(int i=1;i<arr.length;i++){
            currSum=Math.max(arr[i],currSum+arr[i]);
            maxSum=Math.max(maxSum,currSum);
        }
        return maxSum;

    }
}
