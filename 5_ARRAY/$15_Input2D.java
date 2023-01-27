// import java.util.*;

// public class $15_Input2D {
//     public static void main(String [] args){
//         Scanner sc=new Scanner(System.in);
//         int[][] arr={{1,2},{3,4},{5,6},{7,8}}; //[row] [col] how many number you want to enter
//         for(int i=0;i<4;i++){
//             for(int j=0;j<2;j++){
//                 System.out.println("arr["+i+"]["+j+"]="+arr[i][j]);
//             }
//         }
//     }
// }



// ------------------------------------user input-------------------------------------
import java.util.*;
public class $15_Input2D {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int row=sc.nextInt();
        System.out.println("Enter the number of col");
        int col=sc.nextInt();

        int [][] arr=new int[row][col];
        System.out.println("Enter the elements");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("output is");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.println("arr["+i+"]["+j+"]="+arr[i][j]);
            }
        }
    }
}