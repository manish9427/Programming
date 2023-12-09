import java.util.Arrays;

class FibonacciSeries{
    public static void main(String args[]){
        int first=0;
        int second =1;
        int n=6;

        int[] ans = Solution(first,second,n);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] Solution (int first, int second, int n ){
        int[] ans = new int[n];
        ans[0]=first;
        ans[1]=second;
        for(int i=2;i<n;i++){
            ans[i]=ans[i-1]+ans[i-2];
        }
        return ans;
    }
}