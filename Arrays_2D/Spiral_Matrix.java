import java.util.Scanner;
public class Spiral_Matrix {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the Size of array: ");
        int n=sc.nextInt();

        int arr[][] = new int[n][n];

        if(n<=0){
            System.out.println("Invalid Input Enter valid Number ");
        }

        int top = 0;
        int bottom = n-1;
        int left =0;
        int right =n-1;

        int num=1;

        while(top<=bottom && left<=right){
            //top
            for(int i=left;i<=right;i++){
                arr[top][i]=num;
                num++;
            }
            top++;

            // right
            for(int i=top;i<=bottom;i++){
                arr[i][right]=num;
                num++;
            }
            right--;

            // bottom
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    arr[bottom][i]=num;
                    num++;
                }
                bottom--;
            }

            //left
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    arr[i][left]=num;
                    num++;
                }
                left++;
            }


        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
