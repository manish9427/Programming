import java.util.*;
public class RemoveDuplicateLetters{
    public static void main(String args[]){
        String str="abcab";
        // output = abc
        System.out.println(Solution(str));
    }
    public static String Solution(String str){
        HashMap<Character,Integer>map=new HashMap<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            map.put(str.charAt(i),i);
        }

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if()
        }

        return str;
    }
}