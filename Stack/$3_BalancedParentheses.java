import java.util.*;

public class $3_BalancedParentheses {

    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str=sc.nextLine();

        if(isBalanced(str)){
            System.out.println("Balanced Parentheses");
        }else{
            System.out.println("Unbalanced Balanced");
        }
    }
}
