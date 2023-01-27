import java.util.*;
public class $17_SubMatrices {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows");
        int row=sc.nextInt();
        System.out.println("Enter the columns");
        int col=sc.nextInt();
        System.out.println("Enetr the first matrix");
        int [][] arr1=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the second matrix");
        int [][] arr2=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        System.out.println("Output");
        int [][] arr3=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr3[i][j]=arr1[i][j]-arr2[i][j];
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }    
    }
}
