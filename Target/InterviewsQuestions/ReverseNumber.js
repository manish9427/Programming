/*
 * given n=123
 * output 321
 */

function ReverseNumber(n) {
  console.log("original " + n);
  let str = n.toString();
  let ans = "";
  for (let i = str.length - 1; i >= 0; i--) {
    ans += str.charAt(i);
  }
  return ans;
}
console.log("Reverse " + ReverseNumber(123));
