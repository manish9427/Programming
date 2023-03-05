import java.util.*;
public class $20_Input3D{
    
    public static void  printArray(int arr[][][]){
        for(int i=0;i<arr[0][0].length;i++){
            for(int j=0;j<arr[0].length;j++){
                for(int k=0;k<arr.length;k++){
                    System.out.println("arr["+i+"]["+j+"]["+k+"]="+arr[i][j][k]+"\t");
                }System.out.print("\n");
            }
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of test case: ");
        int t=sc.nextInt();
        while(t-->0){
            System.out.print("How many element in 1D Array: ");
            int n=sc.nextInt();
            System.out.print("How many 1D array: ");
            int m=sc.nextInt();
            System.out.print("How many 2D array: ");
            int o=sc.nextInt();
     
            int[][][] arr=new int [n][m][o];
            for(int i=0;i<o;i++){
                for(int j=0;j<m;j++){
                    for(int k=0;k<n;k++){
                        arr[i][j][k]=sc.nextInt();
                    }
                }
            }

            System.out.println("Output of Array:");
            printArray(arr);
        }

    }
}
