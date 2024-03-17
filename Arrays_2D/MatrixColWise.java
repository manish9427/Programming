import java.util.*;
public class MatrixColWise {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Row: ");
        int m=sc.nextInt();
        System.out.print("Enter the Col: ");
        int n=sc.nextInt();
        int [][] arr = new int[m][n];
        int add =1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=add;
                add++;
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
