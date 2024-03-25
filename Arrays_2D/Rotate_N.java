import java.util.Scanner;
class Rotate_N{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the row: ");
        int m=sc.nextInt();
        System.out.print("Enter the col: ");
        int n=sc.nextInt();
        int[][] arr = new int[m][n];
        int num=1;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=num;
                num++;
            }
        }
        int row = arr.length;
        int col = arr[0].length;
        int [][] newArr = new int [col][row];
        for(int i=0;i<newArr.length;i++){
            for(int j=0;j<newArr[0].length;j++){
                newArr[i][j]=arr[j][i];
            }
        }
        for(int i=0;i<newArr.length;i++){
            for(int j=0;j<newArr[0].length;j++){
                System.out.print(newArr[i][j]+" ");
            }
            System.out.println();
        }
    }
}