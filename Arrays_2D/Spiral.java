import java.util.Scanner;

public class Spiral {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Row: ");
        int m = sc.nextInt();
        System.out.print("Enter the Col: ");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        int num = 1;
        
        // Filling the array
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = num++;
            }
        }
        
        // Printing the input array
        System.out.println("Input:- ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Output:- ");
        
        int rows = arr.length;
        int cols = arr[0].length;
        int top = 0, bottom = rows - 1, left = 0, right = cols - 1;

        while (top < bottom && left < right) {
            int prev = arr[top + 1][left];
            // Move elements of top row one step right
            for (int i = left; i <= right; i++) {
                int curr = arr[top][i];
                arr[top][i] = prev;
                prev = curr;
            }
            top++;

            // Move elements of rightmost column one step downwards
            for (int i = top; i <= bottom; i++) {
                int curr = arr[i][right];
                arr[i][right] = prev;
                prev = curr;
            }
            right--;

            // Move elements of bottom row one step left
            for (int i = right; i >= left; i--) {
                int curr = arr[bottom][i];
                arr[bottom][i] = prev;
                prev = curr;
            }
            bottom--;

            // Move elements of leftmost column one step upwards
            for (int i = bottom; i >= top; i--) {
                int curr = arr[i][left];
                arr[i][left] = prev;
                prev = curr;
            }
            left++;
        }
    }
}
