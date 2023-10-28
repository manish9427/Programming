// input --> abadbcdabe
// output -->abcde

import java.util.Stack;
public class ReduceString {
        public static void main(String args[]){
            Stack<Character> stack =new Stack<>();
            String str="abcdabcde";
            StringBuilder sb=new StringBuilder();

            for(char c : str.toCharArray()){
                if(!stack.contains(c)){
                    stack.push(c);
                    sb.append(c);
                }
            }
            System.out.println(sb.toString());

        }
    }
