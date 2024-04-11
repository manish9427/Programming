// class PrimeNum{
//     public static void main(String args[]){
//         int num = 17;
//         if(Solution(num)){
//             System.out.println(num+" Prime");
//         }else{
//             System.out.println(num+" is Non Prime");
//         }
//     }
//     public static boolean Solution(int num){  
//         if(num<=1){
//             return false;
//         }

//         for(int i=2;i*i<=num;i++){ 
//             if(num%i==0){     
//                 return false;
//             }
//         }
//         return true;
//     }
// }

import java.util.Scanner;
class PrimeNum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();

        boolean isPrime=true;
        for(int i=2;i<=Math.sqrt(n);i++){
        // for(int i=2;i*i<=n;i++){
            if(n%i==0){
                isPrime=false;
            }
        }
        if(isPrime){
            System.out.println(n + " is a Prime Number");
        }else{
            System.out.println(n + " is not a Prime Number");
        }
    }
}

/*
 The condition i * i < n is used in the loop to check if i is less than the square root of n. This is done for optimization purposes.

When i is greater than the square root of n, the loop doesn't need to continue because if n has a divisor, it must be smaller than its square root. If there's no divisor found up to the square root, then n must be a prime number.

Let's dry run the loop with n = 17:

For i = 2, i * i = 4. Since 4 is less than 17, the loop continues.
For i = 3, i * i = 9. Since 9 is less than 17, the loop continues.
For i = 4, i * i = 16. Since 16 is less than 17, the loop continues.
For i = 5, i * i = 25. Now, 25 is not less than 17, so the loop stops.
This demonstrates that by checking up to the square root, we've covered all possible divisors of 17 without needing to go further.
 */