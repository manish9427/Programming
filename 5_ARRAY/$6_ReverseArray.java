import java.util.Scanner;
public class $6_ReverseArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Input:-");
        System.out.print("Enter the size of the Array:");
        int n=sc.nextInt();
        System.out.println("Enter the "+n+" element in array:");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Output:-");
        System.out.print("the Original Array is:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("\n the Reverse Array is:");
        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}