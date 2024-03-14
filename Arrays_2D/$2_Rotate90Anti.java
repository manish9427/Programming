import java.util.*;
public class $2_Rotate90Anti {

    public static void  rotateMatrix(int[][] matrix){
	int n = matrix.length;
    for (int i=0;i<n/2;i++){
        for (int j=i;j<n-i-1;j++){
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][n-i-1];
            matrix[j][n-i-1] = matrix[n-i-1][n-j-1];
            matrix[n-i-1][n-j-1] = matrix[n-j-1][i];
            matrix[n-j-1][i] = temp;
        }
    }
    }
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
            System.out.println("Enter the Elements of matrix: ");
            int arr[][]=new int[n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){

                    arr[i][j]=sc.nextInt();
                }
            }
            System.out.println("Output: ");
            System.out.println("original matrix: ");
            
            printArray(arr);
            rotateMatrix(arr);
            System.out.println("Rotated matrix: ");
            printArray(arr);

        }
    }
}
