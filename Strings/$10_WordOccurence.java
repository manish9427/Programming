package Strings;

import java.util.*;
public class $10_WordOccurence {
            public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the String: ");
            String str=sc.nextLine();
            str=str.toLowerCase();
            System.out.print("Enter the word to find its Frequency: ");
            String word=sc.next();
            word=word.toLowerCase();

            String[] words=str.split(" ");


            int count=0;
            for(int i=0;i<words.length;i++){
                if(word.equals(words[i])){
                    count++;
                }
            }
            if(count==0){
                System.out.println("Not found");
            }else{
                System.out.println(word+" occurce only "+count+" times");
            }
        }
}