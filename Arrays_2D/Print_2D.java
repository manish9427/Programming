import java.util.Scanner;
public class Print_2D {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // int[][] arr = {
        //     {1,2,3,4},{5,6,7,8},{9,10,11,12}
        // };
        System.out.print("Enter row : ");
        int n=sc.nextInt();
        System.out.print("Enter Col : ");
        int m=sc.nextInt();
        int [][] arr =new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print("arr["+i+"]"+"arr["+j+"]: ");

                    arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("Output: ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                // System.out.println("i="+i+"j="+j);

                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
