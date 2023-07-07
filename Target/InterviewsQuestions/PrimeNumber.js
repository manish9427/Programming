// 2 3 5 7 11 ....
/*
if n=5
output => 2 3 5 7 11
*/

function funcName(n) {
  var primes = [];
  var currentNumber = 2;

  while (primes.length < n) {
    var isPrime = true;

    for (var i = 2; i <= Math.sqrt(currentNumber); i++) {
      if (currentNumber % i === 0) {
        isPrime = false;
        break;
      }
    }

    if (isPrime) {
      primes.push(currentNumber);
    }
    currentNumber++;
  }
  console.log(primes.join(" "));
}
funcName(5);
