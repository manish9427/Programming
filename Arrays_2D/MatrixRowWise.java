public class MatrixRowWise{
    public static void main(String args[]){
        int m=3, n=4;
        int [][] arr = new int [m][n];
        int num=1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=num;
                num++;
            }
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}