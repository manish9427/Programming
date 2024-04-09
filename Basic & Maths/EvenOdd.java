import java.util.Scanner;
class EvenOdd{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in); 
        System.out.print("Enter the Number: ");
        int n=sc.nextInt();
        if(n<0){
            System.out.println("Enter Valid Number: ");
        }else{
            if(n%2==0){
                System.out.println("Even Number: "+n);
            }else{
                System.out.println("Odd Number: "+n);
            }
        }
    }
}