// class Fibonacci{
//     public static void main(String args[]){
//         int n=5;
         
//         int[] ans = Solution(n);

//         for(int i=0;i<ans.length;i++){
//             System.out.print (ans[i]+" ");
//         }
//     }


//     public static int[] Solution(int n){
//         int[] ans= new int [n];

//         if(n>=1){
//             ans[0]=0;
//         }

//         if(n>=2){
//             ans[1]=1;
//         }

//         for(int i=2;i<n;i++){
//             ans[i]=ans[i-1]+ans[i-2];
//         }

//         return ans;
//     }
// }

import java.util.*;

public class FibonacciNumber {
    public static void main(String args[]) {
        int n = 6;
        int first = 0;
        int second = 1;

        int[] ans = new int[n];
        if(n>=1){
            ans[0] = first;
        }
        if(n>=2){
            ans[1] = second;
        }

        for (int i = 2; i < n; i++) {
            ans[i] = ans[i - 1] + ans[i - 2];
        }

        System.out.println(Arrays.toString(ans));
    }
}
