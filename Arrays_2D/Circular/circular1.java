public class circular1 {
    public static void main(String args[]){
        int m=3;
        int n=3;
       int[][] arr = new int [m][n];
       int num=1;
       for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
            arr[i][j]=num;
            num++;
        }
       }  

       for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[i][j]);
        }
        System.out.println();
       }
    }
}
