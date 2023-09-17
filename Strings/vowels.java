
import java.util.*;
public class vowels {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:-");
        String str = sc.nextLine();
        str = str.toLowerCase();
        int count =0;
        int ct=0;
        int x=0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
                System.out.println(ch + " is a vowel.");
            } else if (ch >= 'a' && ch <= 'z') {
                ct++;
                System.out.println(ch + " is a consonant.");
            } else {
                x++;
                System.out.println(ch + " is not a letter.");
            }
        }
        System.out.println("total vowels = "+count);
        System.out.println("total consonant = "+ct);
        System.out.println("total space = "+x);
    }
}

// count vowels and consonant in the given string