import java.util.*;
public class $7_QuickSort{
    public static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int partition(int [] arr,int low,int high){
        int pivot=arr[high];
        int i=(low-1);
        for(int j=low;j<=high-1;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j)
            }
        }
        swap(arr,i+1,high);
        return(i+1);

    }
    public static void quickSort(int[] arr,int low,int high){
        if(low<high){
            int pi=partition(arr,low,high);
            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,high);
        }
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number of testCases: ");
        int t=sc.nextInt();
        while(t-->0){
            System.out.print("\nEnter the size of the Array: ");
            int n=sc.nextInt();
            System.out.println("Enter the Elements of Array:");
            int [] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            //Calling QuickSort method

            quickSort(arr,0,n-1);

            System.out.println("Output:-");
            printArray(arr);
        }
    }
}