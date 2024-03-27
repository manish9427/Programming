/*
Input
123
456
789

Output
321
654
963


 */
import java.util.Scanner;
 class Patter3{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the Row: ");
        int m=sc.nextInt();
        System.out.print("Enter the Col: ");
        int n=sc.nextInt();

        int [][] arr =new int [m][n];

        // input
        System.out.print("Enter the Starting number of Array: ");
        int num=sc.nextInt();

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=num;
                num++;
            }
        }

        System.out.println("Input:- ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int row = arr.length;
        int col = arr[0].length;
        int newArr[][] = new int[row][col];

        for(int i=0;i<newArr.length;i++){
            for(int j=0;j<newArr[0].length;j++){
                newArr[i][j]
            }
        }
    }
 }