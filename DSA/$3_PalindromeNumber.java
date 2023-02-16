// import java.util.*;
// public class $3_PalindromeNumber {
//     public static boolean ispalindrome(int n,int [] arr){
//         int [] arr2=new int[n];
//         for(int i=n-1;i>=0;i--){
//             arr2[i]=arr[i];
//         }
//     }


//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the size of array:");
//         int n=sc.nextInt();
//         int[] arr =new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         if(ispalindrome(n,arr)){
//             System.out.println("Palindrome");
//         }else{
//             System.out.println("Not Palindrome");
//         }
//     }
// }
import java.util.*;
public class $3_PalindromeNumber {
    public static boolean checkPalindrome(String s,int n){
        int start=0;
        int end=n-1;
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the letter:");
        String str=sc.nextLine();
        int num=str.length();
        if(checkPalindrome(str,num)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
