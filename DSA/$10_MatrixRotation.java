/*Input
  1 2 3
  4 5 6 
  7 8 9 */

/*Output
  3 6 9
  2 5 8
  1 4 7 */
//   ----------------------------------------------------------------------------
import java.util.*;
public class $10_MatrixRotation{
    public static void rotateMatrix(int arr[][],int n,int m){
        for(int i=0;i<n;i++){
            for(int j=0; j<m;j++){
                System.out.print(arr[i][j]+" ");
            }System.out.println();
        }
    }
    public static void printArray(int arr[][],int n,int m){
        for(int i=0;i<n;i++){
            for(int j=0; j<m;j++){
                System.out.print(arr[i][j]+" ");
            }System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Test Cases: ");
        int t=sc.nextInt();
        while(t-->0){
            System.out.println("Enter the Number of rows:");
            int n=sc.nextInt();
            System.out.println("Enter the Number of columns:");
            int m=sc.nextInt();
            System.out.println("Enter the Elements of Matrix:");
            int arr[][]=new int [n][m];
            for(int i=0;i<n;i++){
                for(int j=0; j<m;j++){
                    arr[i][j]=sc.nextInt();
                }
            }
            System.out.println("Output:-");
            printArray(arr,n,m);
            rotateMatrix(arr,n,m);
        }
    }
}
