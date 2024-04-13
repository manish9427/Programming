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


// import java.util.*;
// public class characterOccurence  {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the String: ");
//         String str=sc.nextLine();
//         HashMap <Character, Integer> hMap = new HashMap<>();
//         for (int i =0; i < str.length(); i++) {
//            if (hMap.containsKey(str.charAt(i))) {  //if the character is present in the map 
//               int count = hMap.get(str.charAt(i));  //get the value of key
//               hMap.put(str.charAt(i), ++count);   // increment
//            } else {
//               hMap.put(str.charAt(i),1);
//            }
//         }
//         System.out.println(hMap);
//     }
// }

// import java.util.*;

// public class characterOccurence {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the String: ");
//         String str = sc.nextLine();
//         Map<Character, Integer> charMap = new HashMap<>();
//         for (char c : str.toCharArray()) {
//             charMap.put(c, charMap.getOrDefault(c, 0) + 1);
//         }
//         System.out.println(charMap);
//     }
// }

// import java.util.*;

// public class characterOccurence {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the String: ");
//         String str = sc.nextLine();
//         int[] charCount = new int[256];
//         for (int i = 0; i < str.length(); i++) {
//             charCount[str.charAt(i)]++;
//         }
//         for (int i = 0; i < charCount.length; i++) {
//             if (charCount[i] > 0) {
//                 System.out.printf("%c=%d\n", i, charCount[i]);
//             }
//         }
//     }
// }

// import java.util.*;

// public class characterOccurence {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the String: ");
//         String str = sc.nextLine();
//         Map<Character, Integer> charMap = new HashMap<>();
//         for (char c : str.toCharArray()) {
//             if (charMap.containsKey(c)) {
//                 charMap.put(c, charMap.get(c) + 1);
//             } else {
//                 charMap.put(c, 1);
//             }
//         }
//         for (char c : charMap.keySet()) {
//             System.out.printf("%c=%d\n", c, charMap.get(c));
//         }
//     }
// }

import java.util.*;

public class characterOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        Map<Character, Integer> charMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (charMap.containsKey(c)) {
                charMap.put(c, charMap.get(c) + 1);
            } else {
                charMap.put(c, 1);
            }
        }
      //   for (char c : charMap.keySet()) {
      //       System.out.printf("%c=%d\n", c, charMap.get(c));
      //   }
        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
         System.out.println(entry.getKey() + ": " + entry.getValue());
     }
     
    }
}

// import java.util.*;

// public class CharacterOccurrence {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the string: ");
//         String inputString = sc.nextLine();
        
//         // Create an empty map to store the character frequency
//         Map<Character, Integer> frequencyMap = new HashMap<>();

//         // Loop through each character in the input string
//         for (int i = 0; i < inputString.length(); i++) {
//             char currentChar = inputString.charAt(i);
            
//             // If the character is already in the map, increment its frequency by 1
//             if (frequencyMap.containsKey(currentChar)) {
//                 int currentFrequency = frequencyMap.get(currentChar);
//                 frequencyMap.put(currentChar, currentFrequency + 1);
//             } 
//             // If the character is not in the map, add it with a frequency of 1
//             else {
//                 frequencyMap.put(currentChar, 1);
//             }
//         }

//         // Print the frequency of each character in the input string
//         for (char c : frequencyMap.keySet()) {
//             System.out.println(c + ": " + frequencyMap.get(c));
//         }
//     }
// }
