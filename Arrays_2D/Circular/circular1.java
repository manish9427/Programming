import java.util.Scanner;
public class circular1 {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the Row: ");
        int m=sc.nextInt();
        System.out.print("Enter the Col: ");
        int n=sc.nextInt();
       int[][] arr = new int [m][n];
       int num=1;
       for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
            arr[i][j]=num;
            num++;
        }
       }  
       System.out.println("Input:- ");
       for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
       }
    }
}
