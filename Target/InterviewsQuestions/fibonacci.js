// var first = 0;
// var second = 1;
// var third;
// console.log(first, second);
// function fucName(n) {
//   for (var i = 2; i < n; i++) {
//     third = first + second;
//     console.log(third);
//     first = second;
//     second = third;
//   }
// }
// fucName(5);

var first = 0;
var second = 1;
var third;
var output = first + " " + second;

function fucName(n) {
  for (var i = 2; i < n; i++) {
    third = first + second;
    output += " " + third;
    first = second;
    second = third;
  }
}

fucName(5);
console.log(output);
