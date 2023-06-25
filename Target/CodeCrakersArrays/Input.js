const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

console.log("Input:-");

const readArray = () => {
  return new Promise((resolve) => {
    rl.question("Enter the size of the Array: ", (size) => {
      console.log(`Enter the ${size} elements in the array:`);
      let arr = [];

      const readElement = () => {
        rl.question("Enter an element: ", (element) => {
          arr.push(parseInt(element));
          if (arr.length < size) {
            readElement();
          } else {
            resolve(arr);
          }
        });
      };

      readElement();
    });
  });
};

readArray().then((arr) => {
  console.log("Output:-");
  console.log("The array you have provided is:", arr.join(" "));
  rl.close();
});
