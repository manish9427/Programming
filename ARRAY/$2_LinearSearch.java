// import java.util.Scanner;
// public class $2_LinearSearch {
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
//         System.out.print("Enter the element you want to search:");
//         int num=sc.nextInt();
//         int pos=0;
//         for(int i=0;i<n;i++){
//             if(num==arr[i]){
//                 pos=i+1;
//                 break;
//             }
//         }
//         System.out.println("\nOutput:-");
//         if(pos==0){
//             System.out.println("Element not found");
//         }else{
//             System.out.println("the Element "+num+" is present at position:"+pos);
//         }
//     }
// }

// ------------------------------For Duplicate Array----------------------//
import java.util.Scanner;
public class $2_LinearSearch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Input:-");
        System.out.print("Enter the size of the Array:");
        int n=sc.nextInt();
        System.out.println("Enter the "+n+" element in array:");
        int[] arr=new int[n];
        int[] pos=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the element you want to search:");
        int num=sc.nextInt();
        int posIndex=0;
        for(int i=0;i<n;i++){
            if(num==arr[i]){
                pos[posIndex]=i+1;
                posIndex++;
            }
        }
        System.out.println("\nOutput:-");
        if(posIndex==0){
            System.out.println("Element not found");
        }
        else if(posIndex==1){
            System.out.println("the Element "+num+" is present at position:"+pos[0]);
        }
        else{
            System.out.println("the Element "+num+" is present at position:");
            for(int i=0;i<posIndex;i++){
                System.out.print(pos[i]+" ");
            }
        }
    }
}
