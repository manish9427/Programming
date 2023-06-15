/**
 * Given an array [“123f”, “1dsa12”, “1212ds”, “65fd”, “sadfa”, “asdasd”]
 * Each item can contain 0-9, a-z, A-Z where a-z, A-Z characters are unwanted
 * Sum of all the numbers after removing all the unwanted characters 123+112+1212+65
 **/

const array = ["123f", "1dsa12", "1212ds", "65fd", "sadfa", "asdasd"];

function sumOfNumbers(array) {
  let sum = 0;

  for (let i = 0; i < array.length; i++) {
    let digit = array[i].replace(/\D/g, "");
    if (digit) {
      sum += parseInt(digit);
    }
  }
  return sum;
}

const result = sumOfNumbers(array);
console.log(result); // Output: 1512

/*

Certainly! In regular expressions, the \D pattern is a shorthand character class that matches any non-digit character. It is the opposite of \d, which matches any digit character.

The /g flag at the end of the regular expression is the global flag. It indicates that the pattern should be applied globally throughout the entire input string. Without the /g flag, the replace function would only replace the first occurrence of the pattern.

So, when you use /\D/g as the pattern in the replace function, it will match all non-digit characters in the input string and replace them according to the specified replacement value.

*/
