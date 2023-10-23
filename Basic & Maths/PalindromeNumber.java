// public class PalindromeNumber {
//     public static void main(String gargs[]){
//         int num=121;
//         int original=num;
//         int rev=0;
//         while(num!=0){
//             int last=num%10;
//             rev=rev*10+last;
//             num=num/10;
//         }
//         // System.out.println(rev);
//         // System.out.println(num);
//         if(rev==original){
//             System.out.println("Palindrome");
//         }else{
//             System.out.println("Not Palindrome");
//         }
//     }
// }


public class PalindromeNumber{
    public static void main(String args[]){
        int n=121;
        System.out.println(n);
        int value=n;
        int ans=0;
        while(n>0){
            int rem=n%10;
            ans=ans*10+rem;
            n=n/10;
        }
        System.out.println(n);
        System.out.println(value);
        System.out.println(ans);
        if(ans==value){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}