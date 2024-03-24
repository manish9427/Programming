/*
Z
 123
 456
 789
Z - Rotate 90 anticlockwise
 369
 256
 147
 */
import java.util.*;
public class Rotate_Z {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the row: ");
        int m=sc.nextInt();
        System.out.print("Enter the row: ");
        int n=sc.nextInt();
        int [][] arr =new int[m][n];
        int num=1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=num;
                num++;
            }
        }
        System.out.println("Input :-");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        int row = arr.length;
        int col = arr[0].length;
        int [][] newArray = new int[col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                newArray[col-1-j][i]=arr[i][j];
            }
        }
        System.out.println("Output :-");
        for(int i=0;i<newArray.length;i++){
            for(int j=0;j<newArray[0].length;j++){
                System.out.print(newArray[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
