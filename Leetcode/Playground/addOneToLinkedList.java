/*
Given a linked list denoting a number (each key will have numbers from 0-9), implement addOne function which takes a list and add 1 to it.
Example - For number 7899, Linked List would be [7, 8, 9, 9]

If you add 1 to 7899, you get 7900 which is [7, 9, 0, 0]
*/

// let a = { digit: 7, next: null };
// let b = { digit: 8, next: null };
// let c = { digit: 9, next: null };
// let d = { digit: 9, next: null };

// a.next = b;
// b.next = c;
// c.next = d;

// let list = a;

// function printList(list) {
//     let arr = [], node = list;
//     while(node != null) {
//         arr.push(node.digit);
//         node = node.next;
//     }
//     console.log(arr);
// }

// printList(list); // [7, 8, 9, 9]

// function addOne(list) {
    
// }

// addOne(list);
// printList(list); // [7, 9, 0, 0]



// ---------------------------------solution in js--------------------------
// function addOne(list) {
//     let node = list;
//     let carry = 1; // start with 1 as we need to add 1 to the number
    
//     // Traverse the list from the last node
//     while(node != null) {
//         let sum = node.digit + carry;
//         if(sum < 10) {
//             // Update the node with the new value and return the list
//             node.digit = sum;
//             return list;
//         } else {
//             // Update the node with 0 and move to the previous node
//             node.digit = 0;
//             carry = 1;
//             node = node.next;
//         }
//     }
    
//     // If all nodes have been traversed and the carry is still 1, add a new node with value 1 at the beginning of the list
//     if(carry == 1) {
//         let newNode = { digit: 1, next: list };
//         list = newNode;
//     }
    
//     return list;
// }

// ------------------------------solution in java-----------------
// public class ListNode {
//     int digit;
//     ListNode next;

//     public ListNode(int digit) {
//         this.digit = digit;
//         this.next = null;
//     }
// }

// public ListNode addOne(ListNode list) {
//     ListNode node = list;
//     int carry = 1; // start with 1 as we need to add 1 to the number
    
//     // Traverse the list from the last node
//     while(node != null) {
//         int sum = node.digit + carry;
//         if(sum < 10) {
//             // Update the node with the new value and return the list
//             node.digit = sum;
//             return list;
//         } else {
//             // Update the node with 0 and move to the previous node
//             node.digit = 0;
//             carry = 1;
//             node = node.next;
//         }
//     }
    
//     // If all nodes have been traversed and the carry is still 1, add a new node with value 1 at the beginning of the list
//     if(carry == 1) {
//         ListNode newNode = new ListNode(1);
//         newNode.next = list;
//         list = newNode;
//     }
    
//     return list;
// }


// public static void main(String[] args) {
//     ListNode a = new ListNode(7);
//     ListNode b = new ListNode(8);
//     ListNode c = new ListNode(9);
//     ListNode d = new ListNode(9);

//     a.next = b;
//     b.next = c;
//     c.next = d;

//     ListNode list = a;

//     printList(list); // [7, 8, 9, 9]

//     list = addOne(list);

//     printList(list); // [7, 9, 0, 0]
// }

// public static void printList(ListNode list) {
//     List<Integer> arr = new ArrayList<>();
//     ListNode node = list;
//     while(node != null) {
//         arr.add(node.digit);
//         node = node.next;
//     }
//     System.out.println(arr);
// }
