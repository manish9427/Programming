/*
input/output
1634 => 1**4 + 6**4 + 3**4 + 4**4 === 1634
153
*/

function Armstrong(num) {
  const numString = num.toString();
  const len = numString.length;

  let sum = 0;

  for (let i = 0; i < len; i++) {
    let digit = parseInt(numString[i]);
    sum += Math.pow(digit, len);
  }
  return sum === num;
}
console.log(Armstrong(153));
