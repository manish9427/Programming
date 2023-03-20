// sort an array with 0's 1's and 2's only element


import java.util.Scanner;
public class sort{
    public static void sortArray(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
    
        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Input:-");
        System.out.print("Enter the size of the Array:");
        int size=sc.nextInt();
        System.out.println("Enter the "+size+" element in array:");
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        sortArray(arr);
        System.out.println("Output:-");
        System.out.println("the Array you have provided is:");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

