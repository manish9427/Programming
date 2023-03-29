import java.util.*;
public class Armstrong{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the Number: ");
        int number = sc.nextInt();
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number");
        } else {
            System.out.println(number + " is not an Armstrong number");
        }

    }
    public static boolean isArmstrong(int n) {  
        int digits=0, last=0, sum=0;   
        int temp=n;   
        while(temp>0){   
            temp = temp/10;   
            digits++;   
        }   
        temp = n;   
        while(temp>0)   {
            last = temp % 10;   
            sum +=  (Math.pow(last, digits));   
            temp = temp/10;   
        }  
        return n == sum; 
    }   
}
