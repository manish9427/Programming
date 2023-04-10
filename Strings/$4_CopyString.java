package Strings;

// import java.util.*;
// public class $4_CopyString {
    
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the String: ");
//         String str=sc.nextLine();
//         System.out.println("Original String: "+str);
//         String Copy=str;
//         System.out.println("Copied String: "+Copy);
//     }
// }

// ---------------------------valueOf()-------------------------String.valueOf()
import java.util.*;
public class $4_CopyString {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str=sc.nextLine();
        System.out.println("Original String: "+str);
        String Copy=String.valueOf(str);
        System.out.println("Copied String: "+Copy);
    }
}
