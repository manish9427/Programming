import java.util.Scanner;
public class $4_LargestNumber {
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
        System.out.println("the Array is:");
        int large=arr[0];
        for(int i=0;i<n;i++){
            if(large<arr[i]){
                large=arr[i];
            }
        }
        System.out.println("The largest element in the array is:"+large);
    }
}