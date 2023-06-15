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
