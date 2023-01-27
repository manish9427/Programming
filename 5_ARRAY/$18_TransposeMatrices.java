// ---------------------------Simple approach-----------------------------

import java.util.*;
public class $18_TransposeMatrices {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int row=sc.nextInt();
        System.out.println("Enter the number of columns");
        int col=sc.nextInt();
        System.out.println("Enter the matrix");
        int[][] arr=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Output Matrix without Transpose");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Output Matrix with transpose");
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
}


