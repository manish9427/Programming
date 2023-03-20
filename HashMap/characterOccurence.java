package HashMap;


//input --> yoyo
//output 
// --> y=2
// --> o=2

/* 
In order to find occurence of each character in a string we can use Map utility of Java.
In Map a key could not be duplicate so make each character of string as key of Map 
and provide initial value corresponding to each key as 1 if this character does not inserted in map before.
Now when a character repeats during insertion as key in Map increase its value by one.
Continue this for each character untill all characters of string get inserted.
*/


// import java.util.*;
// public class characterOccurence {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the String: ");
//         String str=sc.nextLine();
//         HashMap <Character, Integer> hMap = new HashMap<>();
//         for (int i = str.length() - 1; i >= 0; i--) {
//            if (hMap.containsKey(str.charAt(i))) {
//               int count = hMap.get(str.charAt(i));
//               hMap.put(str.charAt(i), ++count);
//            } else {
//               hMap.put(str.charAt(i),1);
//            }
//         }
//         System.out.println(hMap);
//     }
// }


import java.util.*;
public class characterOccurence  {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str=sc.nextLine();
        HashMap <Character, Integer> hMap = new HashMap<>();
        for (int i =0; i < str.length(); i++) {
           if (hMap.containsKey(str.charAt(i))) {  //if the character is present in the map 
              int count = hMap.get(str.charAt(i));  //get the value of key
              hMap.put(str.charAt(i), ++count);   // increment
           } else {
              hMap.put(str.charAt(i),1);
           }
        }
        System.out.println(hMap);
    }
}
