/* Examples 153 , 370 , 403 , 9474
 * n = count num of caracteres make that power with each character
 * 
 */



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
        int temp=n;   //153
        while(temp>0){   
            temp = temp/10;   //15
            digits++;   //1
        }   
        temp = n;   
        while(temp>0)   {
            last = temp % 10;   //3
            sum +=  (Math.pow(last, digits));   
            temp = temp/10;   
        }  
        return n == sum; 
    }   
}
