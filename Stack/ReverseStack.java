import java.util.Stack;
public class ReverseStack {
    public static void main(String args[]){
        Stack<Character> stack =new Stack<>();

        String str= "manish";

        for(int i=0;i<str.length();i++){
            stack.push(str.charAt(i));
        }

        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
