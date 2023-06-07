// find the remainder without using % and /
// input
// dividend = 15
// divisior = 5
// output
// result = 0

import java.util.*;
public class Remainder {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("Input");
        System.out.print("dividend = ");
        int dividend=sc.nextInt();
        System.out.print("divisor = ");
        int divisor=sc.nextInt();
        int remainder=dividend%divisor;
        int quotient=dividend/divisor;
        System.out.println("Output");
        System.out.println("remainder =  "+remainder);
        System.out.println("quotient = "+quotient);
    }
}

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
