// What is Prime Nunmber=>the number which is divisible by itself {it should not divisible by any number 
    // starting from "2" leaving "1"}

import java.util.*;
public class $2_PrimeNumber {
    public static boolean checkPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n=sc.nextInt();
        if(checkPrime(n)){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
    }
}

// import java.util.*;
// public class $2_PrimeNumber{
    
//     public static boolean checkPrime(int n){
//         for(int i=2;i<Math.sqrt(n);i++){
//             if(n%2==0){
//                 return false;
//             }
//         }return true;
//     }
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int num=sc.nextInt();;
//        if(checkPrime(num)){
//         System.out.println("even number");
//        } 
//        else{
//         System.out.println("not a prime number");
//        }
//     }
// }
