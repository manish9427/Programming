import java.util.*;
public class Factorial {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the Number: ");
        int n=sc.nextInt(); // Outpt is 120 => 5*4*3*2*1
        int num=1;

        if(n<0){
            System.out.println("Enter Valid Number");
        }else{
            for(int i=2;i<=n;i++){
                num=num*i;
            }
            System.out.println(num);
        }
    }
}
