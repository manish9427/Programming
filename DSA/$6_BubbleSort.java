import java.util.*;
public class $6_BubbleSort {
    public static void swap(int arr[] ,int j,int k){
        int temp=arr[j];
        arr[j]=arr[k];
        arr[k]=temp;
    }
    public static void bubbleSort(int [] arr,int n){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    // int temp=arr[j];
                    // arr[j]=arr[j+1];
                    // arr[j+1]=temp;
                    swap(arr,j,j+1);
                }
            }
        }
    }
    public static void printArray(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of test cases: ");
        int t=sc.nextInt();


        while(t>0){
            System.out.print("\nEnter the size of array: ");
        int n=sc.nextInt();
        System.out.println("Enter the array elements:");

        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        //calling the sorting function
        bubbleSort(arr,n);


        //printing the array
        System.out.println("Output-");
        printArray(arr);
            t--;
        }
        
    }
}
