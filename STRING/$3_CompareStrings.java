package STRING;

// import java.util.*;
// public class $3_CompareStrings {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the first String: ");
//         String str1=sc.nextLine();
//         System.out.print("Enter the Second String: ");
//         String str2=sc.nextLine();
//         int count =0;
//         if(str1.length()==str2.length()){

//             for(int i=0;i<str1.length();i++){
//                 if(str1.charAt(i)==str2.charAt(i)){
//                     count++;
//                 }else{
//                     System.out.println("Both are Different");
//                 }
//             }
//         }else{
//             System.out.println("Not Equal length");
//         }
//         if(count==str1.length()){
//             System.out.println("Both are Equals");
//         }
//     }
// }

// -------------------------- equals()  ----------------------------
// import java.util.*;
// public class $3_CompareStrings {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the first String: ");
//         String str1=sc.nextLine();
//         System.out.print("Enter the Second String: ");
//         String str2=sc.nextLine();
//         if(str1.equals(str2)){
//             System.out.println("Equals");
//         }else{
//             System.out.println(" Not Equals"); 

//         }
//     }
// }

// -------------------------- compareTo()  ----------------------------
import java.util.*;
public class $3_CompareStrings {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first String: ");
        String str1=sc.nextLine();
        System.out.print("Enter the Second String: ");
        String str2=sc.nextLine();
        if(str1.compareTo(str2)<0){
            System.out.println(str1+" is larger than "+str2);
        }else if(str1.compareTo(str2)>0){
            System.out.println(str1+" is smaller than "+str2); 

        }else{
            System.out.println("Equals");
        }
    }
}
    
    
