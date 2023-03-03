public class $5_SmallestNumber {
    public static void main(String[] args){
        int arr[]={10,20,30};
        int small=arr[0];
        for(int i=0;i<arr.length;i++){
            if(small>arr[i]){
                small=arr[i];
            }
        }
        System.out.println("smallest number is "+small);

    }
}
// import java.util.Scanner;
// public class $5_SmallestNumber {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Input:-");
//         System.out.print("Enter the size of the Array:");
//         int n=sc.nextInt();
//         System.out.println("Enter the "+n+" element in array:");
//         int[] arr=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         System.out.println("Output:-");
//         System.out.println("the Array is:");
//         int small=arr[0];
//         for(int i=0;i<n;i++){
//             if(small>arr[i]){
//                 small=arr[i];
//             }
//         }
//         System.out.println("The smallest element in the array is:"+small);
//     }
// }