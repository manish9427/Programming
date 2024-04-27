public class  _Sorting {
    public static void main(String args[]){
        int arr [] = {1,2,3,2,3,3};

        // Selection Sort

        for(int i=0; i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min]=temp;

        }

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
