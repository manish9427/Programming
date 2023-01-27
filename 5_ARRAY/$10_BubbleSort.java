import java.util.Scanner;
public class $10_BubbleSort {
public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Input:-");
        System.out.print("Enter the size of Array:");
        int n=sc.nextInt();
        System.out.println("Enter the "+n+" element in Array:");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Output:-");
        int j=0; int i=0;int x=0;
        for(i=0;i<n-1;i++){
            for(j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    x=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=x;
                }
            }
        }
        for(i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
}