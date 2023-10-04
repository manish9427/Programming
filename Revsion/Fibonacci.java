import java.util.*;
public class Fibonacci {

 public static void main(String args[]){
    int first = 0;
    int second=1;
    int n=10;
    // 0 1 1 2 3 --> output

    int[] arr=FibonacciFun(first,second,n);
    System.out.println(Arrays.toString(arr));
    
}   
    public static int[] FibonacciFun(int first,int second,int n){
        int[] arr = new int[n];
        arr[0]= first;
        arr[1]= second;
        for(int i=2;i<n;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr;
    }
}


/*
 * TC O(n)
 * SC O(n)
 */