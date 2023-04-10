package Strings;
import java.util.*;
public class Anagram{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        String str1=sc.next();
        String str2=sc.next();
        if(isAnagram(str1,str2)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }
    }

    public static boolean isAnagram(String str1,String str2){
        char[] ch1=str1.toCharArray();
        char[] ch2=str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if (ch1.length != ch2.length) {
            return false;
        }
    
        for (int i = 0; i < ch1.length; i++) {
            if (ch1[i] != ch2[i]) {
                return false; 
            }
        }
    
        return true; 

                        //   or
                        
        // return Arrays.equals(ch1,ch2);
    }
}