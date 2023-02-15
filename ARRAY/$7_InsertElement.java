/*-----------------insert the element  at the end of the array--------------*/

import java.util.Scanner;
public class $7_InsertElement {
public static void main(String[] args){
        int i=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Input:-");
        System.out.print("Enter the size of the Array:");
        int n=sc.nextInt();
        System.out.println("Enter your "+n+" element:");
        int[] arr=new int[n+1];
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Output:-");
        System.out.print("Enter the element you want to add:");
        int m=sc.nextInt();
        arr[i]=m;
        for(i=0;i<=n;i++){
            System.out.println(arr[i]);
        }
    }
}