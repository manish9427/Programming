public class ZigZag1 {
    public static void main(String args[]){
        int m=3;
        int [][] arr =new int[m][m];
        int num=1;
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=num;
                num++;
            }
        } 
        System.out.println("Input");
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

        /*
         Output
         123
         654
         789
         */
        int [][] newArr = new int[m][m];
         boolean flag = true;
         int k=0;
         for(int i=0;i<m;i++){
            if(flag){
                for(int j=0;j<m;j++){
                    newArr[i][j]=arr[k][j];
                }
            }else{
                for(int j=m-1;j>=0;j--){
                    newArr[i][j]=arr[k][m-1-j];
                }
            }
            k++;
            flag=!flag;
         }
         System.out.println("Output");
         for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                System.out.print(newArr[i][j]+" ");
            }
            System.out.println();
         }
    }
}