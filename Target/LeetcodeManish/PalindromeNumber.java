/*
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
 */


public class PalindromeNumber {
    public static void main(String args[]){
        int x=121;

        if(isPalindrome(x)){
            System.out.println("Palindrome");
        }else{
            System.out.println("not a palindrome");
        }
    }
    public static boolean isPalindrome(int x) {
        String str=String.valueOf(x);
        String  rev="";
        for(int i=0;i<str.length();i++){
             rev=str.charAt(i)+rev;
        }
        if(rev.equals(str)){
            return true;
        }else{
            return false;
        }
    } 
}
