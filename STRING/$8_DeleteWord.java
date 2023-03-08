package STRING;

import java.util.*;
public class $8_DeleteWord {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str=sc.nextLine();
        System.out.print("Enter the word want to remove: ");
        String word=sc.nextLine();
        String stk="";
        for(int i=0;i<str.length();i++){
            stk=str.replaceAll(word, "");
        }System.out.println(stk);
    }
}
