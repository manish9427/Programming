package Strings;

// import java.util.*;
// public class $6_ReverseString {
    
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the String: ");
//         String str=sc.nextLine();
//         String stk="";
//         for(int i=0;i<str.length();i++){
//             stk=str.charAt(i)+stk;
//         }
//         System.out.println(stk);
//     }
// }

import java.util.*;
public class $6_ReverseString {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str=sc.nextLine();
        String stk="";
        for(int i=str.length()-1;i>=0;i--){
            stk=stk+str.charAt(i);
        }
        System.out.println(stk);
    }
}

