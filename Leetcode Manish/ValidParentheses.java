import java.util.*;
public class ValidParentheses {
    public static void main(String[] args) {
    String str = "(]";
    if (isValid(str)) {
    System.out.println("Valid Parentheses");
    } else {
    System.out.println("Not a Valid Parentheses");
    }
    }
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else {
                if (st.isEmpty()) {
                    return false;
                }
                if ((st.peek() == '(' && c == ')') ||
                        (st.peek() == '{' && c == '}') ||
                        (st.peek() == '[' && c == ']')) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}