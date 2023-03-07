package STRING;

// import java.util.*;
// public class $5_ConcatenateString {
    
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the first string: ");
//         String str1=sc.nextLine();
//         System.out.print("Enter the Second string: ");
//         String str2=sc.nextLine();
//         for(int i=0;i<str2.length();i++){
//             str1=str1+str2.charAt(i);
//         }
//         System.out.println("Concatenated String: "+str1);
//     }
// }

// -----------------------------concat()-------------

import java.util.*;
public class $5_ConcatenateString {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1=sc.nextLine();
        System.out.print("Enter the Second string: ");
        String str2=sc.nextLine();
            str1=str1.concat(str2);
        System.out.println("Concatenated String: "+str1);
    }
}