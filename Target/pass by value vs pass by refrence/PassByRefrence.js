function change(obj) {
  obj.value = 5;
}

let data = { value: 10 };

change(data);

console.log(data); // 5 value change
