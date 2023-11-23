import java.util.Arrays;
public class RotateLeft {
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5};
        int k=3;
        SolveRotateLeft(arr,k);
        System.out.println(Arrays.toString(arr));
    }

    // public static void SolveRotateLeft(int[] arr , int k){
    //     int n= arr.length;
    //     for (int i = 0; i < k; i++) {
    //         int temp = arr[0];
    //         for (int j = 0; j < n - 1; j++) {
    //             arr[j] = arr[j + 1];
    //         }
    //         arr[n - 1] = temp;
    //     }
    // }

    public static void SolveRotateLeft(int[] arr,int k){
        int n= arr.length;
        for(int i=0;i<k;i++){
            int lastElement=arr[n-1];

            for(int j=n-1;j>0;j--){
                arr[j]=arr[j-1];
            }

            arr[0]=lastElement;
        }
    }
}
