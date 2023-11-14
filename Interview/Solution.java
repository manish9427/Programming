public class Solution {

    public int addDigits(int num) {
        while(num >= 10) {
          int sum = 0;
          while(num > 0) {
            sum += num % 10;
            num /= 10;
          }
          num = sum;
        }
        
        return num;
      }

  public static void main(String[] args) {

    Solution solution = new Solution();

    int num1 = 38;
    int num2 = 0;

    System.out.println(solution.addDigits(num1)); // Prints 2
    System.out.println(solution.addDigits(num2)); // Prints 0

  }

}

// Recursive Approch

// public class Solution {

//     public int addDigits(int num) {
//         if(num < 10) {
//           return num;
//         }
      
//         int sum = 0;
//         while(num > 0) {
//           sum += num % 10;
//           num /= 10; 
//         }
      
//         return addDigits(sum); 
//       }

//   public static void main(String[] args) {

//     Solution solution = new Solution();

//     int num1 = 38;
//     int num2 = 0;

//     System.out.println(solution.addDigits(num1)); // Prints 2
//     System.out.println(solution.addDigits(num2)); // Prints 0

//   }

// }


// O(1) Approch

// public class Solution {

//   public int addDigits(int num) {

//     if(num == 0) {
//       return 0;
//     }

//     if(num % 9 == 0) {
//       return 9; 
//     }

//     return num % 9;

//   }

//   public static void main(String[] args) {

//     Solution solution = new Solution();

//     int num1 = 38;
//     int num2 = 0;

//     System.out.println(solution.addDigits(num1)); // Prints 2
//     System.out.println(solution.addDigits(num2)); // Prints 0

//   }

// }