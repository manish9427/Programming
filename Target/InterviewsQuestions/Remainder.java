// find the remainder without using % and /
// input
// dividend = 15
// divisior = 5
// output
// result = 0


// === finding quotient and reminder without using % and / ====================================

import java.util.Scanner;
public class Remainder{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Input");
        System.out.print("dividend = ");
        int dividend=sc.nextInt();
        System.out.print("divisor = ");
        int divisor=sc.nextInt();
        int remeinder = findRemainder(dividend,divisor);
        int quotient= findQuoitent(dividend,divisor);

        System.out.println("Output");
        System.out.println("Remeinder = "+remeinder);
        System.out.println("Quotient = "+quotient);

    }

    public static int findRemainder(int dividend,int divisior){
        while(dividend>=divisior){
            dividend=dividend-divisior;
        }return dividend;
    }
    public static int findQuoitent(int dividend,int divisior){
        int quotient=0;
        while(dividend>=divisior){
            dividend=dividend-divisior;
            quotient++;
        }return quotient;
    }
}



// === finding quotient and reminder with user input ====================================

// import java.util.*;
// public class Remainder {
//     public static void main(String args[]){
//         Scanner sc=new Scanner (System.in);
//         System.out.println("Input");
//         System.out.print("dividend = ");
//         int dividend=sc.nextInt();
//         System.out.print("divisor = ");
//         int divisor=sc.nextInt();
//         int remainder=dividend%divisor;
//         int quotient=dividend/divisor;
//         System.out.println("Output");
//         System.out.println("remainder =  "+remainder);
//         System.out.println("quotient = "+quotient);
//     }
// }

// === finding quotient and reminder ====================================

// public class Remainder {
//     public static void main(String args[]){
//         int dividend=1;
//         int divisor=5;
//         int remainder=dividend%divisor;
//         int quotient=dividend/divisor;
//         System.out.println("remainder =  "+remainder);
//         System.out.println("quotient = "+quotient);
//     }
// }
