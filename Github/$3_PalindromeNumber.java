import java.util.*;
public class $3_PalindromeNumber {
    public static boolean ispalindrome(int [] a,int n){


    int[] b = new int[n];
    int j = n;
    for (int i = 0; i < n; i++) {
        b[j - 1] = a[i];
        j = j - 1;
    }

    // printing the reversed array

    for (int  k = 0; k < n; k++ ) {
        System.out.print(b[k]+" ");
    }

    for (int  k = 0; k < n; k++ ) {
        if(b[k]!=a[k]){
            return false;
        }
    }return true;
}


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n=sc.nextInt();
        int[] arr =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(ispalindrome(arr,n)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}


// import java.util.*;
// public class $3_PalindromeNumber {
//     public static boolean checkPalindrome(String s,int n){
//         int start=0;
//         int end=n-1;
//         while(start<=end){
//             if(s.charAt(start)!=s.charAt(end)){
//                 return false;
//             }
//             start++;
//             end--;
//         }return true;
//     }
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the letter:");
//         String str=sc.nextLine();
//         int num=str.length();
//         if(checkPalindrome(str,num)){
//             System.out.println("Palindrome");
//         }else{
//             System.out.println("Not Palindrome");
//         }
//     }
// }
