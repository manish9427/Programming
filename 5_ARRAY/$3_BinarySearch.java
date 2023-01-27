import java.util.Scanner;
public class $3_BinarySearch {
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
        System.out.print("Enter the element you want to search:");
        int search=sc.nextInt();
        System.out.println("\nOutput:-");
        int first=0;
        int last=n-1;
        int middle=(first+last)/2;
        while(first<=last){
            if(arr[middle]<search){
                first=middle+1;
            }
            else if(arr[middle]==search){
                System.out.println("The element is at position:"+middle);
                break;
            }
            else{
                last=middle-1;
            }
            middle=(first+last)/2;
        }
        if(first>last){
            System.out.println("Invalid Input");
        }
    }
}