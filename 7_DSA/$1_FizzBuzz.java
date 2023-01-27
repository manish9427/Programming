import java.util.*;
class $1_FizzBuzz{
    public static void solve(int n){
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                System.out.print("Fizz-Buzz"+" ");
            }
            else if(i%3==0){
                System.out.print("Fizz"+" ");
            }
            else if(i%5==0){
                System.out.print("Buzz"+" ");
            }
            else{
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number:");
        int num=sc.nextInt(); 
        solve(num);
    }
}

