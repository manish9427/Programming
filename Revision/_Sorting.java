import java.util.Arrays;

public class  _Sorting {
    public static void main(String args[]){
        int arr [] = {1,2,3,2,3,3};

        // Selection Sort
        // for(int i=0;i<arr.length-1;i++){
        //     int  min = i;
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[j]<arr[min]){
        //             min = j;
        //         }
        //     }
        //     int temp = arr[min];
        //     arr[min]=arr[i];
        //     arr[i]=temp;
        // }

        // Bubble Sort
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[j]<arr[i]){
        //             int temp =arr[i];
        //             arr[i]=arr[j];
        //             arr[j]=temp;
        //         }
        //     }
        // }

        // Insertion Sort
        for(int i=1;i<arr.length;i++){
            int temp =arr[i];
            int j=i-1;

            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }


        System.out.println(Arrays.toString(arr));
    }
}
