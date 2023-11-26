import java.util.*;
class FibonacciSeries{
    public static void main(String args[]){
        int first = 0;
        int second =1;
        int len=10; // 0 1 1 2 3 --> output

        int [] output = Solution(first,second,len);
        System.out.println(Arrays.toString(output));
    }

    public static int[] Solution(int first,int second,int len){
        int[] ans = new int[len];
        ans[0]=first;
        ans[1]=second;
        for(int i=2;i<len;i++){
            ans[i]=ans[i-1]+ans[i-2];
        }
        return ans;
    }
}