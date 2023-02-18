package STRING;
import java.util.*;
public class $2_FindLength {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string: ");

        String str=sc.nextLine();
            // System.out.println("output: "+str.length());
            int len=0;
            char [] ch=str.toCharArray();
            for (char a:ch){
                len++;
            }
            System.out.println("output: "+len);
    }
}

