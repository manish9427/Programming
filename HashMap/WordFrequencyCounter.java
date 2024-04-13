// import java.util.*;

// public class WordFrequencyCounter {
//     public static void main(String[] args) {
//         // Create a hash map to store word frequencies
//         Map<String, Integer> wordFreq = new HashMap<>();
        
//         // Sample text
//         String text = "the quick brown fox jumps over the lazy dog";
        
//         // Split text into words and count their frequency
//         String[] words = text.split("\\s+");
//         for (int i = 0; i < words.length; i++) {
//             String word = words[i];
//             if (wordFreq.containsKey(word)) {
//                 wordFreq.put(word, wordFreq.get(word) + 1);
//             } else {
//                 wordFreq.put(word, 1);
//             }
//         }
        
//         // Print out word frequencies
//         System.out.println("Word frequencies:");
//         for (Map.Entry<String, Integer> entry : wordFreq.entrySet()) {
//             System.out.println(entry.getKey() + ": " + entry.getValue());
//         }
//     }
// }

import java.util.*; 
public class WordFrequencyCounter { 

    public static void main(String[] args) { 

        // Create a hash map to store word frequencies 

        Map<String, Integer> wordFreq = new HashMap<>(); 

         

        // Read in text input from user 

        Scanner scanner = new Scanner(System.in); 

        System.out.println("Enter text: "); 

        String text = scanner.nextLine(); 

         

        // Split text into words and count their frequency 

        String[] words = text.split("\\s+"); 

        for (String word : words) { 

            if (wordFreq.containsKey(word)) { 

                wordFreq.put(word, wordFreq.get(word) + 1); 

            } else { 

                wordFreq.put(word, 1); 

            } 

        } 

         

        // Print out word frequencies 

        System.out.println("Word frequencies:"); 

        for (Map.Entry<String, Integer> entry : wordFreq.entrySet()) { 

            System.out.println(entry.getKey() + ": " + entry.getValue()); 

        } 

    } 

} 
