/* 
Count Number of Repeated Characters in a String
 input --> codecrakers
 output --> total repeated characters are 3 => hint-->{c,e,r}
*/

package Strings;

import java.util.*;
public class $13_countRepeatedChar {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str=sc.nextLine();
        int n=str.length();
        char ch;
        int rep=0;
        char[] arr=new char[n];
        for(int i=0;i<n;i++){
            arr[i] =str.charAt(i);
        }
        for(int i=0;i<n;i++){
            ch =arr[i];
            int count=0; 
            for(int j=(i+1);j<n;j++){
                if(ch==arr[j]){
                    count++;
                    for(int k=j;k<n-1;k++){
                        arr[k]=arr[k+1];
                    }
                    n--;
                    j--;
                }
            }
            if(count>0){
                rep++;
            }
        }
        System.out.println("repeated character in the string "+rep);
        
    }
}