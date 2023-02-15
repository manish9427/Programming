import java.util.*;
public class $4_Anagrams
{
    public static boolean Anagram(String str1,String str2){
        char[] array1=str1.toCharArray();
        char[] array2=str2.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        str1=new String(array1);
        str2=new String(array2);
        if(str1.length()!=str2.length()){
            return false;
        }else{
            for(int i=0;i<str1.length();i++){
                if(str1.charAt(i)!=str2.charAt(i)){
                    return false;
                }
            }
        }return true;
    } 
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first String:");
        String str1=sc.nextLine();
        System.out.print("Enter the second String:");
        String str2=sc.nextLine();
        if(Anagram(str1,str2)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }
    }
}
