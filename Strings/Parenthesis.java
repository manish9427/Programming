package Strings;
import java.util.*;
public class Parenthesis {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the String: ");
        String str=sc.next();
        System.out.println("Output:-");
        if(isValid(str)){
            System.out.println("valid");
        }else{
            System.out.println("not valid");
        }

    }
    public static boolean isValid(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='('||ch=='{'||ch=='['){
                count ++;
            }else if(ch=='}'||ch==')'|ch==']'){
                count--;
            }
            if(count<0){
                return false;
            }
        }
        return count==0;
    }
}

/*
 * TC = O(n)
 * SC = O(n) 
 */