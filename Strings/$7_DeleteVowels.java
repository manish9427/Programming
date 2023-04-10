package Strings;

import java.util.*;
public class $7_DeleteVowels {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str=sc.nextLine();
        System.out.print("Enter the word want to remove: ");
        String word=sc.nextLine();
        String stk="";
        for(int i=0;i<str.length();i++){
           char c=str.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                continue;
            }else{
                stk=stk+str.charAt(i);
            }
        }System.out.println(stk);
    }
}
