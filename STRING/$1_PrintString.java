package STRING;

import java.util.*;
public class $1_PrintString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            System.out.print(ch+" ");
        }
    }
}
