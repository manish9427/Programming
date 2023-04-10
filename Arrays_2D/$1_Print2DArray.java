package Arrays_2D;

import java.util.*;
public class $1_Print2DArray {
    public static void printArray(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of test cases: ");
        int t=sc.nextInt();
        while(t-->0){
            System.out.println("Enter the number of rows: ");
            int n = sc.nextInt();
            System.out.println("Enter the number of col: ");
            int m = sc.nextInt();
            System.out.println("Enter the Elements of row: ");
            int arr[][]=new int[n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    arr[i][j]=sc.nextInt();
                }
            }
            System.out.println("Output: ");
            printArray(arr);
        }
    }
}
