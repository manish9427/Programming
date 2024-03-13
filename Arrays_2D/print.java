public class print {
    public static void main(String args[]){
        int[][] arr = {
            {1,2,3,4},{5,6,7,8}
        };
        for(int i=0;i<arr.length;i++){ //i=1
            for(int j=0;j<arr[i].length;j++){ // j=0
                System.out.println("i="+i+"j="+j);

                // System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
