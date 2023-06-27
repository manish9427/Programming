/*
 * Array => arr[]={}
 * Target => 
 * Output => index position of those number from the number
 */

public class TwoSum {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        int target = 9;
        int answer[] =  solution(arr,target);
        if(answer != null){

            System.out.print(answer[0],answer[1]);
        }
    }
    public int[] solution(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<target;j++){
                if(arr[i]+arr[j]==target){
                    int ans[]={i,j};
                    return ans;
                }
            }
        }return null;
    }
}
