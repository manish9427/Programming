package Playground;
/**
 * Given an array [“123f”, “1dsa12”, “1212ds”, “65fd”, “sadfa”, “asdasd”]
 * Each item can contain 0-9, a-z, A-Z where a-z, A-Z characters are unwanted
 * Sum of all the numbers after removing all the unwanted characters 123+112+1212+65
**/

// const sumArr = (arr) => {
//     let ans=0;
//     for(let i=0;i<arr.length;i++){
//         let temp="";
//         let s=(arr[i]);
//         for(let i of s){
//             if(parseInt(i)>=0 && parseInt(i)<=9){
//                 temp+=i;
//             }
//         }
//         ans+=Number(temp);
//     }
//     return ans;
    
// };


// const sumArr = (array) => {
//     let total = 0;
    
//     for (let i = 0; i < array.length; i++) {
//         let digits = array[i].replace(/\D/g, '');
//         if (digits) {
//             total += parseInt(digits);
//         }
//     }
//         return total;
        
//     };



// console.log(sumArr(["123f", "1dsa12", "1212ds", "65fd", "sadfa", "asdasd"])); // 1512
// console.log(sumArr(["asdasd"])); // 0
// console.log(sumArr(["asdasd12"])); // 12
// console.log(sumArr(["12"])); // 12


public class unwantedchar {
    public static void main(String args[]) {
        String arr[] = {"123f", "1dsa12", "1212ds", "65fd", "sadfa", "asdasd"};
        int total=0;
        for(int i=0;i<arr.length;i++){
            String str=arr[i];
            String digits =str.replaceAll("[^0-9]", "");
                if(digits.length()!=0){
                    total  +=Integer.valueOf(digits);
                }
            }
            System.out.println(total); 
        }
}
// import java.util.Arrays;

// public class unwantedchar {
//     public static void main(String[] args) {
//         String[] array = {"123f", "1dsa12", "1212ds", "65fd", "sadfa", "asdasd"};
//         int total = 0;
//         for (String element : array) {
//             String digits = element.replaceAll("[^\\d]", "");
//             if (!digits.isEmpty()) {
//                 total += Integer.parseInt(digits);
//             }
//         }
//         System.out.println(total);
//     }
// }


// import java.util.Arrays;

// public class unwantedchar {
//     public static void main(String[] args) {
//         String[] array = {"123f", "1dsa12", "1212ds", "65fd", "sadfa", "asdasd"};
//         int total = 0;
//         for (int i = 0; i < array.length; i++) {
//             String element = array[i];
//             String digits = element.replaceAll("[^0-9]", "");
//             if (!digits.isEmpty()) {
//                 total += Integer.parseInt(digits);
//             }
//         }
//         System.out.println(total);
//     }
// }


/*The code uses a regular expression (/\D/g) to replace all non-numeric characters in each string with an empty string, effectively removing them. The resulting string of digits is then parsed as an integer using the parseInt() function and added to the total if it is not empty. The for loop iterates over each element in the array */
// if (digits.isEmpty()) {
//     // do something if digits is empty
//  }