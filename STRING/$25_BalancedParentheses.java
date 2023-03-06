// {}()[]if these are equall in number means balanced parenthesis
package STRING;

import java.util.*;
public class $25_BalancedParentheses {

    public static boolean isBalanced(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '('||c=='{'||c=='[') {
                count++;
            } else if (c == ')'||c=='}'||c==']') {
                count--;
            }
            if (count < 0) {
                return false;
            }
        }
        return count == 0;
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
