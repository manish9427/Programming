import java.util.*;
public class Armstrong{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the Number: ");
        int number = sc.nextInt();
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number");
        } else {
            System.out.println(number + " is not an Armstrong number");
        }

    }
    public static boolean isArmstrong(int number) {
        int n = 0;
        int temp = number;
        while (temp > 0) {
            n++;
            temp /= 10;
        }
        int sum = 0;
        temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            int power = 1;
            for (int i = 0; i < n; i++) {
                power *= digit;
            }
            sum += power;
            temp /= 10;
        }
        return sum == number;
    }
}
