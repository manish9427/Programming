import java.util.*;
public class $2_FindLength {


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str=sc.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++){
            count++;
        }
        System.out.print("length "+count);
    }
}


