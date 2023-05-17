// import java.util.*;
// public class ValidParentheses {
//     public static void main(String[] args) {
//     String str = "(]";
//     if (isValid(str)) {
//     System.out.println("Valid Parentheses");
//     } else {
//     System.out.println("Not a Valid Parentheses");
//     }
//     }
//     public static boolean isValid(String s) {
//         Stack<Character> st = new Stack<>();
//         for (int i = 0; i < s.length(); i++) {
//             char c = s.charAt(i);
//             if (c == '(' || c == '{' || c == '[') {
//                 st.push(c);
//             } else {
//                 if (st.isEmpty()) {
//                     return false;
//                 }
//                 if ((st.peek() == '(' && c == ')') ||
//                         (st.peek() == '{' && c == '}') ||
//                         (st.peek() == '[' && c == ']')) {
//                     st.pop();
//                 } else {
//                     return false;
//                 }
//             }
//         }
//         return st.isEmpty();
//     }

    // TC=>O(n)
    // SC=>O(n)


    // public static boolean isValid(String s) {
    //     while (s.contains("()") || s.contains("{}") || s.contains("[]")) {
    //         s = s.replace("()", "").replace("{}", "").replace("[]", "");
    //     }
    //     return s.isEmpty();
    // }

    // TC=>O(n^2)
    // SC=>O(n)

// }

import java.util.*;

class ValidParentheses {
    public static void main(String[] args) {
        String str = "(]";
        if (isValid(str)) {
        System.out.println("Valid Parentheses");
        } else {
        System.out.println("Not a Valid Parentheses");
        }
        }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> mapping = new HashMap<>();
        mapping.put(')', '(');
        mapping.put('}', '{');
        mapping.put(']', '[');

        for (char c : s.toCharArray()) {
            if (mapping.containsValue(c)) { // Opening parenthesis
                stack.push(c);
            } else if (mapping.containsKey(c)) { // Closing parenthesis
                if (stack.isEmpty() || stack.pop() != mapping.get(c)) {
                    return false;
                }
            }
        }

        return stack.isEmpty(); // If stack is empty, all parentheses are valid
    }
}







