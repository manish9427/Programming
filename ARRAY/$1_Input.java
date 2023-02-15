import java.util.Scanner;
public class $1_Input{
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
        System.out.println("Output:-");
        System.out.println("the Array you have provided is:");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}