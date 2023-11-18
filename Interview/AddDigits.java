/*
 Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

Example 1:

Input: num = 38

Output: 2

Explanation: The process is 38->3+8-> 11 11-1+1->2 Since 2 has only one digit, return it.

Example 2:

Input: num = 0

Output: 0

Constraints: 0 <= num <= 231-1

Follow up: Could you do it without any loop/recursion in O(1) runtime?
*/




// public class AddDigits {

//     public int Solution(int num) {
  
//       if(num == 0) {
//         return 0;
//       }
  
//       if(num % 9 == 0) {
//         return 9; 
//       }
  
//       return num % 9;
  
//     }
  
//     public static void main(String[] args) {
  
//       AddDigits solution = new AddDigits();
  
//       int num1 = 38;
//       int num2 = 0;
  
//       System.out.println(solution.Solution(num1)); // Prints 2
//       System.out.println(solution.Solution(num2)); // Prints 0
  
//     }
  
//   }

public class AddDigits{
  public static void main(String args[]){
    int num=10;
    if(num<10){
      System.out.println(num);
    }

    while(num>=10){
      int sum=0;
      while(num>0){
        sum=sum+num%10;
        num=num/10;
      }
      num=sum;
    }
    System.out.println(num);
  }
}