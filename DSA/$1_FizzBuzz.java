/*  What is fizz =>the number which is divisible by "3"
What is buzz =>the number which is divisible by "5"
 What is fizz-buzz =>the number which is divisible by "3" and "5"
this is printing all the number from 1 to {the number you have entered} and 
 telling that what number it is fizz-buzz or not */


// import java.util.*;
// class $1_FizzBuzz{
//     public static void solve(int n){
//         for(int i=1;i<=n;i++){
//             if(i%3==0 && i%5==0){
//                 System.out.print("Fizz-Buzz"+" ");
//             }
//             else if(i%3==0){
//                 System.out.print("Fizz"+" ");
//             }
//             else if(i%5==0){
//                 System.out.print("Buzz"+" ");
//             }
//             else{
//                 System.out.print(i+" ");
//             }
//         }
//     }
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the Number:");
//         int num=sc.nextInt(); 
//         solve(num);
//     }
// }


/*now i am creating the program which will only that  for that perticularly about that 
 specific number wheather it is fizz-buzz or not */

 
import java.util.*;
class $1_FizzBuzz{
    public static void solve(int n){
            if(n%3==0 && n%5==0){
                System.out.print("Fizz-Buzz"+" ");
            }
            else if(n%3==0){
                System.out.print("Fizz"+" ");
            }
            else if(n%5==0){
                System.out.print("Buzz"+" ");
            }
            else{
                System.out.print("Not a fizz buzz number");
            }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number:");
        int num=sc.nextInt(); 
        solve(num);
    }
}
