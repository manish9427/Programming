    
import java.util.*;
public class Fibonacci{

    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    //brute force
    //logic
    // first=0
    // second=1
    // third=first+second;
    System.out.print("Enter first Number: ");
    int first=sc.nextInt();
    System.out.print("Enter second Number: ");
    int second=sc.nextInt();
    System.out.print("Enter the number of terms: ");
    int n=sc.nextInt();
    n=n-2;
    int third=0;
    while(n>0){
        first=second;
        second=third;
        third=first+second;
        System.out.println(third);
        n--;

    }
    }
}