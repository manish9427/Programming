// input --> aaabccddd
// output -->abd
package Stack;

import java.util.*;
public class $2_ReduceString {
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the String: ");
            String str=sc.nextLine();
            Stack<Character>st=new Stack<>();
            for(int i=0;i<str.length();i++){
                if(st.isEmpty()||st.peek()!=str.charAt(i)){
                    st.push(str.charAt(i));
                }else{
                    st.pop();
                }
            }
            // while(!st.isEmpty()){
            //     System.out.print(st.peek());  //dba
            //     st.pop();
            // }
            if(st.isEmpty()){
                System.out.println("String Empty");
            }else{
                String empty="";
                while(!st.isEmpty()){
                empty=st.peek()+empty;  //dba
                st.pop();
            }
            System.out.println(empty);            
            }
        }
    }
