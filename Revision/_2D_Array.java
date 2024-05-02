import java.util.*;
public class _2D_Array {
    public static void main(String args[]){
        // Zig Zag
        int n=3;
        int[][] arr = new int [n][n];
        int num=1;
        for(int i=0;i<arr.length;i++){
            for(int j =0;j<arr[0].length;j++){
                arr[i][j]=num;
                num++;
            }
        }
        int Array [][] =new int[n][n];
        boolean flag = true;
        int k=0;
        for(int i=0;i<n;i++){
            if(flag){
                for(int j=0;j<n;j++){

                    Array[i][j]=arr[k][j];
                }
            }else{

                for(int j=n-1;j>=0;j--){
                    Array[i][j]=arr[k][n-1-j];
                }
            }
            k++;
            flag=!flag;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(Array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
