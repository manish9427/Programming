/**
 * Given an array [2, 4, 2, 5, 3, 6, 3] and a size n
 * Chunk the array into smaller size arrays such that no subarray is greater than size n
 **/

function chunkArray(arr, n) {
  const result = [];
  let subarray = [];

  for (let i = 0; i < arr.length; i++) {
    subarray.push(arr[i]);

    if (subarray.length === n || i === arr.length - 1) {
      result.push(subarray);
      subarray = [];
    }
  }

  return result;
}

const array = [2, 4, 2, 5, 3, 6, 3];
const chunkSize = 3;
const chunkedArray = chunkArray(array, chunkSize);

console.log(chunkedArray);
