import java.util.Scanner;
public class $9_MergeTwoArrays {
public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Input:-");
        System.out.print("Enter the size of first Array:");
        int n=sc.nextInt();
        System.out.println("Enter the "+n+" element in first array:");
        int[] arr1=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.print("Enter the size of second Array:");
        int m=sc.nextInt();
        System.out.println("Enter the "+m+" element in second array:");
        int[] arr2=new int[m];
        for(int i=0;i<m;i++){
            arr2[i]=sc.nextInt();
        }
        System.out.println("Output:-");
        int o=n+m;
        int j=0;
        int arr3[]=new int[o];
        for(int i=0;i<n;i++){
            arr3[j]=arr1[i];
            j++;
        }
        for(int i=0;i<m;i++){
            arr3[j]=arr1[i];
            j++;
        }
        for(int i=0;i<o;i++){
            System.out.println(arr3[i]);
        }
    }
} 
