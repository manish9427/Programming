/*Given an integer n, return true if it is a power of two. Otherwise, return false.

An integer n is a power of two, if there exists an integer x such that n == 2^x.

 

Example 1:

Input: n = 1
Output: true
Explanation: 20 = 1

Example 2:

Input: n = 16
Output: true
Explanation: 24 = 16

Example 3:

Input: n = 3
Output: false
 

Constraints:

-231 <= n <= 231 - 1
 

Follow up: Could you solve it without loops/recursion?*/

import java.util.*;
class $5_PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
		// int count = 0;
		// while(n > 0){
		// 	if (n % 2 == 1) count++;
		// 	n = n/2;
		// }
		// return count == 1;
        // -------------------------------------------
        // if (n == 0)
        //     return false;
    
        // while (n != 1) {
        //     if (n % 2 != 0)
        //         return false;
        //     n = n / 2;
        // }
        // return true;
        // --------------------------------------------
        if(n<=0){
            return false;
        }
        while(n>1){
            if (n % 2 != 0)
                return false;
            n = n / 2;
        }return true;
    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enetr the number: ");

        int n=sc.nextInt();
        if(isPowerOfTwo(n)){
            System.out.println("Number is a power of two");
        }
        else{
            System.out.println("Number is not a power of two");

        }
    }
}
