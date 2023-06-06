package Strings;

import java.util.*;
public class $12_EachWordOccurence {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str=sc.nextLine();
        String[] words=str.split(" ");
        HashMap <String, Integer> map = new HashMap<>();
        for (int i =0; i < words.length; i++) {
            if(map.containsKey(words[i])){
                int count=map.get(words[i]);
                map.put(words[i],++count);
            }else{
                map.put(words[i],1);
            }
        }
        System.out.println(map);
    }
}