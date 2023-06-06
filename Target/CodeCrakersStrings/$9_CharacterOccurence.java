package Strings;

import java.util.*;
public class $9_CharacterOccurence {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str=sc.nextLine();
        System.out.print("Enter the Charcter to find its Frequency: ");
        char ch=sc.next().charAt(0);
        int count=0;
        for(int i=0;i<str.length();i++){
            if(ch==str.charAt(i)){
                count++;
            }
        }
        if(count!=0){
            System.out.println("Frequency: " + count);
        }else{
            System.out.println("Not found");
        }
    }
}
